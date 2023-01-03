public class Song {
    String titel;
    Interpret interpret;

    public Song(String titel, Interpret interpret){
        this.titel = titel;
        this.interpret = interpret;
        interpret.songs.add(this);
    }
}
