package Com;

public class Main {
    public static void main(String[] args) {
        new Desktop("Dell");
        new Notebook("HP");
        new Server("IBM");
        //for (var x : Computer.getComputerListe()) x.setZustand();
        //for (var x : Computer.getComputerListe()) x.setZustand();
        Büro eins = new Büro(1);
        Büro zwei = new Büro(2);
        eins.getComputerListe().add(new Desktop("Dell"));
        eins.getComputerListe().add(new Notebook("HP"));
        zwei.getComputerListe().add(new Server("IBM"));
        zwei.getComputerListe().add(new Desktop("Alienware"));
        for(var x : Büro.büroListe) {
            System.out.println("Büro nummer: " + x.getNummer());
            for(var y : x.getComputerListe()){
                if(y instanceof Desktop d) d.setZustand();
                else if(y instanceof Notebook n) n.setZustand();
                else if(y instanceof Server s) s.setZustand();
            }
        }
    }
}
