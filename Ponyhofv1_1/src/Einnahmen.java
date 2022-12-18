public class Einnahmen {
    /**
     * Führt alle benötigten Ausgabe-Methoden der verschiedenen Klassen aus
     */
    static void einnahmenAusgabe()
    {
        Besucher.ausgabeGesamt();
        Verpflegung.ausgabeGesamt();
        Attraktion.ausgabeGesamt();
        Besucher.einnahmenGesamt();
    }
}
