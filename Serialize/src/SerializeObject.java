import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    public static void serialize(List<SerializeObject> list)
    {
        try
        {
          fos = new FileOutputStream("C://test.txt", true);
          oos = new ObjectOutputStream(fos);
          oos.writeObject(list);
          oos.flush();
          oos.close();

        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }

    }
    public static void deserialize(List<SerializeObject> list)
    {
        try{
            fis = new FileInputStream("C://test.txt");
            ois = new ObjectInputStream(fis);
            list = (List<SerializeObject>)ois.readObject();
            ois.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
