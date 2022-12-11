public class TwoSum
{
    static int[] array = new int[]{11, 4, 9, 2};
    static int[] array1 = new int[10];
    public static int[] getSum(int number)
    {
        int temp=number;
        for(int i=0;i<4;i++)
        {
            if(array[i]<=number)
            {
                temp-=array[i];
                array1[i] = array[i];
            }
        }
        return array1;
    }
}
