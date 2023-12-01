package Schoolwork;

import java.util.stream.StreamSupport;

public class JudgeGrade {
    public static void main(String[] arg){
        int grade=(int)(Math.round(100*Math.random()));

        System.out.print(grade+":");

        if(grade>=90)
            System.out.println("优");
        if(grade>=80 && grade<90)
            System.out.println("良");
        if(grade>=60 && grade<80)
            System.out.println("中");
        if(grade<60)
            System.out.println("差");

    }
}
