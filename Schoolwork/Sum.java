package Schoolwork;

import java.util.Scanner;

public class Sum {
    static int method1(int n){
        int i;
        int sum=0;
        for(i=0;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    static int method2(int n) {
        int i = 0, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    static int method3(int n){
        int i=0,sum=0;
        do{
            sum+=i;
            i++;
        }
        while (i<=n);
        return sum;
    }

    static int method4(int n){
        int a;
        if(n==1){
            a=1;
        }
        else{
            a=method4(n-1)+n;
        }
        return a;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        sum=method1(n);
        sum=method2(n);
        sum=method3(n);
        sum=method4(n);
        System.out.println(sum);
    }
}
