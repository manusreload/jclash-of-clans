package coc;

/**
 * Created by manus on 15/4/15.
 */
public class Utils {
    public static byte[] parseData(String key, int base) {
        int len = key.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(key.charAt(i), base) << 4)
                    + Character.digit(key.charAt(i + 1), base));
        }
        return data;
    }

    public static void displayBytes(byte[] items) {
        displayBytes(items, items.length);
    }

    public static void displayBytes(byte[] items, int leng) {
        String a = "";
        String b = "";
        String c = "";
        for (int i = 0; i < leng; i++) {
            if(i % 16 == 0)
            {
                c = String.format("%08x", i);
            }
            a += (String.format("%02x ", (int) (items[i] & 0xff)));
            char n = (char) (items[i] & 0xff);
            b += readdable(n) ? n : ".";
            if (i % 8 == 7) {
                a += "  ";
                b += "  ";
            }
            if (i % 16 == 15) {
                display(c + " " + a + "  " + b);
                a = "";
                b = "";
                c = "";
            }
        }
        display(c + " " + a + "  " + b);
    }

    private static void display(String text) {
        System.out.println(text);
//        try {
//            FileOutputStream out = new FileOutputStream("console.log", true);
//            out.write((text + "\n").getBytes());
//            out.close();
//        } catch (IOException ex) {
//            Logger.getLogger(COC.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private static boolean readdable(char c) {
        return !Character.isISOControl(c);
//        return c >= '0' && c <= 'Z';
//        return true;
    }

    public static void hexDump(byte[] data, int offset, int leng) {
        int s = 16;
        for (int i = 0; i < leng; i += s) {
            System.out.print(String.format("%04X", i * s));
            for (int j = 0; j < s && i + j + offset < data.length; j++) {
                System.out.print(String.format("%02X ", (int) data[i + j + offset] & 0xFF));
            }
            for (int j = 0; j < s && i + j + offset < data.length; j++) {
                int value = (int) data[i + j + offset] & 0xff;
                if (Character.isISOControl(value)) {
                    System.out.print((char) value);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }

}
