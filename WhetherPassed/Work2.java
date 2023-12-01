package WhetherPassed;

import java.util.Scanner;

public class Work2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int grade=sc.nextInt();
            if (grade >= 60) {
                System.out.println("成绩合格");
            } else {
                System.out.println("成绩不合格");
            }
        }
    }
}
