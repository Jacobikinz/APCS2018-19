import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Screen extends JPanel// implements ActionListener
{
    private ArrayList<Shape> shapes;
    private int width, height; //the dimensions of the Screen that are set when the panel is created
                                // in the MainClass
    public Screen(int w, int h)
    {
        setPreferredSize(new Dimension(w, h));
        setBackground(Color.yellow);
        width = w;
        height = h;
        shapes = new ArrayList<>();
        shapes.add(new Ball());
        shapes.add(new Ball(220,320,100,Color.blue));
        shapes.add(new Triangle(150,150,200,Color.green));
        shapes.add(new Square(150,0,30,Color.red));
        shapes.add(new ChangingBall(100,200,70,Color.magenta));

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Shape s: shapes)
        {
            s.paint(g);           //calls on paint and move methods from each subclass of Shape
            s.move(width, height);
        }
        try
        {
           Thread.sleep(20); //delays the action for 20 miliseconds
        }
       catch(InterruptedException ex)
       {}
       repaint();
    }

}
