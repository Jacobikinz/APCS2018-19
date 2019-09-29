import java.awt.*;
public class Square extends Shape
{
    //Constructors are not inhereted.
    public Square()
    {
        super();

    }
    public Square(int xLoc, int yLoc, int size, Color c)
    {
        super(xLoc,yLoc,size,c);
    }

    public void paint(Graphics g)
    {
      g.setColor(getColor());
      g.fillRect(getX(), getY(), getSize(), getSize());
    }

}
