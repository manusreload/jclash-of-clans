package coc.protocol.messages;

import coc.protocol.Field;
import coc.protocol.Message;
import java.util.List;

/**
 *
 * @author manus
 */


public class EndClientTurnMessage extends Message {

    public EndClientTurnMessage(int messageType, List<Field> fields) {
        super(messageType, fields);
    }
    public EndClientTurnMessage(int messageType) {
        super(messageType);
    }

    
}
