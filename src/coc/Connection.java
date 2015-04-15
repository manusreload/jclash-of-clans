package coc;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manus
 */


public class Connection {
    
    Socket socket;
    public boolean connect()
    {
        try {
            socket = new Socket("game.clashofclans.com", 4000);
            run();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private void run()
    {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    DataInputStream in = new DataInputStream(socket.getInputStream());
                    byte[] buffer = new byte[1024 * 5];
                    int leng = 0;
                    while((leng = in.read(buffer)) > 0)
                    {
                        Utils.displayBytes(buffer, leng);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
