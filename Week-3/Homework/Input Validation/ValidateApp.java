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
     * Starts the application and calls the menu() method
     * @param general args
     * @throws none
     * @returns none
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        // Display a 1 line introduction to the user
        System.out.println("This program can validate your 5-digit zip code or 10-digit phone number");

        // Prompt the user to input an option and display a menu with 4 options
        menu(keyboard);

    }

    /**
     * Validates menu option selection 1 - 4, Keeps asking until input is valid
     * PRECONDITION - menu() is called 
     * @param in the input stream
     * @return user input that is 1 - 4
     */
    public static int getChoice(Scanner in) {
        int userInput = getInt(in);
        while (userInput <= 0 || userInput >= 5){
            // prints error message and re-prompts on user entering invalid menu option
            System.out.print("Error. Please enter a number 1-4: ");
            userInput = getInt(in);
        }
        return userInput;
    }

    /**
     * Validates that menu option selection is a number, Keeps asking until input is valid
     * PRECONDITION - getChoice() is called 
     * @param in the input stream
     * @return user input that is a number from 1 - 4
     */
    public static int getInt(Scanner in) {
        while (!in.hasNextInt()) {
            in.next(); 
            System.out.print("Error. That was a letter, only numbers please: ");
        }
        return in.nextInt();
    }

    /**
     * Performs zip code length validation and then calls validateZipCode(). 
     * PRECONDITION - user selects menu option 1
     * @param in the input stream
     * @return none
     */
    public static void vZipCode(Scanner in) {
        // Prompt the user for the required input 
        System.out.print("Please enter your 5-digit zip code: ");

        // validates number length
        String zip = in.next();
        while (zip.length() != 5){
            System.out.print("Zip code must be 5 numbers: ");
            in.nextLine();
        }

        // display the results
        boolean num = Validations.validateZipCode(zip);
        if(num){
            System.out.println("Hey! Thats a bonafide Zip-Code!");
        } else {
            System.out.println("Oh, try that one again, like this: XXXXX");
        }
        menu(in);
    }

    /**
     * Performs phone number length validation and then calls validatePhoneNumber(). 
     * PRECONDITION - user selects menu option 2
     * @param in the input stream
     * @return none
     */
    public static void vPhoneNumber(Scanner in) {
        // Prompt the user for the required input 
        System.out.print("Please enter your 10-digit phone number: ");

        // validates number length
        String phone = in.next();
        while (phone.length() != 12){
            System.out.print("Phone number must be 10 numbers: ");
            in.nextLine();
        }

        // display the results
        boolean num = Validations.validatePhoneNumber(phone);
        if(num){
            System.out.println("Oh! That Phone-Number looks great!");
        } else {
            System.out.println("Oh, try that one again, like this: XXX-XXX-XXXX");
        }
        menu(in);
    }

    /**
     * Prints a menu with 4 options, then calls method based on user input
     * PRECONDITION - an action has been finalized
     * @param in the input stream
     * @return none
     */
    public static void menu(Scanner keyboard) {
        System.out.print(
            "\n****************************\n"
            + "1. validate my zip code\n"
            + "2. validate my phone number\n"
            + "3. instructions\n"
            + "4. quit\n\n"
            +"Please pick an option: ");

        // prints error message and re-prompts on user entering invalid menu option
        int x = getChoice(keyboard);

        // Repeat the main menu until the user enters the option to quit
        switch (x) {
            case 1:
            vZipCode(keyboard);
            case 2:
            vPhoneNumber(keyboard);
            case 3:
            instructions(keyboard);
        }
        System.out.print("Good-bye");
    }

    /**
     * Prints instructions on how to formate a zip code and phone number
     * PRECONDITION - user selects menu option 3
     * @param none
     * @return none
     */
    public static void instructions(Scanner in) {
        System.out.println(
            "INSTRUCTIONS:\n\n"

            + "Zip-Code\n"
            + "****************************\n"
            + "Format: XXXXX\n"
            + " * Must be 5-digits\n"
            + " * Only numbers\n" 
            + " * No spaces.\n\n"

            + "Phone-Number\n"
            + "****************************\n"
            + "Format: NPA-NXX-XXXX\n"
            + " * Must be 10-digits\n"
            + " * Only numbers\n" 
            + " * two dashes.\n"
            + " * NPA is 3 digits.\n"
            + "     - It must start with a digit between 2 and 9.\n"
            + "     - The middle digit is between 0 and 8, the third digit is between 0 and 9\n"
            + " * NXX is 3 digits.\n"
            + "     - It must start with a digit between 2 and 9.\n"
            + "     - The last 2 digits can be between 0 and, 9, except that they can't both be 1.\n"
            + " * XXXX can be any 4 digits.\n"
        );
        menu(in);
    }
}