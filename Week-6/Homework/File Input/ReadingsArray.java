import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
/**
 * Supplier class for ReadingApp. 
 * 
 * @author Kai Richardson
 * @version 1.0
 * @since Fall 2019
 * 
 */
public class ReadingsArray
{
    // <public var> //
    String filename;
    Scanner input;
    RGBReading[] arr;

    // <constructor> //
    /**
     * Instantiates a ReadingArray object to hold RGBReadings, reading the data from this file.  
     * <p>
     * Note: this will crash if the file is not structured the correct way. 
     * That's fine. 
     * </p>
     * It will also throw the FileNotFoundException if the file cannot be opened. 
     * That's also fine.
     *
     * @param filename The name of the file to be sorted through.
     * @throws FileNotFoundException if the file cannot be opened.
     */
    public ReadingsArray(String filename) throws FileNotFoundException
    {
        if (filename != "")
            throw new FileNotFoundException("File cannot be opened");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a text file:> ");
        filename = keyboard.next();

        // opening file to read
        input = new Scanner(new File(filename));
        // reading first line
        String date = getDate();
        // reading second line
        int count = getCount();

        arr = new RGBReading[count];
        load(input);
        // as long as there is another String to read

        input.close();
    }

    // <other methods> //
    /**
     * Loads the array with color objects
     *
     * @param a The array being passed in.
     */
    private void load(Scanner input) 
    {
        for(int i = 0; i < arr.length; i++){
            String name = input.next();  

            float R = Integer.parseInt(input.next()); 
            float G = Integer.parseInt(input.next()); 
            float B = Integer.parseInt(input.next());  
            Color color = new Color(R, G, B); 

            int seconds = Integer.parseInt(input.next());  

            arr[i] = new RGBReading(name, color, seconds);
            //readingArray[i] = rgbReading;
        }
    }

    /**
     * Returns the date of these readings.
     *
     * @return the date of these readings.
     */
    public String getDate() 
    {
        String date = input.next();
        return date;
    }

    /**
     * Returns the number of RGBReadings in this object.
     *
     * @return the number of RGBReadings in this object.
     */
    public int getCount() 
    {
        String number = input.next();
        int numberInt = Integer.parseInt(number);
        return numberInt;
    }

    /**
     * Returns the RGBReadings with the shortest and longest times. 
     * <p>
     * Shortest is stored at index [0], longest is at [1]. 
     * The returned array has a length of 2.
     * </p>
     * 
     * @return the RGBReadings with the shortest and longest times. 
     */
    public RGBReading[] minMax()
    {
        RGBReading minTime = arr[0];
        RGBReading maxTime = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i].seconds > maxTime.seconds){
                maxTime = a[i];
            }
            if (arr[i].seconds < minTime.seconds){
                minTime = arr[i];
            }
        }

        RGBReading[] minMaxTimes = new RGBReading[2];
        minTime = minMaxTimes[0];
        maxTime = minMaxTimes[1];
        return minMaxTimes;
    }

    /**
     * Returns the count of how many times the red value increases between each sequential RGBReading, 
     * based on the order they are stored in the ReadingsArray object. 
     * <p>
     * Specifically, this counts if the red value increases from the first RGBReading to the second, 
     * count if the red value increases between the second and third RGBReading, etc
     * </p>
     * 
     * @return the count of how many times the red value increases between each sequential RGBReading.
     */
    public int posRedChangeCount()
    {
        RGBReading minTime = a[0];
        RGBReading maxTime = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i].seconds > maxTime.seconds){
                maxTime = a[i];
            }
            if (a[i].seconds < minTime.seconds){
                minTime = a[i];
            }
        }

        RGBReading[] minMaxTimes = new RGBReading[2];
        minTime = minMaxTimes[0];
        maxTime = minMaxTimes[1];
        return minMaxTimes;
    }

    /**
     * Returns an array containing two RGBReading objects who had the smallest 
     * absolute value difference in brightness levels. 
     * <p>
     * This is between any two RGBReadings in the ReadingsArray, not necessarily consecutive.
     * </p>
     *
     * @return an array containing two RGBReading objects
     */
    public RGBReading[] findSmallestGap()
    {
        RGBReading minTime = a[0];
        RGBReading maxTime = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i].seconds > maxTime.seconds){
                maxTime = a[i];
            }
            if (a[i].seconds < minTime.seconds){
                minTime = a[i];
            }
        }

        RGBReading[] minMaxTimes = new RGBReading[2];
        minTime = minMaxTimes[0];
        maxTime = minMaxTimes[1];
        return minMaxTimes;
    }

    /**
     * Writes the brightness values for all the RGBReading objects to the file specified. 
     * <p>
     * The first line of the file is the date, followed by each RGBReading name and its brightness, 
     * separated by a space. One RGBReading per line.
     * </p>
     *
     * @param filename A parameter
     * @throws FileNotFoundException for a null argument.
     */
    public void save(String filename) throws FileNotFoundException
    {
        RGBReading minTime = a[0];
        RGBReading maxTime = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i].seconds > maxTime.seconds){
                maxTime = a[i];
            }
            if (a[i].seconds < minTime.seconds){
                minTime = a[i];
            }
        }

        RGBReading[] minMaxTimes = new RGBReading[2];
        minTime = minMaxTimes[0];
        maxTime = minMaxTimes[1];
        return minMaxTimes;
    }

    /**
     * Returns a String that represents the state of this object. 
     * <p>
     * The String starts with the date, followed by the toString() for each RGBReading object, 
     * separated by a new line character.
     * </p>
     * 
     * @return a String that represents the state of this object.
     */
    public String toString()
    {
        String recordedColor = "2";
        return recordedColor;
    }

}
