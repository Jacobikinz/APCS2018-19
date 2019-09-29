/**
 * Class MyPanel 
 * Demonstrates basic drawing methods and the use of color.
 * 
 */
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{
    
    public MyPanel()
    {
        setPreferredSize(new Dimension(500, 300));
        setBackground(Color.yellow);
    }
 
   public void paintComponent (Graphics g)
   {
       super.paintComponent(g); //this line should always be here

        //Rectangle (outline)
        g.drawRect(200, 40, 80, 50);
        
        //Line
        g.drawLine(200, 200, 300, 40);
 
        //Arc
        g.drawArc(250, 100, 100, 100, 0, 90);
        //Set the color for the first rectangle
       
        g.setColor (Color.blue);
        //First filled rectangle
        g.fillRect(400, 50, 50, 200);

        //Set the color for an oval overlapping the first rectangle
        g.setColor (Color.magenta);
        //First filled oval
        g.fillOval(210, 50, 30, 40);

        //Set the color for another rectangle
        g.setColor (Color.green);
        //Second filled rectangle
        g.fillRect(350, 20, 55, 25);

        //Set the color for an oval not overlapping any of the other shapes
        g.setColor (Color.pink);
        //Second filled oval
        g.fillOval(20, 100, 100, 100);
        
        g.setColor(Color.blue);
        //Line of Text
        g.drawString("This is an example of graphical components", 50, 250);
        
        g.setColor(new Color(0, 200, 255));
        //draw a polygon
        int[] xcoor = {0, 50, 50};
        int[] ycoor = {0, 30, 100};
        g.fillPolygon(xcoor,ycoor,3);

    }
   
    
    
}
