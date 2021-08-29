public abstract class Pokemon implements Properties {
    private static int countPokemon = 0;
    private String name;
    private String type;
    private int health;

    public Pokemon(String name, int health){
        countPokemon++;
        if(name.isBlank()){    // provera za ime, ako je prazno usvajamo default vrednost
            name = "Pokemon " + countPokemon;
            System.out.println("Invalid entry, default value 'Pokemon X'");
        } this.name = name;

        this.type = new String(getClass().getTypeName());

        if (health <= 0){   // provera da li je pokemon zdrav
            health = 0;
            System.out.println("Invalid negative entry or zero, default value '0'");
        } this.health = health;

    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if(name.isBlank()){    // setter za pogresno uneseno ime(prazno polje)
            newName = "Pokemon " + countPokemon;
            System.out.println("Error, set default value 'Pokemon X'");
        } this.name = newName;
    }

    public String getType() {
        return type;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        if (newHealth <= 0){   // provera da li je pokemon zdrav
            newHealth = 0;
            System.out.println("Your pokemon needs rest");
        } this.health = newHealth;
    }

    public abstract String logAll(); // Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i
    // od koga gubi

    @Override
    public String toString(){
        String rez = "Pokemon | " + name + "\nTipa | " + this.type + "\nZdravlja | " + health + "\n";
        rez += "----------------------------";
        return rez;
    }
}
