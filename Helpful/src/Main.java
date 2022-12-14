public class Main {
    public static void main(String[] args) {

        // Erstellung eines Objekts der eigenen TestClass "new TestClass() = Constructor"
        ObjektClass a = new ObjektClass(10, "Master", false);
        ObjektClass b = new ObjektClass(15, "Hallo");
        // Zuweisung von NICHT-Statischen Werten des Objekts (gelten nur für dieses Objekt)
        // Ausführung einer NICHT-Statischen Methode über das Objekt
        //a.printTextObject();

        // Zuweisung von Statischen Werten der Klasse (Kein Objekt nötig)
        ObjektClass.ID = 10;
        ObjektClass.NAME = "Mister";
        ObjektClass.istAN = true;
        // Ausführung einer Statischen Methode über die Klasse (Kein Objekt nötig)
        //ObjektClass.printTextStatic();
        printNumber(10);
        printNumber(2.5f);
        printNumber(15, 20);
    }
    public static void printNumber(int a)
    {
        System.out.println(a);
        System.out.println("Int methode");
    }
    public static void printNumber(int a, int b)
    {
        System.out.println(a +" "+ b);
        System.out.println("Int methode 2");
    }
    public static void printNumber(float a)
    {
        System.out.println(a);
        System.out.println("Float methode");
    }
}