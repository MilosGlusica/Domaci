package KarateKlub;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Karatista> karateMembers = new ArrayList<>();
        karateMembers.add(new Karatista("Karatist1", 8, "9Kyu", new String[] {"Bassai Dai",
                "Bassai Sho"}));
        karateMembers.add(new Karatista("Karatist2", 70, "3Kyu", new String[] {"Bassai Dai",
                "Bassai Sho", "Kanku Dai", "Kanku Sho", "Hangetsu", "Goju Shi Ho Dai", "Goju Shi Ho Sho"}));
        karateMembers.add(new Karatista("Karatist3", 22, "3Kyu", new String[] {"Bassai Dai",
                "Bassai Sho", "Kanku Dai"}));
        karateMembers.add(new Karatista("Karatist4", 40, "3Kyu", new String[] {"Bassai Dai",
                "Bassai Sho", "Kanku Dai", "Kanku Sho", "Hangetsu", "Goju Shi Ho Dai", "Goju Shi Ho Sho"}));
        karateMembers.add(new Karatista("Karatist5", 32, "3Kyu", new String[] {"Bassai Dai",
                "Bassai Sho", "Kanku Dai", "Kanku Sho", "Hangetsu", "Goju Shi Ho Dai"}));
        karateMembers.add(new Karatista("", 55, "3Kyu", new String[] {"Bassai Dai",
                "Bassai Sho", "Kanku Dai", "Kanku Sho", "Hangetsu"}));
        karateMembers.add(new Karatista(" ", 1, "56564", new String[] {"Bassai Dai",
                "Bassai Sho", "Kanku Dai", "Kanku Sho", "Hangetsu", "Goju Shi Ho Dai", "Goju Shi Ho Sho"}));

        for (int i = 0; i < karateMembers.size(); i++) {
            System.out.println(karateMembers.get(i));
        }
        //System.out.println(karateMembers.get(6).getAge());
        karateMembers.get(5).napadni(4);
        karateMembers.get(6).vatreniNapad();
        karateMembers.get(6).log();

    }
}
