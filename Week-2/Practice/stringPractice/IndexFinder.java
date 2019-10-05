import java.util.*;
import java.awt.*;
/**
 * Write a description of class IndexFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IndexFinder
{
    // main method that runs everything
    public static void main(String[] a)
    {
        String s = "letterhead";
        System.out.println("In the String '" + s + "'" + "\n");
        findIndexOfChar(s, "h");
        findCharAtIndex(s, 5);
        findSubString(s, 1, 5);
        findLastIndexOfChar(s, "e");

        System.out.println("\n==============================");
        System.out.println("Using the Math class");
        calculateE(1.7);
        largerNum(123, 345);
        RandomNumRange(0, 1);
        RandomNumRange(0, 20);
        RandomNumRange(5, 6);
        RandomNumRange(10, 15);
        RandomNumRange(1, 10);

        System.out.println("\n==============================");
        System.out.println("Using the ColorSpace class");
        colorObj(120, 0, 50);
        System.out.println("The package we use is java.awt.Color");
    }
    //Write the expression to find index of the character ‘h’.
    public static void findIndexOfChar(String s, String ch)
    {
        int x = s.indexOf(ch);
        System.out.println("The index of '" + ch + "' is: " + x);
    }
    //Write the expression to retrieve the character ‘r’ from the String.
    public static void findCharAtIndex(String s, int i)
    {
        char x = s.charAt(i);
        System.out.println("At index '" + i + "' is char: " + x);
    }
    //Write the expression to get the substring “ette”.
    public static void findSubString(String s, int first, int second)
    {
        String x = s.substring(first, second);
        System.out.println("between index '" + first + "' and '" + second + "' is: " + x);
    }
    //Write the expression to find the index location of the last 'e'.
    public static void findLastIndexOfChar(String s, String ch)
    {
        int x = s.lastIndexOf(ch);
        System.out.println("The last index of '" + ch + "' is: " + x);
    }

    //Using the Math class

    //Write the expression to  calculate  e1.7 (There's more than one way to do this)
    public static void calculateE(double a)
    {
        double x = Math.exp(a);
        System.out.println("e^" + a + " is: " + x);
    }
    //Write the expression to find the larger of two values x and y
    public static void largerNum(double a, double b)
    {
        double x = Math.max(a, b);
        System.out.println("out of '" + a + "' and '" + b + "' the larger number is: " + x);
    }
    //Write the expression to generate a random number in the range [0.0, 1.0)
    public static void RandomNumRange(int min, int max)
    {
        Random a = new Random();
        int b = a.nextInt((max - min) + 1) + min;
        System.out.println("A random number between " + min + " and " + max + " is: " + b);
    }
    //Write the expression to generate a random number in the range [0.0, 20.0] 
    //Write the expression to generate a random number in the range [5.0, 6.0] 
    //Write the expression to generate a random number in the range [10.0, 15.0]
    //Write the expression to generate a random integer in the range [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    //More searching through the API

    //Write a statement to instantiate a Color object with RGB values (120, 0, 50) and binding it to an appropriate reference variable.
    public static void colorObj(int r, int g, int b)
    {
        Color x = new Color(r, g, b);
        System.out.println("My RGB color is: " + x);
    }
    //What package do you need to import to use a Color object?
}
