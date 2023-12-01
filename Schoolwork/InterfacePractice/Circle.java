package Schoolwork.InterfacePractice;

public class Circle implements Area {
    double r;
    Circle(double r){
        this.r = r;
    }
    @Override
    public double AreaCalculate() {
        double a;
        a = 2 * Math.PI * this.r;
        return a;
    }
}
