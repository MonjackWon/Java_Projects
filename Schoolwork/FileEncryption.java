package Schoolwork;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class FileEncryption {

    public static void main(String[] args) throws IOException {
        try{
            FileInputStream input = new FileInputStream("Schoolwork/codes.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(input);
            BufferedReader bf = new BufferedReader(inputStreamReader);

            String line;

            StringBuilder[] codes = new StringBuilder[10000];
            String[] encodes = new String[10];
            int i = 0;
            while((line = bf.readLine())!=null){
                codes[i] = new StringBuilder(line);
                i++;
            }

            int m=-1;
            for(StringBuilder j:codes){
                m++;
                //加密算法
                try {
                    String StringJ = new String(j);
//                    char[] ArrayJ = StringJ.toCharArray();
//                    char t;
//                    for (int k = 0; k < ArrayJ.length; k++) {
//                        t = ArrayJ[k];
//                        t = (char) ((t + 17)*1.5);
//                        ArrayJ[k] = t;
//                    }
//                        encodes[m] = Arrays.toString(ArrayJ);
                   String encode = BASE64.encryptBASE64(StringJ.getBytes());
                   encodes[m] = encode;
                }
                catch (NullPointerException ignored){} catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            bf.close();

            BufferedWriter bfw = getBufferedWriter(encodes);
            bfw.close();
        }
        catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static BufferedWriter getBufferedWriter(String[] encodes) throws IOException {
        FileOutputStream output = new FileOutputStream("SchoolWork/encodes.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(output);
        BufferedWriter bfw = new BufferedWriter(outputStreamWriter);

        for (String encode : encodes) {
            if (encode != null) {
                bfw.write(encode.replace(",","").replace(" ","")
                                .replace("[","").replace("]",""));
                bfw.newLine();
            }
        }
        bfw.flush();
        System.out.println("文件已加密并保存");
        return bfw;
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
        Encoder encoder = Base64.getEncoder();
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
        Decoder decoder = Base64.getDecoder();
        return decoder.decode(data);
    }
}

