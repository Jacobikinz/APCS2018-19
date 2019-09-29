import javax.swing.*;

public class MainClass
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("Bouncing Shapes");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Screen(500,500));
        jf.pack();
        jf.setVisible(true);
        
    }
}
