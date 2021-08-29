public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int health) {
        super(name, health);
    }
@Override
    public String attack() {
        return "Attacks with: GRASS";
    }
 @Override
    public String defend() {
        return "Defends with: EVASION";
    }
 @Override
    public String wins() {
        return "Wins against: Water Type";
    }
@Override
    public String loses() {
        return "Loses against: Fire Type";
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