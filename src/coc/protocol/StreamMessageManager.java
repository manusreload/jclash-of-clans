package coc.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manus
 */


public class StreamMessageManager extends MessageManager implements Stream.OnDataListener, Stream.OnMessageListener {
    InputStream input;
    OutputStream output;
    boolean loginMessageSent = false;
    public StreamMessageManager(InputStream input, OutputStream output) {
        this.input = input;
        this.output = output;
        send.setDataListenner(this);
        recv.setMessageListener(this);
        
    }

    public boolean init(Message loginMessage) {
        ((OutboundStream) send).update(loginMessage);
        if(send.queue(1) == 1)
        {
            if(read())
            {
                if(recv.queue(1) == 1)
                {
                    System.out.println("DONE!!!!!!!");
                    // encription message here!
                    Message encriptionMessage = recv.getMessages().get(0);
                    long seed = loginMessage.getField(20).getNumber();
                    Scramble scramble = new Scramble((int) seed);
                    byte[] severRandom = encriptionMessage.getField(0).getRaw();
                    byte[] nonce = scramble.getScramble(severRandom);
                    byte[] key = ByteUtils.join(Constants.RC4_KEY.getBytes(), nonce );
                    send.setRc4Key(key);
                    recv.setRc4Key(key);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void run() {
        try
        {
            while(read())
            {
                recv.queue();
            }
            
        }
        catch(Exception ex)
        {
            
        }
    }
    
    
    
    private boolean read()
    {
        try {
            byte[] buffer = new byte[1024];
            int leng = input.read(buffer);
            if(leng > 0)
            {
                recv(buffer, leng);
                return true;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
        
    }
    
    public boolean send(Message message)
    {
        System.out.println("Send Message: " + message.getMessageType());
        ((OutboundStream) send).update(message);
        return ((OutboundStream) send).queue() >= 1;
    }

    @Override
    public boolean onData(Stream stream, ByteStream data) {
        try {
            output.write(data.getData());
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void onMessage(Stream stream, Message message) {
        System.out.println("Recv Message: " + message.getMessageType());
        message.dump();
    }
    
    
    
    
    
    
}
