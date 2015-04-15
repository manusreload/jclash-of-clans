package coc.protocol;


/**
 *
 * @author manus
 */


public class ByteUtils {
    

    public static byte[] join(byte[] a, byte[] b)
    {
        byte[] c = new byte[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length, j=0; j < b.length; i++,j++) {
            c[i] = b[j];
        }
        return c;
    }
    
}
