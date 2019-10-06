
/**
 * Write a description of class StringPadding here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringPadding
{
    // Main method to run the exercises 
    public static void main(String[] a)
    {
        vertical("hello");
    }

    // method pads the parameter string with spaces until its length is the given length
    public static void vertical(String s)
    {
        int wordL = s.length();
        for(int i = 0; i <= wordL - 1; i++)
        {
            char x = s.charAt(i);
            System.out.println(x);
        }
    }
}
