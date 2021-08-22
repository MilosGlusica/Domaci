/*Trojike
 Napisati program koji uporedju 3 realna broja i ispisuje najmanji od njih u konzoli.*/

import java.util.Scanner;

public class Zadatak1 {

    public static double smallerThan(double x, double y, double z){
        if (x <= y && x <= z){
            return x;
        } else if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.println("Output:\n " + smallerThan(num1, num2, num3));

    }
}
