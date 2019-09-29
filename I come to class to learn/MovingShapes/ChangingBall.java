import java.awt.*;
public class ChangingBall extends Ball
{
    //Constructors are not inhereted.
    public ChangingBall()
    {
        super();

    }
    public ChangingBall(int xLoc, int yLoc, int size, Color c)
    {
        super(xLoc,yLoc,size,c);
    }

    public void move(int width,int height){
      super.move(width,height);
      if(getX() <= 0 || getX() >= width - getSize())
          setColor(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));

      if(getY() <= 0 || getY() >= height - getSize())
          setColor(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));
    }

}
