package Schoolwork.InterfacePractice;

public class Rectangle implements Area{
    private double length = 0;
    private double width = 0;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double AreaCalculate() {
        double a = 0.00;
        a = this.length * this.width;
        return a;
    }
}
