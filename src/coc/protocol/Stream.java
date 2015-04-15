package coc.protocol;

import coc.RC4;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manus
 */
public abstract class Stream {

    public interface OnMessageListener {

        public void onMessage(Stream stream, Message message);
    }
    public interface OnDataListener {
        public boolean onData(Stream stream, ByteStream data);
    }
    OnMessageListener messageListener = null;
    OnDataListener dataListenner = null;
    ByteStream stream = new ByteStream();
    RC4 rc4 = null;
    List<Message> messages = new ArrayList<>();

    public Stream() {
        setRc4Key((Constants.RC4_KEY + "nonce").getBytes());
    }

    public void update(byte[] data) {
        update(data, data.length);
    }
    public void update(byte[] data, int leng) {
        stream.add(data, leng);
    }

    public void setDataListenner(OnDataListener dataListenner) {
        this.dataListenner = dataListenner;
    }

    public void setMessageListener(OnMessageListener messageListener) {
        this.messageListener = messageListener;
    }

    public int queue() {
        return queue(0);
    }
    
    public abstract int queue(int maxMessages);

    public byte[] xor(byte[] data, byte[] key) {
        return xor(data, key,0, data.length);
    }

    public byte[] xor(byte[] data, byte[] key,int offset, int leng) {
        byte[] tmp = new byte[leng];
        for (int i = 0; i < leng; i++) {
            tmp[i] = (byte) (data[i + offset] ^ key[i % key.length]);
        }
        return tmp;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setRc4Key(byte[] key) {
        this.rc4 = new RC4(key);
        rc4.generate(rc4.getKeylen());
        
    }
    
    
}
