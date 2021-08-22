import java.util.Scanner;
/* Potrebno je nacrtati u konzoli pomocu znaka * jednakostranicni trougao proizvoljne duzine stranice,
kao u test primerima.
 */
public class JednakostranicniTrougao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of equilateral triangle: ");
        int num = sc.nextInt();
        String star = "*";
        String empty = " ";

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num -1 ; j++) {
                System.out.print(empty);
            }
            for (int k = 0; k < num; k++) {
                for (int l = 0; l < num - 1; l++) {
                    System.out.print(star);
                    System.out.print(empty);
                }

            }

            for (int m = 0; m < num -1; m++) {
                System.out.print(empty);
            }
            System.out.println();
        }

    }
}
