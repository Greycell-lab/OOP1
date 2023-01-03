public class Main {
    public static void main(String[] args) {
        //Aufgabe 6
        /*Tier blacky = new Tier("Blacky", "Pferd");
        Tier lassie = new Tier("Lassie", "Hund");
        Futter trockenfutter = new Futter("Trockenfutter", 300);
        Futter heu = new Futter("Heu", 150);
        Futter fleisch = new Futter("Fleisch", 500);
        blacky.addFutter(trockenfutter);
        lassie.addFutter(trockenfutter);
        blacky.addFutter(heu);
        lassie.addFutter(fleisch);
        for(var x : Tier.getTierListe()){
            System.out.println();
            System.out.println("Tier: " + x.getName());
            System.out.println();
            for(var y : x.getFutterListe()) System.out.println("Futter: " + y.getBezeichnung() + "\nKalorien: " + y.getKalorien());
        }*/
        //Aufgabe 7
        Land deutschland = new Land("Deutschland");
        Land usa = new Land("USA");
        Land daenemark = new Land("Dänemark");
        Firma microsoft = new Firma("Microsoft");
        Firma apple = new Firma("Apple");
        Firma volkswagen = new Firma("Volkswagen");
        Firma porsche = new Firma("Porsche");
        Mitarbeiter mike = new Mitarbeiter("Mike", microsoft);
        Mitarbeiter marcy = new Mitarbeiter("Marcy", microsoft);
        Mitarbeiter andrew = new Mitarbeiter("Andrew", apple);
        Mitarbeiter amy = new Mitarbeiter("Amy", apple);
        Mitarbeiter volker = new Mitarbeiter("Volker", volkswagen);
        Mitarbeiter verena = new Mitarbeiter("Verena", volkswagen);
        Mitarbeiter paul = new Mitarbeiter("Paul", porsche);
        Mitarbeiter petra = new Mitarbeiter("Petra", porsche);
        deutschland.getFirmaListe().add(microsoft);
        deutschland.getFirmaListe().add(apple);
        deutschland.getFirmaListe().add(volkswagen);
        deutschland.getFirmaListe().add(porsche);
        daenemark.getFirmaListe().add(microsoft);
        daenemark.getFirmaListe().add(volkswagen);
        usa.getFirmaListe().add(microsoft);
        usa.getFirmaListe().add(apple);
        usa.getFirmaListe().add(volkswagen);
        usa.getFirmaListe().add(porsche);
        microsoft.getLandListe().add(deutschland);
        microsoft.getLandListe().add(daenemark);
        microsoft.getLandListe().add(usa);
        apple.getLandListe().add(deutschland);
        apple.getLandListe().add(usa);
        volkswagen.getLandListe().add(deutschland);
        volkswagen.getLandListe().add(daenemark);
        volkswagen.getLandListe().add(usa);
        porsche.getLandListe().add(deutschland);
        porsche.getLandListe().add(usa);
        System.out.println();
        for(var x : Land.landListe) x.zeigeAlleFirmen();
        System.out.println("---------------------------------------");
        for(var x : Firma.firmaListe) x.zeigeAlleLaender();
        System.out.println("---------------------------------------");
        for(var x : Firma.firmaListe) x.zeigeAlleMitarbeiter();
        System.out.println("---------------------------------------");
        for(var x : Mitarbeiter.mitarbeiterListe) x.zeigeNameUndFirma();
        System.out.println("---------------------------------------");

    }
}