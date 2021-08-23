import java.util.ArrayList;

public class Posta {

    private ArrayList<Poruka> poruke;

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public ArrayList<Poruka> getPoruke() {
        return poruke;
    }

    public void setPoruke(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public Posta() {
        this.poruke = new ArrayList<>();
    }

    public void add(Poruka p){
        for (Poruka pr : poruke){
            if (pr.getId() == p.getId()){
                return;
            } poruke.add(p);
            break;
        }
    }

    public void remove(Poruka p){
        for (Poruka pr : poruke){
            if (pr.getId() == p.getId()){
                poruke.remove(p);
            } return;
        }
    }

    public void send(Poruka p){
        for (Poruka pr : poruke){
            if (pr.getId() == p.getId()){
                System.out.println(p);
                remove(p);
            } return;
        }
    }

    public void change(Poruka p, String msg){
          p.setPoruka(msg);
    }

    public int isplata(Poruka p){
        int rez = 0;
        for (Poruka pr : poruke){
            if (pr.equals(p)){
                rez = p.getSuma();
            }
        }
        return rez;
    }

    @Override
    public String toString(){
        String rez = "";
            for (Poruka pr : poruke){
                if (pr.getSuma() >= 0){
                    rez += "Posta { " + pr.getPosiljalac() + " salje " + pr.getSuma() + " para " + pr.getPrimalac() +
                            " -u, uz poruku: " + pr.getPoruka() + " }" + "\n";
                } else {
                    rez += "Posta { " + pr.getPosiljalac() + " primac " + pr.getSuma() + " para od " + pr.getPrimalac() +
                            " -a, uz poruku: " + pr.getPoruka() + " }" + "\n";
                }
            }
            return rez;
    }
}
