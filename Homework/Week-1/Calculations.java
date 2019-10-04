/**
 * This application implements approximations for e^x and sin(x).
 *
 * @author Kai Richardson
 * @date 10/03/2019
 */
public class Calculations
{
    public static void main(int x)
    { 
        // loop printing e^x
        System.out.println("x      e^x");
        System.out.println("=      ===");
        for (int i = -x; i <= x; i++)
        {
            System.out.println(i + "      " + eToTheX(i));
        }

        System.out.print("\n\n");

        // loop printing sin(x)
        System.out.println("x      sin(x)");
        System.out.println("=      ======");
        for (int i = 1; i <= x + 1; i++)
        {
            System.out.println(i + "PI/2      " + sinX(i));
        }
    }

    public static double eToTheX(double x)
    {
        // this loops through n!
        int result = 1;
        for(int i = 1; i <= x; i++)
        {
            result += result * i;
        }
        return result;
    }

    public static double sinX(double x)
    {
        // compute the Taylor series approximation
        double sum = 0;
        for (int i = 0; i <= x; ++i) {
            sum = (Math.PI * i) / 2;
        }
        return sum;
    }
}
