package Song;

public class Song {
    private final String titel;
    private final int dauerSekunden;
    private final String interpret;
    public Song(String titel, String interpret, int dauerSekunden){
        this.titel = titel;
        this.interpret = interpret;
        this.dauerSekunden = dauerSekunden;
    }
    @Override
    public String toString(){
        return "Titel: " + this.titel + "\nInterpret: " + this.interpret + "\nDauer: " + inMinuten();
    }
    private String inMinuten(){
        String minuten = "" + this.dauerSekunden / 60;
        String sekunden = "" + this.dauerSekunden % 60;
        return minuten + ":" + sekunden;
    }
}
