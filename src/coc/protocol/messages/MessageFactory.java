package coc.protocol.messages;

import coc.protocol.Field;
import coc.protocol.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author manus
 */
public class MessageFactory {

    public static final int MESSAGE_TYPE_LOGIN = 0x2775;
    public static final int MESSAGE_TYPE_KEEP_ALIVE = 0x277C;

    ////////// Server -> Client
    public static final int MESSAGE_TYPE_ENCRIPTION = 0x4E20;
    public static final int MESSAGE_TYPE_LOGIN_OK = 0x4E88;
    public static final int MESSAGE_TYPE_OWN_HOME_DATA = 0x5E25;

    public static final int LOGIC_TYPE_CLIENT_HOME = 0xFFFF0001;
//    public static final int LOGIC_TYPE_CLIENT_HOME = 0xFFFF0002;

    private static final List<Message> messages = new ArrayList<>();

    static {

        messages.add(new Message(LOGIC_TYPE_CLIENT_HOME)
                .addField(Field.LONG)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
        );

        // Login message
        messages.add(new Message(MESSAGE_TYPE_LOGIN)
                .addField(Field.LONG)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.BYTE)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.BYTE)
                .addField(Field.STRING)
                .addField(Field.INT)
        );
        
        messages.add(new Message(MESSAGE_TYPE_KEEP_ALIVE));

        messages.add(
                new Message(MESSAGE_TYPE_ENCRIPTION)
                .addField(Field.STRING)
                .addField(Field.INT)
        );

        messages.add(
                new Message(MESSAGE_TYPE_LOGIN_OK)
                .addField(Field.LONG)
                .addField(Field.LONG)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.STRING)
                .addField(Field.STRING)
        );

        messages.add(new Message(MESSAGE_TYPE_OWN_HOME_DATA)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.LONG)
                .addField(Field.LONG)
                .addField(Field.INT)
                .addField(Field.LONG)
                .addField(Field.BYTE)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.LONG)
                .addField(Field.LONG)
                .addField(Field.BYTE)
                .addField(Field.LONG)
                .addField(Field.STRING)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.LONG)
                .addField(Field.BYTE)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.INT)
                .addField(Field.STRING)
                .addField(Field.STRING)
                
        );
        
    }

    public static Message get(int messageType) {
        for (Message message : messages) {
            if (message.getMessageType() == messageType) {
                return message;
            }
        }
        return null;
    }

}
