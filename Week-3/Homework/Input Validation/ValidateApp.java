import java.util.Scanner;
/**
 * This class runs a program that gets user input using the Scanner class and validates and zipcode or
 * a phone number
 * 
 * @author      Kai Richardson <kairichardson2000@gmail.com>
 * @version     1.0
 * @since       1.0
 */
public class ValidateApp
{
    /**
     * Validates that a String represents a valid 5-digit zip code
     * @param zip, the String to work with -- must be 5 char long
     * @throws new IllegalArgumentException if length of zip != 5
     * @throws new IllegalArgumentException if the loop finds a letter in zip
     * @returns primitive int of the provided zip code
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        // Display a 1 line introduction to the user
        System.out.println("This program can validate your 5-digit zip code or 10-digit phone number\n\n");

        // Display a menu with 4 options
        menu();

        // Prompt the user to input an option
        System.out.println("Please pick an option from the menu above.\n");

        // prints error message and re-prompts on user entering invalid menu option
        int x = getChoice(keyboard);

        // Prompt the user for the required input and then display the results
        // Repeat the main menu until the user enters the option to quit
        while (x != 4) {            
            switch (x) {
                case 1:
                System.out.println("Please enter your 5-digit zip code");
                String num = Validations.validateZipCode(keyboard.nextLine());
                if(num){
                    System.out.println("Please enter your 5-digit zip code");
                } else {
                    
                }

                break;
                case 2:
                System.out.println("Today is Sunday");
                break;
                case 3:
                System.out.println("Today is Sunday");
                break;
                case 4:
                System.out.println("Today is Sunday");
                break;
                // prints error message and re-prompts on user entering invalid menu option
                default:
                System.out.println("please enter a valid selection");
            }
            x = getChoice(keyboard);
        }

        System.out.println("Good-bye");
    }

    /**
     * Performs input validation. Keeps asking until input is valid
     * PRECONDITION - a prompt has already been displayed to the user
     * @param in the input stream
     * @return user input that is >= 0 or EXIT
     */
    public static int getChoice(Scanner in) {
        int x = in.nextInt();
        while (x <= 0 && x >= 5 && x != 4){
            System.out.print("Error. Please enter a valid choice:\n\n");
            menu();
        }
        return x;
    }

    /**
     * Prints a menu with 4 options
     * PRECONDITION - an action has been finalized
     * @param none
     * @return none
     */
    public static void menu() {
        System.out.println(
              "1. validate my zip code\n"
            + "2. validate my phone number\n"
            + "3. instructions\n"
            + "4. quit\n\n");
    }
}