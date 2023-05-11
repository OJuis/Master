package top.fiun;

import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public static String getHashString(String string) throws HashException {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new HashException(e.getMessage());
        }
        byte[] data;
        data = messageDigest.digest(string.getBytes(StandardCharsets.UTF_8));
        return Hex.encodeHexString(data);
    }
}
