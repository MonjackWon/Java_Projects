package Schoolwork;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        try {

            FileInputStream rd = new FileInputStream("FileTest.java");
            InputStreamReader sr = new InputStreamReader(rd);
            BufferedReader br = new BufferedReader(sr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
