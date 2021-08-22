import java.util.Scanner;

/*Korisnik unosi cene proizvoda koje je kupio sve dok se ne unese 0. Na standardni izlaz ispisati
prosecnu cenu proizvoda. Ukoliko korisnik unese negativnu vrednost za cenu proizvoda, onda taj unos
treba zanemariti i nastaviti sa unosom.
 */
public class ProcenaVrednosti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti cenu artikla: ");
        double art = sc.nextDouble();
        double sum = 0;
        int i = 0;

        for (i = 0; art != 0; i++) {
            if (art > 0){
                sum += art;
                art = sc.nextDouble();
            } else {
                i--;
                art = sc.nextDouble();
            }
        }
        System.out.println("Prosecna vrednost unetih artikala je: " + (sum / Math.abs(i - 1)));
    }
}
