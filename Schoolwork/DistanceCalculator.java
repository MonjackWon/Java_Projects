package Schoolwork;
import java.lang.Math;
import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double calculateDistance(Point otherPoint) {
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }
}

public class DistanceCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        System.out.println("分别输入点1的X,Y坐标");
        point1.setX(sc.nextDouble());
        point1.setY(sc.nextDouble());
        System.out.println("分别输入点2的X,Y坐标");
        point2.setX(sc.nextDouble());
        point2.setY(sc.nextDouble());

        double distance = point1.calculateDistance(point2);

        System.out.println("点1和点2之间的距离是: " + distance);
    }
}
