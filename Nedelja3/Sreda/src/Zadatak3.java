/*Napisati funkciju koja za prosledjeni password proverava da li je validan, tj.:

 -Da li postoji barem jedno veliko slovo. (Hint: Hmm, sta je bese ono Strahinja pominjao da pogledamo osim,
  String i Integer klasa ?")
 -Je duzi od 8 karaktera.*/

import java.util.Scanner;

public class Zadatak3 {

    public static boolean isPasswordGood(String str){
        char[] ofStr = str.toCharArray();
        for (int i = 0; i < ofStr.length; i++) {
            if (ofStr.length > 8 && Character.isUpperCase(ofStr[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        if (isPasswordGood(password)){
            System.out.println("Correct password");
        }
            System.out.println("Incorrect password");
    }
}
