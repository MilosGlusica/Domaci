/*Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir,
 razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom. */

import java.util.Scanner;

public class AritmetickeOperacije {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

    }

}
