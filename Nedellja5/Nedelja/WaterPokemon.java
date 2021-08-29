public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int health) {
        super(name, health);
    }
@Override
    public String attack() {
        return "Attacks with: WATER";
    }
@Override
    public String defend() {
        return "Defends with: WATER";
    }
@Override
    public String wins() {
        return "Wins against: Fire Type";
    }
@Override
    public String loses() {
        return "Loses against: Grass Type";
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
