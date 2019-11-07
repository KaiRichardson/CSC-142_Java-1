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
    private String name;
    private java.awt.Color color;
    private int seconds;
    private double R;
    private double G;
    private double B;

    // <constructor> //
    /**
     * Instantiates an object with the values "name", "color" and "seconds". 
     *
     * @param name RGBReading's name.
     * @param color RGBReading's color.
     * @param seconds RGBReading's time in seconds.
     * @throws IllegalArgumentException if invalid time (time must be > 0). 
     * @throws NullPointerException if either of the references are null.
     */
    public RGBReading(String name, java.awt.Color color, int seconds)
    {
        name = getName();
        color = getColor();
        seconds = getTime();

        if (seconds < 0){
            throw new IllegalArgumentException("Seconds must be a positive number");
        }

        if (name == null || color == null){
            throw new NullPointerException("Name and Color must not be null");
        }
    }

    // <other methods> //
    /**
     * Returns the recorded Color of this RBGReading
     *
     * @return the recorded Color of this RBGReading
     */
    public java.awt.Color getColor()
    {
        return color;
    }

    /**
     * Returns the recorded seconds of this object
     *
     * @return the recorded seconds of this object
     */
    public int getTime()
    {
        return seconds;
    }

    /**
     * Returns the name of this RBGReading's sensor.
     *
     * @return the name of this RBGReading's sensor.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the perceived brightness of this RBGReading's color
     * The formula for calculating perceived brightness = sqrt( 0.241 R2 + 0.691 G2 + 0.068 B2 )
     *
     * @return the perceived brightness of this RBGReading's color
     */
    public double brightness()
    {
        float[] rgb = color.getRGBColorComponents(null);
        R = rgb[0];
        G = rgb[1];
        B = rgb[2];

        double perceivedBrightness = Math.sqrt(0.241 * (R*R) + 0.691 * (G*G) + 0.068 * (G*G));
        return perceivedBrightness;
    }

    /**
     * Returns a String representation of this object, of the form "Name (r, g, b):s"  
     * Including this RGBReading's name, the red, green, and blue values of the color, and the time.
     *
     * @return a String representation of this object.
     */
    public String toString()
    {
        String stringForm = name + " (" + R + ", " + G + ", " + B + "):" + seconds;
        return stringForm;
    }

    /**
     * Changes the Color of this object. 
     *
     * @param color The color selected to change the object too.
     * @throws NullPointerException for a null argument.
     */
    public void setColor(java.awt.Color color)
    {
        if (color == null){
            throw new NullPointerException("color must not be null");
        } else {
            this.color = color;
        }
    }

    /**
     * Changes the recorded seconds for this object. 
     *
     * @param seconds A parameter
     * @throws IllegalArgumentException for invalid argument.
     */
    public void setTime(int seconds)
    {
        if (seconds < 0){
            throw new IllegalArgumentException("Seconds must be a positive number");
        } else {
            this.seconds = seconds;
        }
    }

}
