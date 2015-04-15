package coc.protocol.connection;

import coc.protocol.Message;
import coc.protocol.Stream;
import coc.protocol.StreamMessageManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manus
 */
public class SocketConnection implements Stream.OnMessageListener {

    private String host;
    private int port;
    private StreamMessageManager manager;
    private Socket socket;

    private InputStream input;
    private OutputStream output;

    public SocketConnection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public boolean connect() {
        try {
            socket = new Socket(host, port);
            input = socket.getInputStream();
            output = socket.getOutputStream();
            manager = new StreamMessageManager(input, output);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean send(Message message) {
        return manager.send(message);
    }

    public void runOnThread(final Message loginMessage) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                run();
            }
        }).start();
    }

    public void run(Message loginMessage) {
        if (manager.init(loginMessage)) {
            manager.run();
        }
    }

    @Override
    public void onMessage(Stream stream, Message message) {
        System.out.println("New message: " + message.getMessageType());
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void sendMessageInterval(final Message message, final int interval) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(0);
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    while (send(message)) {
                        try {
                            Thread.sleep(interval);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }).start();
    }

    public void close() {
        try {
            socket.close();
            input.close();
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
