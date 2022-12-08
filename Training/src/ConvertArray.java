import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertArray
{
    static List<Integer> ilist = new ArrayList<>();
    static List<Character> clist = new ArrayList<>();
    static List<String> slist = new ArrayList<>();
    static List<Float> flist = new ArrayList<>();
    static List<Double> dlist = new ArrayList<>();
    static List<Long> llist = new ArrayList<>();
    public static List<Integer> convertToList(int[] array)
    {
        for(var x : array) ilist.add(x);
        return ilist;
    }
    public static List<Character> convertToList(char[] array)
    {
        for(var x : array) clist.add(x);
        return clist;
    }
    public static List<String> convertToList(String[] array)
    {
        Collections.addAll(slist, array);
        return slist;
    }
    public static List<Float> convertToList(float[] array)
    {
        for(var x : array) flist.add(x);
        return flist;
    }
    public static List<Double> convertToList(double[] array)
    {
        for(var x : array) dlist.add(x);
        return dlist;
    }
    public static List<Long> convertToList(long[] array)
    {
        for(var x : array) llist.add(x);
        return llist;
    }
}
