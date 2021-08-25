package Sreda1;


public abstract class Shape {
    private String name;

    public Shape(String name){
        if (name.isBlank()){
            this.name = "Geometriski oblik";
            System.out.println("Niste uneli naziv geometriskog oblika, usvojen podrazumevani naziv");
        } this.name = name;

    }

    public abstract double circumference();

    public abstract double area();

    @Override
    public String toString(){
        String rez = "";
        rez += "Shape: " + name + "\n";
        rez += "Circumference: " + circumference() + "\n";
        rez += "Area: " + area() + "\n";
        rez += "------------------------------";
        return rez;
    }

}
