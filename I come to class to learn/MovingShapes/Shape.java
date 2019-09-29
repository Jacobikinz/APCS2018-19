import java.awt.*;
/*
 * The abstrat class Shape represents a generic geometric shape.
 *
 */
public abstract class Shape
{
    private int xLoc, yLoc, size;//assume (xLoc,yLoc) are the coordinates
                                 //of the upper left corner of a square of side of length size
                                 //that should enclosed a particular Shape object
    private int xStep, yStep;    //the displacement of the the Shape object at each iteration.
    private Color color;         //the color of the Shape object

    public Shape()
    {
        xLoc = 0;
        yLoc = 0;
        size = 40;
        xStep = 5;
        yStep = 7;
        color = Color.black;
    }

    public Shape(int x, int y, int s, Color c)
    {
        xLoc = x;
        yLoc = y;
        size = s;
        xStep = 5;
        yStep = 7;
        color = c;
    }

    //*******Getters Methods*********
    public int getX()
    {
        return xLoc;
    }
    public int getY()
    {
        return yLoc;
    }
    public int getSize()
    {
        return size;
    }
    public int getXStep()
    {
        return xStep;
    }
    public int getYStep()
    {
        return yStep;
    }
    public Color getColor()
    {
        return color;
    }

    //*****Setter Methods*********

    public void setSize(int s)
    {
        size = s;
    }
    public void setX(int x)
    {
        xLoc = x;
    }
    public void setY(int y)
    {
        yLoc = y;
    }
    public void setXstep(int x)
    {
        xStep = x;
    }
    public void setYstep(int y)
    {
        yStep = y;
    }
    public void setColor(Color c)
    {
        color = c;
    }

    public abstract void paint(Graphics g);

    public void move(int width, int height)
    {
        xLoc += xStep;
        yLoc += yStep;

        //bounce off left and right
        if(xLoc <= 0 || xLoc >= width - size)
            xStep = -xStep;

        //bounce off top and bottom
        if(yLoc <= 0 || yLoc >= height - size)
            yStep = - yStep;

    }

}
