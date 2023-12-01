package eclipse_test;

import java.util.Scanner;

public class eclipse_test_with_void {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                while(s1.length()<16){
                	s1=s1+" ";
                }
                String s1_t=s1;
                s1=s1_t+x;
                if(s1.length()<19)
                s1=s1_t+"0"+x;
                System.out.println(s1);
                //
            }
            System.out.println("================================");

    }
}



