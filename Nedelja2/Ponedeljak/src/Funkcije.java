import java.util.Scanner;

public class Funkcije {
    // Написати следеће функције:
    // 1. Функција која враћа збир два унета броја
    //public static double sum(double x, double y){
     //   return x + y;
    //}
    // 2. Функција која враћа најмањи од три броја (double)

    public static double smallestNum(double x, double y, double z){
       if (x <= y && x <= z){
           return x;
       } else if (y < x && y < z) {
           return y;
       } else {
           return z;
       }
    }


    // 3. Функција која исписује вредност броја на квадрат
    //public static void printSquared(double n){
    //    System.out.println(n * n);
    public static double printSquared(double n){
        double squareNum = n * n;
        return squareNum;
    }

    //}
    // 4. Функција која исписује просек 3 оцене (4,5,5) -> 4.6666..667
    //       - Оцене су int
    public static double averageMark(double a, double b, double c){
        double markTree;
        return  markTree = (a + b + c) / 3;
    }
    // 5. Функција која враћа просек 3 броја
    //
    // 6. Написати програм који од корисника тражи знак (+,-,*,/,^), а затим два реална броја
    //    Исписати резултат
    //    Свака операција треба да се налази у својој функцији


    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            //3double n = sc.nextDouble();
            //2double num1 = sc.nextDouble();
            //2double num2 = sc.nextDouble();
            //2double num3 = sc.nextDouble();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        //2System.out.println("Smalest number is: " + smallestNum(num1, num2, num3));
        //3System.out.println("Value of squared number is: " + printSquared(n));
        System.out.println("Aveage of three numbers is:" + averageMark(x, y, z));
    }


}
