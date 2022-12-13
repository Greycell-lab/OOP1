import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Kniffel {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    int[] array = new int[5];
    int[][] chart = new int[6][1];
    int counter;
    int number;
    boolean street, gotIt;
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
    public void gameStart()
    {
        do {
            fillArray(1, 6);
            printArray();
            showPaper();
        }while(true);
    }
    public void showPaper()
    {
        System.out.println();
        System.out.println("****Point Chart****");
        for(int i=0;i<chart.length;i++) System.out.println((i+1) + ": [ " + chart[i][0] + " ]");
        do {
            getNumber();
        }while(chart[number][0] != 0);
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]==number) counter++;
        }
        chart[number][0] = counter * number;
    }
    public void getNumber()
    {
        do {

            try {
                System.out.println("Welche Zahl möchtest du einfügen: ");
                this.number = Integer.parseInt(sc.nextLine());
                gotIt = true;
            } catch (Exception e) {
                System.out.println("Diese Zahl wurde nicht gewürufelt.");
            }
        }while(!gotIt);
    }

}
