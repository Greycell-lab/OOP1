import java.util.Arrays;
import java.util.Random;

public class Kniffel {
    Random rnd = new Random();
    int[] array = new int[5];
    int counter;
    boolean street;
    public void fillArray(int a, int b)
    {
        for(int i=0;i<array.length;i++) array[i] = rnd.nextInt(a,b+1);
        Arrays.sort(array);
    }
    public void printArray()
    {
        System.out.print("Gewürfelt: ");
        for(var x : array) System.out.print(x + " ");
        System.out.println();
    }
    public void letsPlay(int a, int b)
    {
        do {
            fillArray(a, b);
            printArray();
            for(int i=0;i<array.length-1;i++)
            {
                //if(i == array.length) break;
                if(array[i] != array[i+1]-1)
                {
                    street = false;
                    break;
                }
                else street = true;
            }
            counter++;
        }while(!street);
        System.out.println("Straße nach: " + counter + " versuchen.");
    }

}
