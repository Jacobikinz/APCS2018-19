//*******************************************************************************
//  Fish.java       Author: Ariel Traiber
//
//  Demonstrates basic drawing methods, the use of color and how to add a picture
//******************************************************************************
import javax.swing.*;
import java.awt.*;

public class Fish extends JPanel
{
    ImageIcon image = new ImageIcon("fish.jpg");
    int imageW = image.getIconWidth();
    int imageH = image.getIconHeight();

    public Fish()
    {
        setPreferredSize (new Dimension(2*imageW, imageH));
        setBackground (new Color(162,107,162));

    }
   //-----------------------------------------------------------------
   //  Draws a fish.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      final int MIDX = 300;
      final int MIDY = 260;

      page.setColor (Color.red);
      int[] xcoor = {210, 140, 140};
      int[] ycoor = {260, 190, 300};
      page.fillPolygon(xcoor, ycoor, 3);

      page.setColor (Color.yellow);
      page.fillArc (MIDX-100, MIDY-90, 200, 180, 30, 330);   // main body


      page.setColor (Color.red);
      page.drawArc (200, 120, 100, 100, 0, 90); //upper fin top
      page.drawArc (240, 120, 20, 100, -10, 100); //upper fin bottom

      page.drawArc (200, 300, 100, 100, 270, 90); //lower fin top
      page.drawArc (240, 300, 20, 100, 270, 100); //lower fin bottom

      page.drawArc (MIDX, MIDY, 50, 40, 0, -80); //gills
      page.drawArc (MIDX+5, MIDY+5, 50, 40, 0, -80); //gills
      page.drawArc (MIDX+10, MIDY+10, 50, 40, 0, -80); //gills


      page.setColor (Color.green);
      page.fillOval (MIDX+10, MIDY-50, 30, 20);//eye

      page.setColor (Color.black);
      page.fillOval (MIDX+15, MIDY-45, 10, 6); //iris

      page.drawRect (60, 80, 100, 30);
      page.drawString ("Ariel's Fish", 75, 100);

      page.fillArc(300, 250, 100, 20, 180, 180); //mouth

      page.setColor (Color.white); //bubbles

      page.drawOval (MIDX+110, MIDY-40, 30, 20);
      page.drawOval (MIDX+115, MIDY-60, 20, 10);
      page.drawOval (MIDX+120, MIDY-80, 10, 5);

      image.paintIcon(this, page,imageW, 0);
   }

   public static void main (String[] args)
   {
      //Set up frame
      JFrame frame = new JFrame ("Programming Execercie 7: Ariel Traiber");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.add(new Fish());
      frame.pack();
      frame.setVisible(true);
   }

}
