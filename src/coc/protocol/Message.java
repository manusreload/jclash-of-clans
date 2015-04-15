package coc.protocol;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author manus
 */


public class Message {
    
    int messageType;
    List<Field> fields = new ArrayList<>();
    Field fieldError = null;
    int indexError = -1;
    public Message(int messageType, List<Field> fields) {
        this.messageType = messageType;
        this.fields.addAll(fields);
    }
    
    
    public Message(int messageType) {
        this.messageType = messageType;
    }

    public Message clone()
    {
        return new Message(messageType, fields);
    }
    
    

    public List<Field> getFields() {
        return fields;
    }
    public Field getField(int index) {
        return fields.get(index);
    }
    public Message addFieldFromMessage(Message message)
    {
        fields.addAll(message.getFields());
        return this;
    }
    public Message addField(Field field)
    {
        fields.add(field.clone());
        return this;
    }
    
    public void setField(int index, Object value)
    {
        fields.get(index).setValue(value);
    }
    
    
    public boolean parse(ByteStream stream)
    {
        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            
            if(!field.parse(stream ))
            {
                indexError = i;
                fieldError = field;
                return false;
            }
            if(stream.isEnd()) break;
        }
        return true;
    }
    
    public int build(ByteStream stream)
    {
        int size = 0;
        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            size += field.build(stream);
        }
        return size;
    }
    
    public void dump()
    {
        int index = 0;
        for (Field field : fields) {
            System.out.println("Field[" + index++ + "]=" + field.getValue()+ " (" + field.getType() + ")");
        }
    }

    public int getMessageType() {
        return messageType;
    }

    public Field getFieldError() {
        return fieldError;
    }

    public int getIndexError() {
        return indexError;
    }
    
    
    
    
    
    
    
    
    
}
