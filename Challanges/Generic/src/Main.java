import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer[] intarr = new Integer[10];
        for(var x : intarr)
        {
            x = rnd.nextInt(0, 100);
            System.out.println(x);
        }
        ArrayToList<Integer> list = new ArrayToList<Integer>();
    }
}
