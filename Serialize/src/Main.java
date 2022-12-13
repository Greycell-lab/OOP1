import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SerializeObject> list = new ArrayList<>();

        /*for(int i=0; i<10;i++) {
            SerializeObject x = new SerializeObject();
            x.name = "Lol";
            x.id = 1;
            list.add(x);
        }*/
        //for(var x : list) System.out.println(x.name);
        //SerializeObject.serialize(list);
        SerializeObject.deserialize(list);
        for(var x : list) System.out.println(x.name);
    }
}