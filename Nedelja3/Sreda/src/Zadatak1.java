/*Biblord na autoputu treba da ispise poruku koja joj je prosledjena dalekovodima.
Kako su dalekovodi stari, cesto u prenosu poruke dodaju karaktere '$', '#' i '@' negde u poruku.
Napisati funkciju koja ispisuje originalnu poruku, bez tih dodatih simbola.
Npr "Vo$z$ite $#@pazlj@i######vo!#" -> "Vozite pazljivo!"*/

import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static String clean(String str){
        str = str.replaceAll("[$#@]", "");
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String power = sc.nextLine();
        System.out.println(clean(power));

    }
}
