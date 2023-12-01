package test;

public class StringInternTest {
    public static void main(String[] args){
        String s1 = "1";
        String s2 = "1";

        System.out.println(s1 == s2);

        String s3 = new String("2");
        s3.intern();
        String s4 = new String("2");
        s4.intern();
        System.out.println(s3 == s4);

        String s5 =new String("3") + new String("3");
        s5.intern();
        String s6 = "33";
        System.out.println(s5 == s6);

    }
}
