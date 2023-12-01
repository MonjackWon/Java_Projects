package test;

public class StringBuffer {

    public static void main(String[] args){

        String s2 = new java.lang.StringBuffer().append("1").append("2").toString();
        String s3 = new java.lang.StringBuilder().append("1").append("2").toString();
        System.out.println(s2);
        System.out.println(s3);

    }

}
