import java.util.Scanner;

/* Godina je prestupna ako je deljiva sa 4 i vazi da nije deljiva sa 100 ili je deljiva sa 400.
Korisnik unosi dve godine strogo vece od 0. Ispisati broj godina koje su prestupne u zadatom
intervalu ukljucujuci i te dve.
 */
public class PrestupneGodine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dve godine vece od nule: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = 0;

        for (int i = n; i <= m; i++) {
            if (i % 400 == 0 || ((i % 100 !=0) && (i % 4 ==0))){
                j++;
            }

        }
        System.out.println(j);
    }
}
