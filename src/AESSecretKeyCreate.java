import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESSecretKeyCreate {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // AES 256 비트 키 사용
        SecretKey secretKey = keyGen.generateKey();

        // Base64 인코딩
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println("Encoded Secret Key: " + encodedKey);
    }
}
