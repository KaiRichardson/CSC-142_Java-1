import java.awt.*;

public class SampleDrawing
{
    public static void main(String[] a)
    {
        DrawingPanel dp = new DrawingPanel(700, 400);
        dp.setGridLines(true);
        Graphics dpg = dp.getGraphics();
        dpg.setColor(Color.BLUE);
        dpg.drawOval(100, 100, 100, 100);
        
        dpg.fillOval(100, 100, 90, 90);
    } 
}
