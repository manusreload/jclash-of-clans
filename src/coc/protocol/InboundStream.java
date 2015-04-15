package coc.protocol;

import coc.Utils;
import coc.protocol.messages.MessageFactory;

/**
 * Process message from server (decryption)
 *
 * @author manus
 */
public class InboundStream extends Stream {

    public InboundStream() {
    }
    
    @Override
    public int queue(int maxMessages) {
        int total = 0;
        stream.reset();
        while (!stream.isEnd()) {
            int messageType = (int) stream.read(2, true);
            int messageSize = (int) stream.read(2);
            messageSize += stream.read(2);
            stream.skip();
            if(stream.isEnd(messageSize)) return total;
            byte[] payload = stream.clone(messageSize);
            byte[] data = rc4.encrypt(payload, false);
//            byte[] data = xor(payload, key);
            if(Constants.DEBUG_PACKETS)
            {
                System.out.println("Message: " + messageType);
                Utils.displayBytes(data);
            }
            Message message = MessageFactory.get(messageType);
            if (message != null) {
                if(message.parse(new ByteStream(data)))
                {
                    
                    messages.add(message);
                    if (messageListener != null) {
                        messageListener.onMessage(this, message);
                    }
                    total++;
                }
                else
                {
                    System.out.println("Error parsing message " + messageType + " at field[" + message.getIndexError() + "]: " + message.getFieldError());
                }
            }
            stream.flush();
            if (maxMessages > 0 && total == maxMessages) {
                break;
            }
        }
        System.out.println("Total messages: " + total + " " + stream.getSize());
        return total;
    }

}
