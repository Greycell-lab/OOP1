import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {

        list.add("Hello");
        list.add("Hi");
        String[] arr = new String[list.size()];
        list.toArray(arr);
        for(var x : arr) System.out.println(x);
    }
}