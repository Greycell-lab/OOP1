public class Main {
    public static void main(String[] args) {

        // Erstellung eines Objekts der eigenen TestClass "new TestClass() = Constructor"
        TestClass a = new TestClass();
        // Zuweisung von NICHT-Statischen Werten des Objekts (gelten nur für dieses Objekt)
        a.id = 30;
        a.name = "Master";
        a.istAn = false;
        // Ausführung einer NICHT-Statischen Methode über das Objekt
        a.printTextObject();

        // Zuweisung von Statischen Werten der Klasse (Kein Objekt nötig)
        TestClass.ID = 10;
        TestClass.NAME = "Mister";
        TestClass.istAN = true;
        // Ausführung einer Statischen Methode über die Klasse (Kein Objekt nötig)
        TestClass.printTextStatic();
    }
}