import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + ": FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            } else {
                System.out.println(i + ":");
            }
            i++;
        }
    }
}
