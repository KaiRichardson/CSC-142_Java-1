/**
 * Top-level client -- controls the application.  This GUI program prompts
 * the user for a date and then determines the date
 * 30 days in the future.
 * <br>
 * This is the file you need to modify to complete the assignment. The majority
 * of your work will be in the method respondToUser(), though you may decide
 * to add code in other places as well
 * <br>
 * To start the program, call the main() method.
 * 
 * @author CSC 142 
 * @version 1-23-07
 */
public class FindADate 
{
    private UserWindow window;

    /**
     * Create a new FindADate object
     */
    public FindADate( ) {
        window = new UserWindow(this);
    }
    
    /**
     * Perform the task of determining 30 days from the given day.
     */
    public void respondToUser()
    {
       System.out.println("You've downloaded and compiled correctly");
    }
    
// NO NEED TO CHANGE ANY CODE BELOW THIS LINE.
     /**
     * Allows this application to be run as a stand-alone program, and
     * also starts it up in a 'thread-safe" way.
     */
    public static void main( String[] args ) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FindADate pa = new FindADate( );
            }
        });
    }   
}