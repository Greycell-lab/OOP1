public class Main {
    static int g=5;
    public static void main(String[] args)
    {
        //System.out.println(evenOrOdd(6));
        //System.out.println(checksum(125));
        /*int l=10;
        hello();
        for(int i=0;i<l;i++) System.out.println("Welt");
        System.out.println("\ng=" + g + "\nl=" + l);*/
        int i = 5;
        float f = 4.5f;
        char c = 'X';
        StringBuilder s = new StringBuilder();
        for(int j = 0;j<i;j++)
        {
            s.append(c).append(f);
        }
        for(int j=0;j<3;j++)
        {
            System.out.println(s);
        }
    }
    public static String evenOrOdd(int n)
    {
        return n%2==0 ? "Number is Even" : "Number is Odd";
    }
    public static int checksum(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void hello()
    {
        for(int i=0;i<g;i++)System.out.println("Hello");
    }
}