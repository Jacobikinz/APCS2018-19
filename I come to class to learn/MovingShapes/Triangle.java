import java.awt.*;
public class Triangle extends Shape
{
    //Constructors are not inhereted.
    public Triangle()
    {
        super();

    }
    public Triangle(int xLoc, int yLoc, int size, Color c)
    {
        super(xLoc,yLoc,size,c);
    }

    public void paint(Graphics g)
    {
        g.setColor(getColor());
        g.fillPolygon(new int[]{getX(),getX()+getSize(),getX()+getSize()/2},new int[]{getY(),getY(),getY()+getSize()},3);
    }

}
