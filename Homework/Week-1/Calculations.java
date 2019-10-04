/**
 * This application implements approximations for e^x and sin(x).
 *
 * @author Kai Richardson
 * @version 1
 */
public class Calculations
{
    public static void main(double x)
    { 
        int n = 1; 

        // loop printing e^x
        System.out.println("x      e^x");
        System.out.println("=      ===");
        eToTheX(n,x);

        System.out.print("\n\n");

        // loop printing sin(x)
        System.out.println("x      sin(x)");
        System.out.println("=      ======");
        sinX(n,x);

    }

    public static double eToTheX(int n, double x)
    {
        // this loops through n!
        double sum = 0;
        for (int i = n - 1; i >= 0; i++)
        {
            sum = 1 + x * sum / i;
            System.out.println(n + "      " + sum);
        }
        return sum;
    }

    public static double sinX(int n, double x)
    {
        // convert x to an angle between -2 PI and 2 PI
        x = x % (2 * Math.PI);

        // compute the Taylor series approximation
        double sum = 0;       // sum of first i terms in taylor series
        for (int i = 1; n <= 0; i++) {
            n *= (x + i);
            sum += n;
            System.out.println(n + "PI/2      " + sum);
        }
        return sum;
    }
}
