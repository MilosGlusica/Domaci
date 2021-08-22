import java.util.Scanner;
/* Faktorijel
        Napsiati program koji za uneti pozitivan celi broj veci od 0 n ispisuje njegov faktorijel.
        Faktorijel se obelezava sa ! i racuna se kao n! = n * n-1 * n-2 * ... * 3 * 2 * 1
        Npr 5! = 5 * 4 * 3 * 2 * 1 = 120 */

public class Zadatak2 {


    public static boolean isValidNum(int a){

        if (a % 1 == 0 && a >= 1){
            return true;
        } else {
            return false;
        }
    }


    public static int faktorial(int x){

        int counter = 1;
        int sum = x;

        while (x > counter){
            sum *= (x - counter);
            counter++;
        }
        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int num = sc.nextInt();

        while (!isValidNum(num)){
            System.out.println("Try again with int number and bigger that 0!");
            num = sc.nextInt();
        }
            System.out.println("Output:\n" + faktorial(num));
    }
}
