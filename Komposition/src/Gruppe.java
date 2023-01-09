import java.util.ArrayList;

public class Gruppe {
    private record Abenteurer(String name) {
        public String getName(){
            return name;
        }
    }
    private final ArrayList<Abenteurer> abenteurerInDerGruppe = new ArrayList<>();

    public ArrayList<Abenteurer> getAbenteurerInDerGruppe() {
        return abenteurerInDerGruppe;
    }
    public void addAbenteurer(String name){
        abenteurerInDerGruppe.add(new Abenteurer(name));
    }
}
