package Schoolwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("请输入5个整数：");
            for (int i = 0; i < 5; i++) {
                array[i] =  sc.nextInt();
            }
            System.out.println("输入的整数数组为：");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("请输入至少5个整数");
        }
    }
}
