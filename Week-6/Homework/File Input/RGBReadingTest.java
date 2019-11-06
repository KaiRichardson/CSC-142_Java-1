import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class RGBReadingTest 
{    
    // <public var> //
    String name;
    java.awt.Color color;
    int seconds;

    // <method tests> //
    @Test
    public void testGetColor() {
        RGBReading rgbReading = new RGBReading(name, color, seconds);

        java.awt.Color result = rgbReading.getColor();

        assertEquals("onetwo", result);

    }
}
