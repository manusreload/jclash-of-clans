package coc.protocol;

import coc.RC4;

/**
 *
 * @author manus
 */


public class MessageManager {
    Stream recv = new InboundStream();
    Stream send = new OutboundStream();
    
    public void recv(byte[] dataFromSerer)
    {
        recv(dataFromSerer, dataFromSerer.length);
    }
    public void recv(byte[] dataFromSerer, int leng)
    {
        recv.update(dataFromSerer, leng);
    }
    public void send(byte[] dataToSerer)
    {
        send(dataToSerer, dataToSerer.length);
    }
    public void send(byte[] dataToSerer, int leng)
    {
        send.update(dataToSerer, leng);
    }
    
    public boolean init()
    {
        return true;
    }
    
    public void run()
    {
        recv.queue();
        send.queue();
    }
}
