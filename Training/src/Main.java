import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] iarray = new int[25];
        String[] sarray = new String[25];
        //for(int i=0;i<iarray.length;i++) iarray[i] = rnd.nextInt(1, 100);
        for(int i=0;i<sarray.length;i++) sarray[i] = "Hallo";
        //System.out.println("Max Number: " + maxNumber(array));
        //List<Integer> liste;
        //liste = ConvertArray.convertToList(iarray);
        //for(var x : liste) System.out.println(x);
        List<String> sliste;
        sliste = ConvertArray.convertToList(sarray);
        for(var x : sliste) System.out.println(x);
    }
    public static int maxNumber(int[] array)
    {
        int max=0;
        for (int j : array) if (j > max) max = j;
        return max;
    }
}