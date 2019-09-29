
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BouncingBall2 extends JPanel implements ActionListener
{
   int x = 250;
   int y = 200;
   int xa = 1; 
   int ya =1;
   JButton button = new JButton("Move");
   JButton button2 = new JButton("Color");
   boolean move = false;
   Color color = Color.red;
   
   public BouncingBall2()
   {
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.yellow);
        button.addActionListener(this);
        button2.addActionListener(this);
        add(button);
        add(button2);
       
   }
    public void paintComponent (Graphics page)
   {
       super.paintComponent(page);
       page.setColor(color);
       page.fillOval(x,y,50,50);
       
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
       if(move)
         repaint();
   }
   
   public void actionPerformed(ActionEvent e)
   {
       if(e.getSource() == button)
       {
           move = !move;
           if(move)
            button.setText("Stop");
           else
            button.setText("Move");
       }
       if(e.getSource() == button2)
        if(color.equals(Color.red))
          color = Color.blue;
        else  
          color = Color.red;
    }
   
    public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Demonstrates the use of JFrame");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.add(new BouncingBall2());
      frame.pack();
      frame.setVisible(true);
      
   } 
    
  
}
