import java.util.Scanner;

/* Na standardni ulaz se unose imena dva tima, a zatim i 6 celih pozitivnih brojeva koji oznacavaju
broj osvojenih zlatnih, srebrnih odnosno bronzanih medalja, tim redom. Prva 3 broja se odnose na prvi
tim a druga tri broja na drugi tim. Pobednicki tim je onaj koji ima vise osvojenih medalja, a u slucaju
da oba tima imaju isto onda se gleda ko ima vise osvojenih zlatnih medalja. Ako i tada nema pobednika
onda se gledaju srebrne medalje i na kraju bronzane. Na standarni izlazi ispisati ime pobednickog tima,
a ako oba tima imaju potpuno iste medalje, ispisati nisku "Nereseno".
 */
public class OlimpijskeMedalje {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first team:");
        String teamOne = sc.nextLine();
        System.out.println("Enter second team:");
        String teamTwo = sc.nextLine();
        System.out.println("Enter 6 positive real numbers:");
        int teamOneGold = sc.nextInt();
        int teamOneSilver = sc.nextInt();
        int teamOneBronze = sc.nextInt();
        int teamTwoGold = sc.nextInt();
        int teamTwoSilver = sc.nextInt();
        int teamTwoBronze = sc.nextInt();
        int sumTeamOne = teamOneGold + teamOneSilver + teamOneBronze;
        int sumTeamTwo = teamTwoGold + teamTwoSilver + teamTwoBronze;

        if (sumTeamOne == sumTeamTwo){
            if (teamOneGold == teamTwoGold){
                if (teamOneSilver == teamTwoSilver){
                    if (teamOneBronze == teamTwoBronze){
                        System.out.println("Nereseno");
                    } else if (teamOneBronze > teamTwoBronze) {
                        System.out.println(teamOne);
                    } else {
                        System.out.println(teamTwo);
                    }
                } else if (teamOneSilver > teamTwoSilver) {
                    System.out.println(teamOne);
                } else {
                    System.out.println(teamTwo);
                }
            } else if (teamOneGold > teamTwoGold) {
                System.out.println(teamOne);
            } else {
                System.out.println(teamTwo);
            }
        } else if (sumTeamOne > sumTeamTwo) {
            System.out.println(teamOne);
        } else {
            System.out.println(teamTwo);
        }

    }

}
