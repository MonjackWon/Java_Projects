package HackerRank;

import java.util.*;
import java.io.*;

public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int out=a;
            for(int j=0;j<n;j++){
                out=out+(int)Math.pow(2.0,j)*b;
                System.out.print(out+" ");
            }
            System.out.println();

        }
        in.close();
    }
}
