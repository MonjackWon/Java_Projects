package Schoolwork;

import java.io.*;

public class FileTest2 {
    public static void main(String[] args) {
        try {
            FileInputStream a = new FileInputStream("E:\\Java Projects\\Schoolwork\\FileTest2.java"); //replace name to current path
            byte[] s =  a.readAllBytes();

            for (byte b : s) {
                System.out.print(Character.toChars(b));
            }

        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
