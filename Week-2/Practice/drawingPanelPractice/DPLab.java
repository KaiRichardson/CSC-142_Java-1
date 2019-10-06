import java.awt.*;

/**
 * This class demonstrates the use of the graphics tools in Java.  To use
 * it, place this file in a folder along with the file DrawingPanel.java
 * You can find the DrawingPanel.java file in this week's examples, and it is also
 * available on the text book's companion web site in the "Supplements" 
 * area.  
 * 
 * This class also demonstrates the use of a parameterized method named
 * drawImage() that draws a scaled version of an image every
 * time it is called.  Notice how this makes it easy to create a complex
 * drawing with a modest amount of code.
 *
 * Finally, notice the details in the method block comment. You want that same level
 * of detail in your documentation.
 */
public class DPLab
{
    /**
     * This 'main' method creates a drawing panel and draws a scene in it.
     */
    public static void main( String[] args ) {
        // Set up the DrawingPanel object and get a reference to its Graphics
        DrawingPanel dp = new DrawingPanel();
        dp.setBackground( Color.LIGHT_GRAY );
        Graphics dpg = dp.getGraphics();

        // drawing some simple shapes
        dpg.drawOval(50, 50, 100, 100);
        dpg.setColor(Color.red);
        dpg.fillRect(100, 80, 90, 130);

        // Draw one image
        // drawImage( dpg, 170, 10, 80, Color.green );

        /**
         * TODO:
         * (1) After line 32, add code to change the color and then *draw* a rectangle at the same location and same
         * dimensions as the call to fillRect(). You should see a border around the red rectangle.
         * (2) Uncomment line 35 and run to see what this does.
         * (3) Create a custom color (see the Color class API) and use that instead of a Color constant.
         * (4) Write a for loop to call drawImage() with different arguments and see what happens.
         * 
         * At the bottom of this file there is a list of other useful methods. Give these a try.
         * 
         * HAVE FUN!
         */

    }
    /**
     * This method draws an image of a filled ellipse with a white vertical and horizontal line
     * across the middle. The width of the ellipse is 2 times the height.
     *
     * @param g the Graphics context to use for the drawing
     * @param x the x-coordinate of the upper-left corner of the ellipse's bounding box in pixels
     * @param y the y-coordinate of the upper-left corner of the ellipse's bounding box in pixels
     * @param height the height the ellipse in pixels
     * @param c the Color of the ellipse
     */
    public static void drawImage( Graphics g, int x, int y, int height , Color c) {

        int width = height * 2;

        // draw the ellipse first, then the white lines
        g.setColor( c );
        g.fillOval( x, y, width, height  );
        g.setColor( Color.WHITE );

        // horizontal line
        g.drawLine( x, y + height / 2, x + width, y + height / 2 );

        // vertical line
        g.drawLine( x + width/2, y, x + width/2, y + height );
    }
}

/**
 * DrawingPanel methods:
 *   Graphics getGraphics()
 *   void setBackground(Color c)
 * 
 * Graphics methods:
 *   void drawLine(int x1, int y1, int x2, int y2)
 *   void drawOval(int x, int y, int width, int height)
 *   void drawRect(int x, int y, int width, int height)
 *   void fillOval(int x, int y, int width, int height)
 *   void fillRect(int x, int y, int width, int height)
 *   void drawString(String message, int x, int y)
 *   void setColor(Color c)
 *   void setFont( ... ) [see info in the text beginning on page 202]
 * 

 */