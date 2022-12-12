public class Main {
    public static void main(String[] args)
    {
        //System.out.println(StringReverser.reverseString("Hallo das ist ein reverse Test"));
        int[] arr = {12, 5, 3, 9};
        int[] solution = TwoSum.twoSum(arr, 15);
        for(var x : solution) System.out.print(x + " ");
    }
}