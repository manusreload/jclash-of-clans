package coc.filesystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author manus
 */
public class WireSharkCapture {

    byte[] send;
    byte[] recv;

    public WireSharkCapture() {

    }
    
    private byte[] loadFile(File file)
    {
        try {
            List<Byte> items = new ArrayList<>();
            byte[] buffer = new byte[1024];
            int leng = 0;
            FileInputStream in = new FileInputStream(file);
            while((leng = in.read(buffer)) > 0)
            {
                for(int i = 0; i < leng; i++)
                {
                    items.add(buffer[i]);
                }
            }
            
            byte[] result = new byte[items.size()];
            for (int i = 0; i < items.size(); i++) {
                result[i] = items.get(i);
            }
            return result;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WireSharkCapture.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WireSharkCapture.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean loadRaw(File send, File recv) {
        
        if((this.send = loadFile(send)) != null)
        {
            if((this.recv = loadFile(recv)) != null)
            {
                return true;
            }
        }
        return false;
    }

    public boolean loadHex(File file) {
        byte[] data = new byte[0];
        try {
            Scanner scanner = new Scanner(file);
            String line;
            List<Byte> itemsSend = new ArrayList<>();
            List<Byte> itemsReceived = new ArrayList<>();
            boolean send = true;
            while (scanner.hasNextLine() && (line = scanner.nextLine()) != null) {
                if (line.length() > 0) {
                    if (line.charAt(0) == ' ') {
                        send = false;
                        line = line.substring(4);
                    } else {
                        send = true;
                    }
                    line = line.substring(8);
                    line = line.substring(0, line.length() - 17);
                    Matcher matcher = Pattern.compile("([a-f0-9]{2})").matcher(line);
                    while (matcher.find()) {
                        if (send) {
                            itemsSend.add(parseByte(matcher.group(0), 16));
                        } else {
                            itemsReceived.add(parseByte(matcher.group(0), 16));
                        }
                    }
                }

            }

            this.recv = new byte[itemsReceived.size()];
            for (int i = 0; i < itemsReceived.size(); i++) {
                this.recv[i] = itemsReceived.get(i).byteValue();
            }

            this.send = new byte[itemsSend.size()];
            for (int i = 0; i < itemsSend.size(); i++) {
                this.send[i] = itemsSend.get(i).byteValue();
            }
            scanner.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WireSharkCapture.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public byte parseByte(String number, int base) {
        int n = Integer.parseInt(number, base);

        byte data = (byte) n;
        if (n > 127) {

        }
        return data;

    }

    public byte[] getRecv() {
        return recv;
    }

    public byte[] getSend() {
        return send;
    }

}
