
/**
 * Write a description of class showTwos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class showTwos
{
    public void showTwos(int num) {
        int val = num;
        int count = 0;

        while(val % 2 == 0) {
            count++;
            val /= 2;
        }

        System.out.print(num + " = ");

        for(int i = 0; i < count; i++)
            System.out.print("2 * ");

        System.out.print(val);
    }
}
