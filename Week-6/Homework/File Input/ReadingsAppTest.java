import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class ReadingsAppTest 
{    
    // <public var> //
    String[] args;

    // <method tests> //
    @Test
    public void testprocessLoad() {
        ReadingsApp readingsApp = new ReadingsApp();

        readingsApp.main(args);

        //assertEquals("onetwo", result);

    }
}
