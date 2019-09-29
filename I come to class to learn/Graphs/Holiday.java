/**
 * Class MyPanel
 * Demonstrates basic drawing methods and the use of color.
 *
 */
import java.awt.*;
import javax.swing.*;

public class Holiday extends JPanel{

  public Holiday(){
    setPreferredSize(new Dimension(600, 600));
    setBackground(Color.white);
  }

  public void paintComponent (Graphics g){
    super.paintComponent(g); //this line should always be here

    g.setColor(Color.blue);
    g.fillRect(300,250,400,600);
    g.drawArc(100,100,500,500,-180,180);
  }



}
