/*Na standardni ulaz se unose dva cela broja. Na standardnom izlazu ispisati da li su ta dva
broja istog, odnosno suprotnog znaka, u formatu kao sto je prikazan na test primerima
 */

import java.util.Scanner;

public class Signatura {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0){
            System.out.printf("Brojevi %d i %d su istog znaka", num1, num2);

        } else if (num1 < 0 && num2 < 0){
            System.out.printf("Brojevi %d i %d su istog znaka", num1, num2);

        } else {
            System.out.printf("Brojevi %d i %d su suprotnog znaka", num1, num2);

        }

    }
}
