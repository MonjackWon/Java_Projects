package Schoolwork;

import java.util.regex.Pattern;

public class PrintPattern {
    static void Pattern1() {
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern2() {
        int i, j, k;
        for (i = 0; i < 6; i++) {
            for (k = 0; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
            Pattern1();
            Pattern2();
        }
    }
