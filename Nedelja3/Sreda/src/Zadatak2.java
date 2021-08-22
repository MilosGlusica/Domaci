/*Napisati funkciju koja transformise cenzurisane ruzne reci natrag u originalni oblik i vraca
taj oblik nazad.
Funkciji se prolsedjuje niska, niz niski u kome se nalaze kljucevi i niz niski u kome se nalaze desifrovane
poruke, tako da kljuc[i] -> decode[i];
Npr:
String poruka = "Jedi #$%^ !@#$!!!@# mali!" "Jedi #$%^ !@#$!!!@# mali!" "Jedi #$%^ !@#$!!!@# mali #$%&!#$!"
String[] kljuc = {"#$%^", "!@#$!!!@#"} {"#$%^", "!@#$!!!@#"} {"#$%^", "!@#$!!!@#", "#$%&!#$"}
String[] decode = {"pite", "moroncinu"} {"pite", "moroncinu"} {"pite", "moroncinu", "ljigavi"}
String res = "Jedi pite moroncinu mali!" <-- ovo treba vratiti "Jedi pite moroncinu mali ljigavi!"
Ni jedan kljuc nije podstring drugog (osim samog sebe, naravno)*/

import java.util.Arrays;

public class Zadatak2 {

    public static String rez(String x, String[] y, String[] z){

        String[] messageArray = x.split(" "); //String array x

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < messageArray.length; j++) {
                if (y[i].equals(messageArray[j])){
                    y[i] = z[i];
                    messageArray[j] = y[i];
                }
            }
        }
        String res = new String();
        for (int i = 0; i < messageArray.length; i++) {
            res += messageArray[i].concat(" ");

        }
        return res;
    }

    public static void main(String[] args) {

        String message = "Jedi #$%^ !@#$!!!@# mali"; //String array x
        String[] key = {"#$%^", "!@#$!!!@#"}; //String array y
        String[] decode = {"pite", "moroncinu"}; // String array z
        System.out.println(rez(message, key, decode));



    }
}
