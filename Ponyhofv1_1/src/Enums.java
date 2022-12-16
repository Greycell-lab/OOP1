public class Enums {
    enum Attraktionen{
        PLANWAGEN("Planwagenfahrt", 7.0f),
        PONYREITEN("Ponyreiten", 5.0f),
        HUHN("Hühner füttern", 2.0f),
        BROT("Brot backen", 5.0f),
        STREICHELN("Streichelzoo", 3.0f);
        final String bezeichnung;
        final float preis;
        Attraktionen(String bezeichnung, float preis) {
            this.bezeichnung = bezeichnung;
            this.preis = preis;
        }
    }
    enum Verpflegung{
        WASSER("Wasser", 2.0f),
        LIMO("Limo", 3.0f),
        WAFFELN("Waffeln", 3),
        BRATWURST("Bratwurst", 2.0f),
        SALAT("Salat", 6.0f),
        CURRYWURST("Currywurst", 4.0f),
        POMMES("Pommes", 2.0f),
        VEGANWRAP("Veganer Wrap", 5);
        final String bezeichnung;
        final float preis;
        Verpflegung(String bezeichnung, float preis){
            this.bezeichnung = bezeichnung;
            this.preis = preis;
        }
    }
    enum Besucher{
        KLEINKIND("Kleinkind", 5),
        KIND("Kind", 7),
        STUDENT("Student", 9),
        ERWACHSENER("Erwachsener", 15),
        RENTNER("Rentner", 10);
        final String bezeichnung;
        final float preis;
        Besucher(String bezeichnung, float preis){
            this.bezeichnung = bezeichnung;
            this.preis = preis;
        }
    }
}
