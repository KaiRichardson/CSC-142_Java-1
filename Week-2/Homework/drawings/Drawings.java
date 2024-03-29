import java.awt.*;

/**
 * 2 part project to make something creative on my own and the copy Ehrenstein Illusions provided.
 * 
 * @author Kai Richardson
 * @date 10/05/2019
 */
public class Drawings
{
    // This method creates 2 drawing panels and draws a scene in each
    public static void main( String[] args ) {
        // Draws personal image
        drawImage();
        // Draws provided image
        drawIllusions();
    }

    // This method runs part 1 of HW
    public static void drawImage() {
        // Set up the DrawingPanel object and get a reference to its Graphics
        DrawingPanel dp = new DrawingPanel(700, 500);
        Graphics dpg = dp.getGraphics();
        //dp.setGridLines(true, 50);

        // Setting forground / hills
        Color hills = new Color(101, 176, 90);
        dpg.setColor(hills);
        dpg.fillRect(0, 250, 700, 250);

        // Hill edits
        Color sky = new Color(186, 230, 255);
        Color hillsBack = new Color(143, 222, 131);

        // base for background hill
        dpg.setColor(hillsBack);
        dpg.fillOval(345, 200, 400, 80);

        // sky cut to make room for arc
        dpg.setColor(sky);
        dpg.fillRect(0, 0, 700, 250);

        // sun with fan out
        Color sun = new Color(252, 255, 158);
        dpg.setColor(sun);
        dpg.fillOval(40, 20, 70, 70);
        drawCirclePoints(20, 1000, 75, 55, dpg);

        // top for background hill
        dpg.setColor(hillsBack);
        dpg.fillArc(270, 230, 500, 100, 20, 120);

        // left hill
        dpg.setColor(hills);
        dpg.fillOval(-35, 220, 400, 90);

        // covering sunbeams with more hill
        int xPoints[] = {0, 0, 350, 700, 700};
        int yPoints[] = {700, 250, 250, 400, 700};
        int nPoints = 5;
        dpg.fillPolygon(xPoints, yPoints, nPoints);

        // cloud layers
        Color cloud1 = new Color(235, 235, 235);
        dpg.setColor(cloud1);
        dpg.fillOval(520, 50, 100, 120);
        Color cloud2 = new Color(250, 250, 250);
        dpg.setColor(cloud2);
        dpg.fillOval(500, 40, 150, 100);
        Color cloud3 = new Color(250, 250, 250);
        dpg.setColor(cloud3);
        dpg.fillOval(450, 60, 130, 90);
        Color cloud4 = new Color(235, 235, 235);
        dpg.setColor(cloud4);
        dpg.fillOval(480, 70, 100, 30);

        // forground hills with grass
        Color forground1 = new Color(87, 158, 89);
        dpg.setColor(forground1);
        dpg.fillArc(-560, 320, 1500, 400, 10, 120);
        Color forground2 = new Color(73, 135, 75);
        dpg.setColor(forground2);
        dpg.fillArc(-500, 380, 2000, 400, 60, 120);

        // dandelion with seed petals
        Color stem = new Color(159, 255, 138);
        Color body = new Color(232, 215, 183);
        Color petles = new Color(235, 235, 235);
        dpg.setColor(stem);
        dpg.drawArc(350, 350, 50, 50, 50, -100);
        dpg.setColor(petles);
        drawCirclePoints(30, 10, 390, 350, dpg);

        // printing my name at the bottom
        dpg.setColor(Color.WHITE);
        final String s = "Kai Richardson";
        dpg.drawString(s, 10, 490);
    }

    // This method runs part 2 of HW, creating a plane of Ehrenstein Illusions
    public static void drawIllusions() {
        // Set up the DrawingPanel object and get a reference to its Graphics
        DrawingPanel dp = new DrawingPanel(850 , 850);
        Graphics dpg = dp.getGraphics();
        dp.setBackground(Color.GRAY);

        // drawing single disks
        triangleOfCircles(50, 300, 30, 1, dpg);
        triangleOfCircles(750, 50, 50, 1, dpg);
        triangleOfCircles(525, 325, 90, 1, dpg);

        // drawing the triangles of disks
        triangleOfCircles(135, 50, 25, 4, dpg);
        triangleOfCircles(215, 600, 70, 3, dpg);
        triangleOfCircles(725, 550, 20, 5, dpg);
    }

    // This method draws a disk with concentric circles and a box inside
    public static void drawDisks(int x, int y, int radius, Graphics dpg)
    {        
        // adding number of circles in disk and diameter of disk
        final int circleNum = 8;
        int circleDiameter = radius*2;
        
        // the radius of the smallest center circle 
        final double smallRad = (radius /circleNum);

        // the spaceing between the rings
        int increment = (int) (radius + smallRad) /circleNum;

        // centering the disk on the provided x,y cord
        x -= radius;
        y -= radius;

        //adding color to circles and box
        dpg.setColor(Color.YELLOW);
        dpg.fillOval(x, y, circleDiameter, circleDiameter);
        dpg.setColor(Color.BLACK);

        // adding box inside circle 
        int xPoints[] = {x+radius, x, x+radius, x+(circleDiameter), x+radius};
        int yPoints[] = {y, y+radius, y+(circleDiameter), y+radius, y};
        int nPoints = 5;
        dpg.drawPolyline(xPoints, yPoints, nPoints);

        // adding inside rings
        for (int i = 0; i <= circleNum; i++)
        {
            dpg.drawOval(x, y, circleDiameter, circleDiameter);
            // modifying info after print
            x += increment;
            y += increment;
            circleDiameter -= increment*2;
        }
    }

    // This method draws a triangle made of disks from the 'drawDisks' method
    public static void triangleOfCircles(int x, int y, int radius, int rows, Graphics dpg)
    {   
        for (int i = 1; i < rows +1; i++)
        {
            // keeping disk x cord separate from trangle x cord
            int x2 = x; 
            for (int j = 1; j < i +1; j++)
            {
                //printing all disks in current row, mod after
                drawDisks(x2, y, radius, dpg);
                x2 += radius*2;
            }
            // modifying triangle row x,y cord after print
            x -= radius;
            y += radius;
        }
    }

    // This method draws a burst of lines from a central point
    public static void drawCirclePoints(int points, double radius, int x1, int y1, Graphics dpg)
    {        
        // creating a slice of PI, YUM!
        double slice = 2 * Math.PI / points;
        for (int i = 0; i < points; i++)
        {
            // creating angle to draw line at, and mod on every loop befor print
            double angle = slice * i;
            int x2 = (int)(x1 + radius * Math.cos(angle));
            int y2 = (int)(y1 + radius * Math.sin(angle));
            dpg.drawLine(x1, y1, x2, y2);
        }
    }
}