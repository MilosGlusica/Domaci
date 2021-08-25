package Sreda1;

public class Circle extends Shape {
    private double r;

    public Circle(String name, double r){
        super(name);
        this.r = r;
    }

    @Override
    public double circumference(){
        return 2 * Math.PI * r;
    }

    @Override
    public double area(){
        return Math.PI * r * r;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
