package Schoolwork;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class FileDecryption {

    public static void main(String[] args) throws IOException {
        try{
            FileInputStream input = new FileInputStream("Schoolwork/encodes.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(input);
            BufferedReader bf = new BufferedReader(inputStreamReader);

            String line;

            StringBuilder[] encodes = new StringBuilder[100];
            String[] decodes = new String[10];
            int i = 0;
            while((line = bf.readLine())!=null){
                encodes[i] = new StringBuilder(line);
                i++;
            }

            int m=-1;
            for(StringBuilder j:encodes){
                m++;
                //解密算法
                try {
                    String StringJ = new String(j);
                    System.out.println(StringJ);
                    {
//                    char[] ArrayJ = StringJ.toCharArray();
//                    char t;
//                    for (int k = 0; k < ArrayJ.length; k++) {
//                        t = ArrayJ[k];
//                        t = (char) ((t + 17)*1.5);
//                        ArrayJ[k] = t;
//                    }

//                        encodes[m] = Arrays.toString(ArrayJ);
                    }
                    {
                        byte[] decode = BASE64.decryptBASE64(StringJ);
                        char[] temp = new char[0];
                        for(int x=0; x<decode.length;x++){
                            temp = Character.toChars();
                        }
                        decodes[m] = String.valueOf(temp);
                    }
                }
                catch (NullPointerException ignored){} catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            bf.close();

            BufferedWriter bfw = getBufferedWriter(decodes);
            bfw.close();
        }
        catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static BufferedWriter getBufferedWriter(String[] encodes) throws IOException {
        FileOutputStream output = new FileOutputStream("SchoolWork/decodes.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(output);
        BufferedWriter bfw = new BufferedWriter(outputStreamWriter);

        for (String decode : encodes) {
            if (decode != null) {
                bfw.write(decode.replace(",","").replace(" ","")
                        .replace("[","").replace("]",""));
                bfw.newLine();
            }
        }
        bfw.flush();
        System.out.println("文件已解密并保存");
        return bfw;
    }
}
