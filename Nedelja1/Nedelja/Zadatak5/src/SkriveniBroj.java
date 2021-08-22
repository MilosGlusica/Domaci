import java.util.Scanner;

/* Skriveni broj broja n je broj dobijen ponavljanjem postupka sabiranja svih njegovih cifara dokle
god nije jednocifren. Napisati program koji za uneti celobrojni pozitivan broj racuna njegov skriven broj.
Npr. skriveni broj broja 4567 je 4 jer je 4567 --> 4+5+6+7 = 22 --> 2+2 = 4; broja 9999 je 9 jer je 9999 -->
9+9+9+9 = 36 --> 3+6 = 9.
 */
public class SkriveniBroj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        int suma = 0;
        int i =0;

        while (num != 0){
            temp = num % 10;
            num /= 10;
            suma += temp;
            i++;
        }

        int sumarum = 0;

        while (suma != 0){
            int temper = suma % 10;
            suma /= 10;
            sumarum += temper;
        }
        System.out.println(sumarum);
    }
}
