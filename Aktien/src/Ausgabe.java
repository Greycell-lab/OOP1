public class Ausgabe {
    public static void aktienAusgabe(){
        System.out.println("\tAktuelle Aktienwerte");
        System.out.println("ID\tBezeichnung\t\tWert\tSchwankung\tName");
        for(var x : Aktie.values()) System.out.println(x.getId() + "\t" + x + "\t" + String.format("%.02f", x.getWert()) + "\t" + x.getSchwankung() + "\t\t" + x.getName());
        System.out.println();

    }
}
