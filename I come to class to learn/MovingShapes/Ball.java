import java.awt.*;
public class Ball extends Shape
{
    //Constructors are not inhereted. 
    public Ball()
    {
        super();
        
    }
    public Ball(int xLoc, int yLoc, int size, Color c)
    {
        super(xLoc,yLoc,size,c);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getSize(), getSize());
    }
    
}
