package com.springmvc.model;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class My_Encrypt {
    private static final String ALGO ="AES";
    private static final byte[] keyValue =new byte[]{'T','h','e','B','e','s','t','S','e','c','r','e','t','K','e','y'};
    
    public static String encrypt(String Data)throws Exception{
        String encryptedValue ="";
        Key key =generateKey();
        Cipher c= Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE,key);
        byte[] encVal =c.doFinal(Data.getBytes());
        encryptedValue =Base64.getEncoder().encodeToString(encVal);
        return encryptedValue;
    }
    
    public static String decrypt(String encryptedData)throws Exception{
        Key key =generateKey();
        Cipher c =Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE,key);
        byte[] decordedValue =Base64.getDecoder().decode(encryptedData);
        byte[] decValue =c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
    private static Key generateKey() throws Exception{
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }
}

