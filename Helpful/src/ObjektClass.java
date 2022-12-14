public class ObjektClass {
    int id=0;
    String name;
    boolean istAn;
    static int ID;
    static String NAME;
    static boolean istAN;
    ObjektClass(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    ObjektClass(int id, String name, boolean istAn)
    {
        this.id = id;
        this.name = name;
        this.istAn = istAn;
    }

    public void printTextObject()
    {
        System.out.println("ID: " + id + " Name: " + name + " An:" + istAn );
    }
    public static void printTextStatic()
    {
        System.out.println("ID: " + ID + " Name: " + NAME + " An:" + istAN );
    }



}
