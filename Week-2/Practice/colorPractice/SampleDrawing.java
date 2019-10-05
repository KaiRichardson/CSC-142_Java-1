import java.awt.*;  // for the Graphics and Color classes

public class SampleDrawing
{
    public static void main(String[] a) 
    {
        
        DrawingPanel dp = new DrawingPanel(350, 200);
        dp.setBackground(Color.yellow);
        dp.setGridLines(true);  // default gridlines are 10 pixels apart
        Graphics dpg = dp.getGraphics();
        dpg.drawOval(10, 20, 50, 100);
        dpg.setColor(Color.blue);
        dpg.fillRect(100, 100, 50, 10);
    }
}