public class Appartement extends Haus {
    public Appartement(float preis, float qm, int zimmer, int id){
        this.bezeichnung = "Appartements";
        this.id = id;
        this.preis = preis;
        this.qm = qm;
        this.zimmer = zimmer;
    }
}
