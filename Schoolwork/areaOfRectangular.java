package Schoolwork;

import java.util.Scanner;

public class areaOfRectangular {

    public static double calculateArea(Rectangular Rectangular){
        return Rectangular.getLength() * Rectangular.getWidth();
    }

    public static void main(String[] arg){
        Rectangular R1 = new Rectangular(0,0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of Length: ");
        R1.setLength(sc.nextDouble());
        System.out.print("Please enter the value of Width: ");
        R1.setWidth(sc.nextDouble());

        System.out.println(calculateArea(R1));
    }
}

class Rectangular{
    double length;
    double width;
    double area;

    Rectangular(double length, double width){
        this.length = length;
        this.width = width;
        area = length * width;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
