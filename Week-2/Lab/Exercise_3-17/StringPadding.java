
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
        padString("hello", 8);
    }

    // method pads the parameter string with spaces until its length is the given length
    public static String padString(String s, int n)
    {
        int wordL = s.length();
        for(int i = 1; i <= n - wordL; i++)
        {
            s = " " + s;
        }
        return s;
    }
}
