import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
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

    // <constructor> //
    /**
     * ReadingsArray Constructor
     * initializes a ReadingArray object to hold RGBReadings, reading the data from this file.  
     * 
     * Note: this will crash if the file is not structured the correct way. 
     * That's fine. 
     * 
     * It will also throw the FileNotFoundException if the file cannot be opened. 
     * That's also fine.
     *
     * @param filename A parameter
     * @throws FileNotFoundException if the file cannot be opened.
     */
    public ReadingsArray(String filename) throws FileNotFoundException
    {
        if (filename != "")
            throw new FileNotFoundException("n must be positive");

    }

    // <other methods> //
    /**
     * Method getDate
     *
     * @return the date of these readings
     */
    public String getDate() 
    {
        String recordedColor = "2";
        return recordedColor;
    }

    /**
     * Method getCount
     *
     * @return the number of RGBReadings in this object
     */
    public int getCount()
    {
        int recordedColor = 2;
        return recordedColor;
    }

    /**
     * Method minMax
     * Returns the RGBReadings with the shortest and longest times. 
     * 
     * Shortest is stored at index [0], longest is at [1]. 
     * The returned array should have length 2.
     *
     * @return the RGBReadings with the shortest and longest times. 
     */
    public RGBReading[] minMax()
    {
        String[] minMaxArray;

        RGBReading[] minMaxTimes;
        return minMaxTimes;
    }

    /**
     * Method posRedChangeCount
     * Return the count of how many times the red value increases between each sequential RGBReading, 
     * based on the order they are stored in the ReadingsArray object. 
     * 
     * Specifically, count if the red value increases from the first RGBReading to the second, 
     * count if the red value increases between the second and third RGBReading, etc
     *
     * @return the count of how many times the red value increases between each sequential RGBReading.
     */
    public int posRedChangeCount()
    {
        int recordedColor = 2;
        return recordedColor;
    }

    /**
     * Method findSmallestGap
     * Returns an array containing two RGBReading objects who had the smallest 
     * absolute value difference in brightness levels. 
     * 
     * This is between any two RGBReadings in the ReadingsArray, not necessarily consecutive.
     *
     * @return an array containing two RGBReading objects
     */
    public RGBReading[] findSmallestGap()
    {
        String[] SmallestGapArray;

        RGBReading[] SmallestGap;
        return SmallestGap;
    }

    /**
     * Method save
     * writes the brightness values for all the RGBReading objects to the file specified. 
     * 
     * The first line of the file is the date, followed by each RGBReading name and its brightness, 
     * separated by a space. One RGBReading per line.
     *
     * @param filename A parameter
     * @throws FileNotFoundException for a null argument.
     */
    public void save(String filename) throws FileNotFoundException
    {
        if (filename != "")
            throw new FileNotFoundException("No File Found With That Name");
    }

    /**
     * Method toString
     * Returns a String that represents the state of this object. 
     * 
     * The String should start with the date, followed by the toString() for each RGBReading object, 
     * separated by a new line character.
     *
     * @return a String that represents the state of this object.
     */
    public String toString()
    {
        String recordedColor = "2";
        return recordedColor;
    }

}
