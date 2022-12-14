public class Main {
    public static void main(String[] args) {

        // Erstellung eines Objekts der eigenen TestClass "new TestClass() = Constructor"
        ObjektClass a = new ObjektClass();
        // Zuweisung von NICHT-Statischen Werten des Objekts (gelten nur für dieses Objekt)
        a.id = 30;
        a.name = "Master";
        a.istAn = false;
        // Ausführung einer NICHT-Statischen Methode über das Objekt
        a.printTextObject();

        // Zuweisung von Statischen Werten der Klasse (Kein Objekt nötig)
        ObjektClass.ID = 10;
        ObjektClass.NAME = "Mister";
        ObjektClass.istAN = true;
        // Ausführung einer Statischen Methode über die Klasse (Kein Objekt nötig)
        ObjektClass.printTextStatic();
    }
}