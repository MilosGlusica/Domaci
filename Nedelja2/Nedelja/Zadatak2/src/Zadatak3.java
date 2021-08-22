import java.util.Arrays;
import java.util.Scanner;

/*Levo Desno
Korisnik unosi broj n koji oznacava koliko double brojeva kod treba da ocekuje. Zatim, unosi n double brojeva,
pozitivnih, negativnih ili 0.0. Smestiti sve te brojeve u niz, tako da idu prvo svi negativni, pa onda sve 0.0,
pa tek onda svi pozitivni brojevi (brojevi nemoraju da budu sortirani). Napraviti zasebnu funkciju koja smesta
brojeve na njihove odgovarajuce lokacije u nizu i zasebnu funkciju koja ispisuje ceo niz.*/

public class Zadatak3 {

   /* public static double[] sort(int size){
        Scanner input = new Scanner(System.in);
        double [] temp = new double[size];
        double [] array = new double[size];
        double tempor = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter double elements of array: ");
            temp[i] = input.nextDouble();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(temp[i] >= temp[j]){
                    array[i] = temp[j];

                } else {

                    tempor = temp[i];
                    array[j] = temp[i+1];
                    array[j+1] = tempor;
                }
            }

        }
        System.out.println(Arrays.toString(minus));
        System.out.println(Arrays.toString(zero));
        System.out.println(Arrays.toString(plus));
        return temp;
    }*/

    public static void main(String[] args){

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        double[] num = sort(size);
        System.out.println(Arrays.toString(num));*/
        String str = "sd sd";
        String str1 = "sd ";
        String str2 = "sd";
        String rez = str1 + str2;
        if (rez == str){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
