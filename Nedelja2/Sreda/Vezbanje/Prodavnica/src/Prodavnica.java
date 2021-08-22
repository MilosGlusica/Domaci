/* // Сваки пети купац добија попуст од 10%
         Сваки седми купац добија попуст од 15%

         Написати програм који омогућава куцање бесконачно износа рачуна
         (док се не укуца -1 за износ)
         Програм треба да испише крајњи износ
         (У случају сваког петог, то је смањена вредност, за остале се не мења)*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prodavnica {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double reciept = sc.nextDouble();
        double discountForFifth = reciept * 0.9;
        double discountForSeventh = reciept * 0.85;
        int i = 1;

        while (reciept != -1){

            if (i % 7 == 0) {
                System.out.println(discountForSeventh);
            } else if (i % 5 == 0) {
                System.out.println(discountForFifth);
            } else {
                System.out.println(reciept);
            }

            i++;
            reciept = sc.nextDouble();
        }

    }
}
