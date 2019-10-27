import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Program to read in a text file and print out the number of characters for each "word"
 * 
 * @author csc142
 */
public class ReadStrings
{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a text file:> ");
        String filename = keyboard.next();

        readInput(filename);
    }

    /**
     * method to read in text froma file and display each String and its length.
     * @param name the name of the file to open for reading
     * @throws FileNotFoundException if the file cannot be found
     */

    public static void readInput(Scanner file) throws FileNotFoundException {
        while (file.hasNextLine()) {
            String line = file.nextLine();
            Scanner input = new Scanner(line);

            while (input.hasNext()) {
                System.out.print(input.next() + " ");
            }

            System.out.println();
        }
        file.close();  
    }
}