package coc.protocol;

/**
 *
 * @author manus
 */


public class ByteStream {
    byte[] data = new byte[0];
    IntBoxer pointer = new IntBoxer(0);

    public ByteStream() {
    }
    
    public ByteStream(byte[] data) {
        this.data = data;
    }
    
    public boolean isEnd() {
        return isEnd(1);
    }
    public boolean isEnd(int value) {
        return !(pointer.value + value - 1 < data.length);
    }
    public byte[] clone(int size) {
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) {
            data[i] = read();
        }
        return data;
    }
    
    public byte[] copy() {
        return copy(0, getSize());
    }
    public byte[] copy(int offset, int size) {
        byte[] data = new byte[size];
        for (int i = 0; i < size; i++) {
            data[i] = this.data[i + offset];
        }
        return data;
    }

    public long read(int size, boolean little) {
        long ret = 0, c = 0;
        for (int i = 0; i < size; i++) {
            c = (long) (read() & 0xFF);
            if (little) {
                c = (c << (size - i - 1) * 8);
            } else {
                c = (c << i * 8);
            }
            ret |= c;
        }
        return ret;
    }

    public long read(int size) {
        return read(size, false);
    }
    
    public byte read()
    {
        return data[pointer.value++];
    }
    
    public void write(long value, int size)
    {
        write(value, size, false);
    }
    public void write(long value, int size, boolean little)
    {
        for (int i = 0; i < size; i++) {
            byte val = 0;
            if(little)
            {
                val = (byte) ((value >> (size - i - 1) * 8) & 0xFF);
            }
            else
            {
                val = (byte) ((value >> i * 8) & 0xFF);
            }
            write(val);
        }
    }
    public void write(int value){
        write((byte) value);
    }
    public void write(byte[] value)
    {
        
        if(pointer.value + value.length >= data.length)
        {
            redim((pointer.value + value.length) - data.length);
        }
        for (int i = 0; i < value.length; i++) {
            write(value[i]);
        }
    }
    
    public void write(byte value)
    {
        if(pointer.value == data.length)
        {
            redim(1);
        }
        data[pointer.value ++] = value;
    }
    
    public void skip()
    {
        skip(1);
    }
    public void skip(int count)
    {
        pointer.value += count;
    }
    
    public void redim(int size)
    {
        int newLength = data.length + size;
        byte[] newBuffer = new byte[newLength];
        for (int i = 0; i < data.length; i++) {
            newBuffer[i] = data[i];
        }
        this.data = newBuffer;
    }
    
    public void add(ByteStream data)
    {
        add(data.data);
    }
    
    public void add(byte[] data)
    {
        add(data, data.length);
    }
    public void add(byte[] data, int leng)
    {
        int newLength = leng + this.data.length;
        byte[] newBuffer = new byte[newLength];
        for (int i = 0; i < this.data.length; i++) {
            newBuffer[i] = this.data[i];
        }
        for (int i = this.data.length, j = 0; i < newLength; i++, j++) {
            newBuffer[i] = data[j];
        }
        pointer.value = newLength;
        this.data = newBuffer;
    }
    
    
    public void clear()
    {
        pointer.value = 0;
        this.data = new byte[0];
    }
    public void flush()
    {
        int newLength = data.length - pointer.value;
        byte[] newBuffer = new byte[newLength];
        for (int i = pointer.value, j = 0; j < newLength; i++, j++) {
            newBuffer[j] = data[i];
        }
        this.data = newBuffer;
        pointer.value = 0;
    }
    
    public void reset()
    {
        pointer.value = 0;
    }

    public byte[] getData() {
        return data;
    }
    
    public int getSize()
    {
        return data.length;
    }
}
