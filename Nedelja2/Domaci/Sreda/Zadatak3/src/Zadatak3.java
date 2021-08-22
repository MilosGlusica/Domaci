import java.sql.SQLOutput;
import java.util.Scanner;

/* BID
Napisati program koji poziva funkciju bid(boolean b, int i, double d), koja u konzolu ispisuje poruku
 "Boolean" ako je b netacno, poruku "Integer", ako je i strogo vece od 49 i poruku "Double" ako je d
 dvostruko strogo veci od promenjive i, zaokruzen na celu decimalu nanize!*/



public class Zadatak3 {

    public static int round(double z){
        int rounding = (int) z;
        return rounding;
    }

    public static String bid(boolean logicus, int a, double b){
        String res = "";
        if (!logicus){
            res += "Boolean\n";
        }
        if (a > 49){
            res += "Integer\n";
        }
        if (round(b) > 2 * a){
            res += "Double\n";
        }
        return res;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean logic = sc.nextBoolean();
        int x = sc.nextInt();
        double y = sc.nextDouble();
        System.out.println("Input:\n" + "b = " + logic + ", " + "i = " + x + ", " + "d = " + y);
        System.out.println("Output:\n" + bid(logic, x, y));
    }
}
