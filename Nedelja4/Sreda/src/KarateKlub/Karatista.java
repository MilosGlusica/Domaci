package KarateKlub;

import java.util.Arrays;
import java.util.Random;

public class Karatista {
    private static int countBlankName = 1;
    private String name;
    private int age;
    private String rang;
    private String[] kata;

    public Karatista(String name, int age, String rang, String[] kata){

        this.kata = kata;
        if (name.isBlank()){
            name = "Karatista " + countBlankName;
            System.out.println("Invalid entry, default settings taken!");
        } this.name = name;

        if (age < 7 || age > 99){
            age = 0;
            System.out.println("Invalid entry, default value is set");
        } this.age = age;

        if (!(isValidRang(rang))){
            rang = "10Kyu";
            System.out.println("Invalid rang, default rang is set");
        } this.rang = rang;
        countBlankName++;

    }
    public boolean isValidRang(String rank){

        String[] ranks = {"10Kyu", "9Kyu", "8Kyu", "7Kyu", "6Kyu", "5Kyu", "4Kyu", "3Kyu", "2Kyu",
                "1Kyu", "1Dan", "2Dan", "3Dan", "4Dan", "5Dan", "6Dan", "7Dan", "8Dan", "9Dan", "10Dan"};

        if (rank.isBlank()) return false;

        for (String r : ranks) {

            if (rank.equalsIgnoreCase(r)) { // assumption: upper and lowercase letters are not important
                return true;
            }
        }
        return false;
    }

    public void napadni(int index){
        System.out.println("Karatista " + this.name + " napada sa " + this.kata[index] + " katom");
    }

    public void vatreniNapad(){
        System.out.println("Karatista " + this.name + " napada sa " + returnRandomKata(this.kata) + " katom");
    }

    public String returnRandomKata(String [] katas){
        Random rand = new Random();
        String randomKata = "";
        for (String k : katas){
            randomKata = katas[rand.nextInt(katas.length)];
        }
        return randomKata;
    }

    public void log(){
        System.out.println("Karatistia: " + this.name + " , " + this.age + " , " + this.rang + " zna naredne " +
                "kate " + Arrays.toString(this.kata));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age < 7 || this.age > 99){
            System.out.println("Invalid entry");
            return;
        } this.age = age;
    }

    public String[] getKata() {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        if (!(isValidRang(this.rang))){
            System.out.println("Invalid rang entry");
            return;
        } this.rang = rang;
    }

    @Override
    public String toString(){
        return  "Karatistia: " + name + ", " + age + ", " + rang + " - zna naredne kate " + Arrays.toString(kata);
    }
}
