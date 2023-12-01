package Schoolwork.InterfacePractice;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class test {
    public static void main(String[] args){
        Circle c1 = new Circle(1.5);
        Rectangle r1 = new Rectangle(2, 5);

        System.out.println(c1.AreaCalculate());
        System.out.println(r1.AreaCalculate());
    }
}
