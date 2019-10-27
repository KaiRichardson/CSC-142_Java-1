import java.io.*;
import java.util.*;
/**
 * Program to read in numbers from a text file and display them to the user
 * 
 * @author csc 142
 */
public class ReadNumbers
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a file of numbers:> ");
        String filename = keyboard.next();

        Scanner input = new Scanner(new File(filename));

        int i = 0;

        // while there is another number to read
        while (input.hasNextDouble()){
            double d = input.nextDouble();  // read it
            i++;
            System.out.println("[value " + i + "] = " + d);
        }
        input.close();    // Make sure to close the file when done. Free up resources
    }
}