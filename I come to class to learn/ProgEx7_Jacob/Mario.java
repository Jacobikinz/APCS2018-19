/**
 * @author Jacob Urisman
 * @version 1/17/19
 * Comp Sci
 * Programming exercise 7
 */

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;

public class Mario extends JPanel{
  ImageIcon image=new ImageIcon("mario.png");
  int imageW=image.getIconWidth();
  int imageH=image.getIconHeight();
  Color brickBrown=new Color(200,76,12);
  Color goldBlock=new Color(252,152,56);
  Color mountain=new Color(0,168,0);
  int x1=216,x2=267,x3=366,x4=70,x5=90,x6=110,x7=130,x8=150,x9=170,x10=190,x12=300,x13=381,x14=282,x16=333;

  public Mario(){
      setPreferredSize (new Dimension(2*imageW, imageH));
      setBackground (new Color(92,148,252));
  }

  public void paintComponent(Graphics page){
    super.paintComponent(page);

    page.setColor(mountain);
    page.fillOval(x1,225,100,70); //mountainy oval thing

    page.setColor(goldBlock);
    page.fillRect(x2,130,33,33); //left gold block
    page.fillRect(x3,130,33,33); //right gold block

    page.setColor(Color.green);
    int[] xcoords1={x4,x5,x6,x7,x8,x9,x10};
    int[] ycoords1={257,230,240,230,240,230,257};
    page.fillPolygon(xcoords1,ycoords1,7); //"bush"

    page.setColor(Color.black);
    page.drawOval(x1,225,100,70); //outline of mountain
    page.drawPolygon(xcoords1,ycoords1,7); //outline of "bush"
    page.drawString("?",x13,150); //left ?
    page.drawString("?",x14,150); //right ?

    page.setColor(brickBrown);
    page.fillRect(0,257,imageW,66); //bottom brick layer
    page.fillRect(x12,130,66,33); //two bricks in the block

    page.setColor(Color.red);
    int[] xcoords2={246,256,266};
    int[] ycoords2={257,230,257};
    page.fillPolygon(xcoords2,ycoords2,3); //mario

    page.setColor(Color.black);
    page.drawString("M",252,255); //mario m
    page.drawLine(x12,130,x12,162); //a few lines for the bricks
    page.drawLine(x16,130,x16,162);
    page.drawLine(x3,130,x3,162);
    page.drawRect(0,0,110,50);
    page.drawString("Jacob Urisman",10,30);

    image.paintIcon(this,page,imageW,0);

    //pause for 5 milliseconds
    try{
      Thread.sleep(5);
    }
    catch(InterruptedException ex){}

    //increase variables
    x1-=1;
    x2-=2;
    x3-=2;
    x4-=2;
    x5-=2;
    x6-=2;
    x7-=2;
    x8-=2;
    x9-=2;
    x10-=2;
    x12-=2;
    x13-=2;
    x14-=2;
    x16-=2;

    //if stuff goes too far to the right, put it back
    if(x1<-100)
      x1=imageW;
    if(x3<-33){
      x2=imageW;
      x13=imageW+15;
      x3=imageW+99;
      x14=imageW+114;
      x12=imageW+33;
      x16=imageW+66;
    }
    if(x10<0){
      x4=imageW;
      x5=imageW+20;
      x6=imageW+40;
      x7=imageW+60;
      x8=imageW+80;
      x9=imageW+100;
      x10=imageW+120;
    }

    repaint();
  }

  public static void main(String[] args){
    //Set up frame
    JFrame frame=new JFrame ("Programming Exercise 7: Jacob Urisman");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.add(new Mario());
    frame.pack();
    frame.setVisible(true);
  }
}
