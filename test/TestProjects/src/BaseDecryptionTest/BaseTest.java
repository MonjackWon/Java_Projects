package BaseDecryptionTest;

import java.util.Base64;

public class BaseTest {
    public static void main(String[] args) throws Exception {
        String a = "123465789";
        System.out.println(BASE64.encryptBASE64(a.getBytes()));

        byte[] decodes = BASE64.decryptBASE64("MTIzNDY1Nzg5");
        for(byte i : decodes){
            System.out.print(Character.toChars(i));
        }

    }
}
class BASE64 {
    /**
     * BASE64Encoder 加密
     *
     * @param data 要加密的数据
     * @return 加密后的字符串
     */
    public static String encryptBASE64(byte[] data) {
        // BASE64Encoder encoder = new BASE64Encoder();
        // String encode = encoder.encode(data);
        // 从JKD 9开始rt.jar包已废除，从JDK 1.8开始使用java.util.Base64.Encoder
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(data);
    }

    /**
     * BASE64Decoder 解密
     *
     * @param data 要解密的字符串
     * @return 解密后的byte[]
     * @throws Exception
     */
    public static byte[] decryptBASE64(String data) throws Exception {
        // BASE64Decoder decoder = new BASE64Decoder();
        // byte[] buffer = decoder.decodeBuffer(data);
        // 从JKD 9开始rt.jar包已废除，从JDK 1.8开始使用java.util.Base64.Decoder
        Base64.Decoder decoder = Base64.getDecoder();
        return decoder.decode(data);
    }
}