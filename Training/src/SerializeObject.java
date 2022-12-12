import java.io.*;

public class SerializeObject implements Serializable {
    int id;
    String name;
    static FileOutputStream fos;
    static ObjectOutputStream oos;
    static FileInputStream fis;
    static ObjectInputStream ois;
    /*public SerializeObject(int id, String name)
    {
        this.id = id;
        this.name = name;
    }*/
    public static void serialize(Object object)
    {
        try
        {
          fos = new FileOutputStream("C://test.txt", false);
          oos = new ObjectOutputStream(fos);
          oos.writeObject(object);
          oos.flush();
          oos.close();

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
    public static SerializeObject deserialize(SerializeObject object)
    {
        try{
            fis = new FileInputStream("C://test.txt");
            ois = new ObjectInputStream(fis);
            object = (SerializeObject)ois.readObject();
            ois.close();
            return object;

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return object;
    }
}
