import java.io.Serial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        SerializeObject a = new SerializeObject();
            /*a.id = 10;
            a.name = "Bambam";
            SerializeObject.serialize(a);*/
        //List<SerializeObject> list = new ArrayList<>();
        //for(int i=0; i<10;i++) list.add(new SerializeObject(i, "Master"));
        //for(var x : list) SerializeObject.serialize(x);
        //for(var x : list) SerializeObject.deserialize(x);
        //for(var x : list) System.out.println("ID: " + x.id + "\nName: " + x.name);
        a = SerializeObject.deserialize(a);
        System.out.println(a.id + " " + a.name);
    }
}