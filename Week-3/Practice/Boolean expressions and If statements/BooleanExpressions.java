/**
 * Write a description of class BooleanExpressions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BooleanExpressions
{
    public static void main(String[] arg)
    {
        containsDigit("iasdfasd8sdf");
    }

    public static boolean containsDigit(String s)
    {
        for (int i = 0; i <= s.length(); i++) {
            if (s.charAt(i) <= '0' && s.charAt(i) >= '9') {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
