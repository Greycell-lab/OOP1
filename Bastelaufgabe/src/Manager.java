import java.util.*;

public class Manager {
    enum Instrumente{
        GEIGE,
        KLAVIER,
        FLOETE,
        TROMMEL,
        OBOE,
        TROMPETE,
        BECKEN,
        FAGOTT,
        BRATSCHE,
        CELLO
    }
    static List<Instrumente> instrumente = new ArrayList<>();
    static List<Musiker> musiker = new ArrayList<>();
    static List<Musiker> angestellt = new ArrayList<>();
    static List<Musiker> warteliste = new ArrayList<>();
    static List<Instrumente> verlangteInstrumente = new ArrayList<>();
    List<Instrumente> musikerInstrumente = new ArrayList<>();
    static int id = 1;
    public static void feelTheBeat(){
        fuelleInstrumentliste();
        //generiereMusiker();
        pruefeObSpielt();
        ausgabe();
    }
    public static void fuelleInstrumentliste(){
        instrumente.addAll(Arrays.asList(Instrumente.values()));
    }
    public static void generiereMusiker(){
        for(int i=0;i<50;i++) new Musiker();
    }
    public static void pruefeObSpielt(){
            Collections.shuffle(instrumente);
            System.out.println();
            System.out.println("\t\t\tVerlangte Instrumente:");
            System.out.print("\t\t\t");
            for (int i = 0; i < 3; i++) {
                verlangteInstrumente.add(instrumente.get(i));
                System.out.print(instrumente.get(i) + ", ");
            }
            System.out.println();
            do {
                new Musiker();
            for (var x : musiker) {
                if (new HashSet<>(x.musikerInstrumente).containsAll(verlangteInstrumente) && !angestellt.contains(x)) {
                    angestellt.add(x);
                } else if(!warteliste.contains(x)) warteliste.add(x);
            }
            }while(angestellt.size() < 50);
    }
    public static void ausgabe(){
        System.out.println();
        System.out.println("Angestellt Liste:");
        for(var x : angestellt) {
            System.out.print("Musiker ID: " + x.id + " ---> Gespielte Instrumente: ");
            for(var y : x.musikerInstrumente) System.out.print(y + ", ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Warte Liste:");
        for(var x : warteliste) {
            System.out.print("Musiker ID: " + x.id + " ---> Gespielte Instrumente: ");
            for(var y : x.musikerInstrumente) System.out.print(y + ", ");
            System.out.println();
        }
        System.out.println(angestellt.size() + " Musiker gefunden.");


    }
}
