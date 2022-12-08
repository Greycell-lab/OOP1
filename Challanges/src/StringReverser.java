public class StringReverser
{
    public static String reverseString(String s)
    {
        StringBuilder sb = new StringBuilder();
        int stringlength = s.length();
        for(int i=stringlength-1;i>=0;i--) sb.append(s.charAt(i));
        return sb.toString();
    }
}
