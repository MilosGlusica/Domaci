/* Za uneti pozitivni celobrojni cetvorocifreni broj izracunati i ispisati koji se broj
dobije kada se od proizvoda njegovih prvih dveju cifara oduzme zbir drugih dveju njegovih cifara.
 */
import java.util.Scanner;

public class CetvorocifreniBrojevi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int fourDigitNum = sc.nextInt();

        int a = fourDigitNum / 1000;
        int b = (fourDigitNum - (a * 1000)) / 100;
        int c = (fourDigitNum - ((a * 1000) + (b * 100))) / 10;
        int d = fourDigitNum - ((a * 1000) + (b * 100) + (c * 10));

        System.out.println("Output:\n" + ((a * b) - (c + d)));

    }
}
