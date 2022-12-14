import java.io.*;
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
    int sum = 0;
    boolean street, gotIt, readyCheck, impossible;
    public void fillArray(int a, int b)
    {
        for(int i=0;i<array.length;i++) array[i] = rnd.nextInt(a,b+1);
        Arrays.sort(array);
    }
    public void printArray()
    {
        System.out.println();
        System.out.println("***********************");
        System.out.print("Gewürfelt: ");
        for(var x : array) System.out.print(x + " ");
        System.out.println("\n***********************");
        System.out.println();
    }
    /*public void letsPlay(int a, int b) // Aufgabe
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
    }*/
    public void gameStart()
    {
        while(true){
            fillArray(1, 6);
            printArray();
            showPaper();
            checkReady();
        }
    }
    public void showPaper()
    {
        System.out.println("****Point Chart****");
        for(int i=0;i<chart.length;i++) System.out.println("\t" + (i+1) + ": [ " + chart[i][0] + " ]");
        do {
            getNumber();
            for (int j : array) {
                impossible = chart[j - 1][0] != 0;
                if(!impossible) break;
            }
            if(impossible) break;
        }while(chart[number-1][0] != 0);
        if(!impossible) {
            for (int j : array) {
                if (j == number) counter++;
            }
            chart[number - 1][0] = counter * number;
            counter = 0;
        }
    }
    public void getNumber()
    {
        do {
            try {
                System.out.print("Welche Zahl möchtest du einfügen: ");
                number = Integer.parseInt(sc.nextLine());
                gotIt = true;
            } catch (Exception e) {
                System.out.println("Diese Zahl wurde nicht gewürfelt.");
            }
        }while(!gotIt);
    }
    public void checkReady()
    {
        for (int[] ints : chart) {
            if (ints[0] != 0) readyCheck = true;
            else {
                readyCheck = false;
                break;
            }
        }
        if(readyCheck)
        {
            for(int[] a : chart)
            {
                for(int x : a) sum += x;
            }
            System.out.println();
            System.out.println("*****************************");
            System.out.println("Spiel zuende! Punktzahl: " + sum);
            System.out.println("Danke fürs spielen!");
            System.out.println("*****************************");
            System.exit(0);
        }
    }
    public void writeScore()
    {
        try
        {
            OutputStream os = new FileOutputStream("/score.txt");
            Writer writer = new OutputStreamWriter(os);
            writer.write(sum);
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
