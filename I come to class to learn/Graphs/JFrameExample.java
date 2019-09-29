/**
 *Demonstrates the use of JFrame.
 *
 */
import javax.swing.*;



public class JFrameExample
{

    public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Demonstrates the use of JFrame");
      frame.add(new Holiday());
      frame.pack();
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

   }
}
