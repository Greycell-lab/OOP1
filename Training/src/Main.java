import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] array = new int[25];
        for(int i=0;i<array.length;i++)
        {
            array[i] = rnd.nextInt(1, 100);
            System.out.println(array[i]);
        }
        System.out.println("Max Number: " + maxNumber(array));
    }
    public static int maxNumber(int[] array)
    {
        int max=0;
        for (int j : array) if (j > max) max = j;
        return max;
    }
}