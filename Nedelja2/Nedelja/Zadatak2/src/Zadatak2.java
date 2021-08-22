import java.util.Arrays;
import java.util.Scanner;

/*Suma cifara broja, ponovo
Korisniki unosi broj kao String. Na standardni izlaz ispisati zbir njegovih cifara.
Za racunanje zbira cifara napraviti zasebnu funkciju koja vraca int.
Raditi pomocu String metode toCharArray()!*/

public class Zadatak2 {

    public static int suma(char[] sumaChar){

        /*int [] charInt = new int[sumaChar.length];
        for (int i = 0; i < sumaChar.length; i++) {
            charInt[i] = sumaChar[i] - '0';
            System.out.println(charInt[i]);
        }*/
        int sumarum = 0;
        for (int i = 0; i < sumaChar.length; i++) {
            sumarum += sumaChar[i] - '0'; //'0' - heksadecimalni broj 48, sluzi da bi nas char pretvorili u int

        }

        int temp = sumarum;
        int sum = 0;
        int counter = 1;
        for (int i = 0; i < counter; i++) {
            int numSum = 0;
            while (temp != 0) {
                numSum += temp % 10;
                temp /= 10;
            }
            if (numSum > 10){
                counter++;
                temp = numSum;
            }
             sum = numSum;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        char [] numToArray = number.toCharArray();
        int rez = suma(numToArray);
        System.out.println(rez);
    }
}
