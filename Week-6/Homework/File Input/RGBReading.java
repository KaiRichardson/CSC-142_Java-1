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
public class RGBReading
{
    // <public var> //

    // <constructor> //
    /**
     * RGBReading Constructor
     * initialize this object with the given values. 
     * Throws an IllegalArgumentException for invalid time (time must be > 0). 
     * Throws NullPointerException if either of the references are null.
     *
     * @param name A parameter
     * @param color A parameter
     * @param seconds A parameter
     * @throws IllegalArgumentException for invalid time (time must be > 0). 
     * @throws NullPointerException if either of the references are null.
     */
    public RGBReading(String name, java.awt.Color color, int seconds)
    {
        if (seconds > 0)
            throw new IllegalArgumentException("Seconds must be a positive number");
        if (name == null || color == null)
            throw new NullPointerException("Name and Color must not be null");
    }

    // <other methods> //
    /**
     * Method getColor
     * Returns the recorded Color of this RBGReading
     *
     * @return the recorded Color of this RBGReading
     */
    public java.awt.Color getColor()
    {
        java.awt.Color recordedColor = Color.BLACK;
        return recordedColor;
    }

    /**
     * Method getTime
     * Returns the recorded seconds of this object
     *
     * @return the recorded seconds of this object
     */
    public int getTime()
    {
        int recordedColor = 2;
        return recordedColor;
    }

    /**
     * Method getName
     * Returns the name of this RBGReading's sensor.
     *
     * @return the name of this RBGReading's sensor.
     */
    public String getName()
    {
        String recordedColor = "2";
        return recordedColor;
    }

    /**
     * Method brightness
     * Returns the perceived brightness of this RBGReading's color
     * The formula for calculating perceived brightness = sqrt( 0.241 R2 + 0.691 G2 + 0.068 B2 )
     *
     * @return the perceived brightness of this RBGReading's color
     */
    public double brightness()
    {
        double recordedColor = 2;
        return recordedColor;
    }

    /**
     * Method toString
     * Returns a String representation of this object, of the form "Name (r, g, b):s"  
     * Including this RGBReading's name, the red, green, and blue values of the color, and the time.
     *
     * @ return a String representation of this object.
     */
    public String toString()
    {
        String recordedColor = "2";
        return recordedColor;
    }

    /**
     * Method setColor
     * Change the Color of this object. 
     *
     * @param color A parameter
     * @throws NullPointerException for a null argument.
     */
    public void setColor(java.awt.Color color)
    {
        if (color != Color.BLACK)
            throw new NullPointerException("n must be < 60");
    }

    /**
     * Method toString
     * Change the recorded seconds for this object. 
     *
     * @param seconds A parameter
     * @throws IllegalArgumentException for invalid argument.
     */
    public void setTime(int seconds)
    {
        if (seconds < 0)
            throw new IllegalArgumentException("n must be positive");
    }

}
