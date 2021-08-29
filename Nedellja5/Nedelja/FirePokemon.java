public class FirePokemon extends Pokemon{

    public FirePokemon(String name, int health) {
        super(name, health);
    }

    @Override
    public String attack(){
        return "Attacks with: FIRE";
    }
@Override
    public String defend(){
        return "Defends with: BODY";
    }
@Override
    public String wins(){
        return "Wins against: Grass Type";
    }
@Override
    public String loses(){
        return "Loses against: Water Type";
    }

    @Override
    public String logAll() {
        String rez = "";
        rez += "Pokemon | " + getName() + "\n";
        rez += attack().concat("\n");
        rez += defend().concat("\n");
        rez += wins().concat("\n");
        rez += loses().concat("\n");
        rez += "----------------------------";
        return rez;
    }
}
