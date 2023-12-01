package Schoolwork;

import java.nio.channels.IllegalChannelGroupException;
import java.util.Scanner;

public class ExceptionPractice2 {
    static void sanjiao(int a,int b,int c) {
        int num1 = a, num2 = b, num3 = c, temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        if (num2 + num1 <= num3) {
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            sanjiao(sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println("a,b,c能构成三角形");
        }
        catch (IllegalArgumentException e){
            System.out.println("a,b,c不能构成三角形");
        }
    }
}
