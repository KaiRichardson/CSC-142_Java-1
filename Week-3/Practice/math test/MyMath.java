/**
 * This simple class is part of a two-class demonstration project.
 * To use this class, place this file and the TestMyMath.java file
 * together in the same folder on your computer, then open the folder in BlueJ
 * 
 * This is an example of a class that provides tools that can be
 * used by other classes, just like the Math class built into Java.
 * MyMath is referred to as a SUPPLIER class, because it is supplying functionality.
 * 
 * @author csc142
 */
public class MyMath
{
    /**
     * Computes the fourth root of a number. 
     * @param num the number to work with -- must be >= 0
     * @throws new IllegalArgumentException if num is < 0
     * @returns the 4th root of num
     */
    public static double fourthRoot(double num) {
        if (num < 0)
            throw new IllegalArgumentException("The argument must be >= 0");
        double ans = Math.pow(num, 0.25);  // raise to 1/4 power
        return ans;
    }
}

/**
 *  TEST CASES
 *  fourthRoot(16) expected result is 2. Actual result matches.
 *  fourthRoot(81) expected result is 3. Actual result matches.
 *  fourthRoot(-1) expected result is to throw an exception. Actual result matches.
 */

/*
 * Notice that this class does not contain a 'main' method. You can test the
 * fourthRoot method by writing statement in BlueJ's CodePad 
 * that CALL the method.  Since this is a static method, the qualifier
 * in the method call is the class name.  Here's an example:
 * 
 * double result = MyMath.fourthRoot(16);
 * 
 * Or, you can right-click on the MyMath icon in BlueJ and call this method that way.
 * When you are designing the solution to a larger programming application,
 * it is often valuable to break that large task down into smaller tasks.
 * Frequently these self-contained sub-tasks will be coded as independent
 * methods like the cubeRoot method above.  It is good practice to test
 * and debug each independent method to make sure they work before you try
 * to join everything together in the final program.
 */