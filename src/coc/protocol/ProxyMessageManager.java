package coc.protocol;

import coc.RC4;
import java.util.Base64;

/**
 *
 * @author manus
 */


public class ProxyMessageManager extends MessageManager implements Stream.OnMessageListener {

    public ProxyMessageManager() {
        
        send = new InboundStream();
        recv.setMessageListener(this);
        send.setMessageListener(this);
    }

    
    @Override
    public boolean init() {
        if(send.getMessages().size() >= 1 || send.queue(1) == 1)
        {
            Message loginMessage = send.getMessages().get(0);
            long seed = loginMessage.getField(20).getLong();
            Scramble scramble = new Scramble((int) seed);
            
            if(recv.getMessages().size() >= 1 || recv.queue(1) == 1)
            {
                Message encriptionMessage = recv.getMessages().get(0);
                byte[] severRandom = encriptionMessage.getField(0).getRaw();
                byte[] nonce = scramble.getScramble(severRandom);
                byte[] key = ByteUtils.join(Constants.RC4_KEY.getBytes(), nonce );
                send.setRc4Key(key);
                recv.setRc4Key(key);
                return true;
            }
        }
        return false;
    }
    
    
    

    @Override
    public void onMessage(Stream stream, Message message) {
        if(stream == recv)
        {
            System.out.println("Message from server: " + message.messageType);
        }
        else
        {
            System.out.println("Message from client: " + message.messageType);
        }
        message.dump();
    }
}
