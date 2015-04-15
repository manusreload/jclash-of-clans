package coc.protocol;

/**
 *
 * @author manus
 */


public class Scramble {
    public static final int SIZE = 624;
    int seed;
    int[] buffer = new int[SIZE];
    int ix = 0;
    

    public Scramble(int seed) {
        this.seed = seed;
        
        for (int i = 0; i < 624; i++) {
            buffer[i] = seed;
            seed = 1812433253 * ((seed ^ (seed >> 30)) + 1) & 0xFFFFFFFF;
        }
    }
    
    public byte[] getScramble(byte[] serverRandom)
    {
//        String result = "";
        byte[] result = new byte[serverRandom.length];
        byte byte100 = 0;
        for (int i = 0; i < 100; i++) {
            byte100 = getByte();
        }
        for (int i = 0; i < serverRandom.length; i++) {
            
            byte b = (byte) (getByte() & byte100);
            result [i] = ((byte) (serverRandom[i] ^ b));
        }
        return result;
    }
    
    private byte getByte()
    {
        int x = getInt();
        if(isNeg(x))
        {
            x = negate(x);
        }
        return (byte) (x);
    }
    private int getInt()
    {
        if(ix == 0)
        {
            mixBuffer();
        }
        int val = buffer[ix];
        ix = (ix+1) % 624;
        val ^= (val >> 11) ^ ((val ^ (val >> 11)) << 7) & 0x9D2C5680;
        val = (int) (((val ^ (val << 15) & 0xEFC60000) >> 18) ^ val ^ (val << 15) & 0xEFC60000);
        return val;
    
    }
    
    private void mixBuffer()
    {
//        while i<624:
//            i += 1
//            v4= (self.buffer[i%624] & 0x7FFFFFFF) + (self.buffer[j]&0x80000000)
//            v6 = rshift(v4,1) ^ self.buffer[(i+396)%624]
//            if v4&1:
//                v6 ^= 0x9908B0DF
//            self.buffer[j] = v6
//            j += 1
        for (int i = 1, j = 0; i <= SIZE; i++, j++) {
            int v4 = (buffer[i % SIZE] & 0x7FFFFFFF) + (buffer[j] & 0x80000000);
            int v6 = (v4 >> 1) ^ buffer[(i + 396) % 624];
            if( (v4 & 1) == 1 )
            {
                v6 ^= 0x9908B0DF;
            }
            buffer[j] = v6;
        }     
                    
    }
    private void dumpbuffer()
    {
        for (int c : buffer) {
            System.out.println(String.format("%08x", c));
        }
    }
    
    private boolean isNeg(int number)
    {
        return Integer.signum(number) == -1;
    }
    
    private int negate(int number)
    {
        return Integer.reverse(number) >> 8;
    }
    
    
}
