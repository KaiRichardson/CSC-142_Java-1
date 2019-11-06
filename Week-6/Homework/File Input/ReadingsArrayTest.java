import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class ReadingsArrayTest 
{    
    // <public var> //
    String filename;

    // <method tests> //
    @Test
    public void testGetColor() {
        ReadingsArray readingsArray = new ReadingsArray(filename);

        String result = readingsArray.getDate();

        assertEquals("onetwo", result);

    }
}
