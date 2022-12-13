import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(quersumme(-125));
        //int[] array = new int[5];
        //fillArray(array);
        LocalDate b;
        b = tryStringZuDatum("2007-12-02");
        System.out.println(b);
    }
    public static LocalDate tryStringZuDatum(String datum)
    {
        try {
            LocalDate.parse(datum);
        }
        catch(DateTimeParseException e) {
            System.out.println("Wrong Date Format.");
        }
        return LocalDate.parse(datum);
    }
    public static void fillArray(int[] array)
    {
        try
        {
            for(int i=0;i<10;i++) array[i] = i;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static int quersumme(int num) {
        int qs = 0;
        if(num<0) throw new IllegalArgumentException("Number was negative!");
        try{
            while(num != 0) {
                qs += num % 10;
                num /= 10;
            }
            return qs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}