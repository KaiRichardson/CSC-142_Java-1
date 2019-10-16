import java.util.Scanner;
/**
 * This simple class is part of a two-class demonstration project.
 * To use this class, place this file and the MyMath.java file
 * together in the same folder on your computer, then the folder 
 * in BlueJ.
 * 
 * This is an example of a class that creates a simple user
 * interface.  This class USES (is a "client" of) the 'cubeRoot'
 * method in class MyMath.  Separating code that creates a user
 * interface from code that performs computations and other tasks
 * is good design practice.
 * 
 * @author csc142
 */
public class ValidateApp
{
    private static final int EXIT = -1;
    /**
     * This is a simple user interface that accepts a series of 
     * numbers from the user and shows the cube root of each 
     * number.  In this version, the user MUST enter a number
     * or the program will crash.  In a future version, we'll 
     * see how we can handle the situation where the user enters
     * something other than a number by mistake.
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // construct a Scanner to get user input
        System.out.println("This program will calculate the fourth root of each number"
            + " you enter.  Be sure to enter only numbers.\n");
        System.out.print("Enter a positive number, or " + EXIT + " to quit: ");
        double x = getValue(keyboard);
        // testing for eqa
        while (x != EXIT) {
            double root = MyMath.fourthRoot(x);
            root = Math.round(root * 1000.0) / 1000.0;  // round result to 3 places
            System.out.println("The fourth root of " + x + " is " + root + "\n");
            System.out.print("Enter another positive number, or " + EXIT + " to quit: ");
            x = getValue(keyboard);
        }
        System.out.println("Good-bye");
    }

    /**
     * Returns user input that is >= 0 or EXIT. 
     * Performs input validation. Keeps asking until input is valid
     * PRECONDITION - a prompt has already been displayed to the user
     * @param in the input stream
     * @return the user input guaranteed to be either positive or EXIT
     */
    public static double getValue(Scanner in) {
        double userInput = getDouble(in);
        while (userInput <= 0 && userInput != EXIT){
            System.out.print("Error. Please enter either a positive number or " + EXIT + ": ");
            userInput = getDouble(in);
        }
        return userInput;
    }

    /**
     * Returns user input of a double.
     * Performs input validation. Keeps asking until input is valid
     * PRECONDITION - a prompt has already been displayed to the user
     * @param in the input stream
     * @return the user input
     */
    public static double getDouble(Scanner in) {

        while (!in.hasNextDouble()) {
            in.next(); // remove this token from the input stream and reprompt
            System.out.print("Error. Please enter a double: ");
        }
        return in.nextDouble();
    }
}