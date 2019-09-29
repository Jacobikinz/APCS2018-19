import java.awt.*;
import javax.swing.*;

//This class illustrate a simple animation
public class BouncingBall extends JPanel 
{
   int x = 40;
   int y = 0;
   int xa = 1; 
   int ya =1;
   
   public BouncingBall()
   {
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.yellow);       
   }
    public void paintComponent (Graphics page)
   {
       super.paintComponent(page);
       page.setColor(Color.red);
       page.fillOval(x,y,50,50);
       
       //pause for 5 milliseconds
       try
       { 
           Thread.sleep(5); 
       }
       catch(InterruptedException ex)
       {}
       
       if (x + xa < 0)
           xa = 1;
       if (x + xa > this.getWidth() - 50)
           xa = -1;
       if (y + ya < 0)
           ya = 1;
       if (y + ya > this.getHeight() - 50)
           ya = -1;
       x = x + xa;
       y = y + ya;
       repaint();
   }
   
   
    public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Demonstrates the use of JFrame");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.add(new BouncingBall());
      frame.pack();
      frame.setVisible(true);
      
   }
  
}
