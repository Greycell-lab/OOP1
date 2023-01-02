public class Einfamilienhaus extends Haus{
    public Einfamilienhaus(float preis, float qm, int zimmer, int id){
        this.bezeichnung = "Einfamilienhaus";
        this.id = id;
        this.preis = preis;
        this.qm = qm;
        this.zimmer = zimmer;
    }
}
