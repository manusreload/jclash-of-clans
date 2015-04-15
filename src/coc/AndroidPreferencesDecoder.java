package coc;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;

/**
 *
 * @author manus
 */
public class AndroidPreferencesDecoder {

    private Cipher b;
    private Cipher c;
    private Cipher d;
    private Cipher e;

    /**
     * 
     * @param key Encoder key. android_id or package name ()
     */
    public AndroidPreferencesDecoder(String key) {
        
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        try {
            
            this.b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.c = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.d = Cipher.getInstance("AES/ECB/PKCS5Padding");
            this.e = Cipher.getInstance("AES/ECB/PKCS5Padding");
            byte[] arrayOfByte = new byte[this.b.getBlockSize()];
            System.arraycopy("fldsjfodasjifudslfjdsaofshaufihadsf".getBytes(), 0, arrayOfByte, 0, this.b.getBlockSize());
            IvParameterSpec localIvParameterSpec = new IvParameterSpec(arrayOfByte);
            MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-256");
            localMessageDigest.reset();
            byte[] keyHash = localMessageDigest.digest(key.getBytes("UTF-8"));
            SecretKeySpec localSecretKeySpec = new SecretKeySpec(keyHash, "AES");
            this.b.init(1, localSecretKeySpec, localIvParameterSpec);
            this.c.init(2, localSecretKeySpec, localIvParameterSpec);
            this.d.init(1, localSecretKeySpec);
            this.e.init(2, localSecretKeySpec);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAlgorithmParameterException ex) {
            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String decodeKey(String base64)
    {
        return decode(base64, this.e);
    }
    public String decodeValue(String base64)
    {
        return decode(base64, this.c);
    }
    
    public String decode(String base64, Cipher cipher)
    {
        byte[] data = Base64.getDecoder().decode(base64);
        return decode(data, cipher);
    }
    public String decode(byte[] data, Cipher cipher)
    {
        try {
            return new String(cipher.doFinal(data));
        } catch (IllegalBlockSizeException ex) {
//            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
//            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    
    public String encodeKey(String raw)
    {
        return encode(raw, this.d);
    }
    public String encodeValue(String raw)
    {
        return encode(raw, this.b);
    }
    public String encode(String raw, Cipher cipher)
    {
        return Base64.getEncoder().encodeToString( encode(raw.getBytes(), cipher) );
    }
    
    public byte[] encode(byte[] raw, Cipher cipher)
    {
        try {
            return cipher.doFinal(raw);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(AndroidPreferencesDecoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

}
