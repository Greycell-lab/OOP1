public class Schaltjahr
{
    public static boolean istSchaltjahr(int jahr)
    {
        return (jahr % 4==0 || jahr % 400 == 0) && jahr % 100 != 0;
    }
}
