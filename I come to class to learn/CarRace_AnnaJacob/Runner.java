/**
 * @author Anna Novatney(mostly) and Jacob Urisman
 * @version 5/14/19
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Runner extends JPanel
{
  // instance variables including the x position, the y position, and the name of the
  private int xPos, yPos;
  private String name;
  private static int width=50;
  private static int height=100;


  /**
   * Constructor for objects of class Runner
   */
  public Runner(int x, int y, String n){
    xPos=x;
    yPos=y;
    name=n;
  }
  // This is the class which will draw the runner (Anna did literally all of this)
  public void drawRunner(Graphics page){
    page.setColor(Color.blue);
    // Draws the circle for the head of the runner
    page.fillOval (xPos + 5, yPos, 15, 15);
    // Draws the rectangle for the neck of the runner
    page.fillRect ( xPos + 9, yPos + 10, 4, 6);
    // Draws the polygon for the torso of the runner
    int xPoly1[]={xPos + 3, xPos + 11, xPos + 16 , xPos + 14, xPos + 5};
    int yPoly1[]={yPos + 18, yPos + 15, yPos + 18, yPos + 40, yPos + 40};
    page.fillPolygon(xPoly1, yPoly1, xPoly1.length);
    // Draws the polygon for the back leg of the runner
    int xPoly2[]={xPos, xPos + 6, xPos + 5, xPos + 10, xPos + 11};
    int yPoly2[]={yPos + 65, yPos + 50, yPos + 40, yPos + 40, yPos + 50};
    page.fillPolygon(xPoly2, yPoly2, xPoly2.length);
    // Draws the polygon for the front leg of the runner
    int xPoly3[]={xPos + 6, xPos + 16, xPos + 23, xPos + 20, xPos+17};
    int yPoly3[]={yPos + 40, yPos + 40, yPos + 47, yPos + 60, yPos + 47};
    page.fillPolygon(xPoly3, yPoly3, xPoly3.length);
    // Draws the polygon for the front shoe of the runner
    int xPoly4[]={xPos + 20, xPos + 26, xPos + 20};
    int yPoly4[]={yPos + 57, yPos + 61, yPos + 61};
    page.fillPolygon(xPoly4, yPoly4, xPoly4.length);
    // Draws the polygon for the back shoe of the runner
    int xPoly5[]={xPos, xPos + 6, xPos};
    int yPoly5[]={yPos + 62, yPos + 66, yPos + 66};
    page.fillPolygon(xPoly5, yPoly5, xPoly5.length);
    // Draws the polygon for the back arm of the runner
    int xPoly6[]={xPos + 12, xPos + 26, xPos + 12};
    int yPoly6[]={yPos + 30, yPos + 22, yPos + 34};
    page.fillPolygon(xPoly6, yPoly6, xPoly6.length);
    // Draws the polygon for the front arm of the runner
    int xPoly7[]={xPos + 4, xPos - 3, xPos + 2, xPos + 1, xPos + 4};
    int yPoly7[]={yPos + 18, yPos + 27, yPos + 38, yPos + 28, yPos + 22};
    page.fillPolygon(xPoly7, yPoly7, xPoly7.length);

    page.setColor(Color.black);
    page.drawLine(0, yPos-5, 1100, yPos-5);
    page.drawLine(0, yPos+79, 1100, yPos+79);
    page.drawString(name, xPos, yPos+75);
    page.setColor(Color.white);
    page.drawLine(1000,0,1000,1000);

  }
  //*******Getter Methods*********
  public int getX()
  {
    return xPos;
  }
  public int getY()
  {
    return yPos;
  }
  public String getName()
  {
    return name;
  }
  public int getWidth()
  {
    return width;
  }
  public int getHeight()
  {
    return height;
  }

  //*****Setter Methods*********

  public void setX(int x)
  {
    xPos=x;
  }
  public void setY(int y)
  {
    yPos=y;
  }
  public void setName(String n)
  {
    name=n;
  }

  public void updatePosition()
  {
    xPos+=((int)(4*Math.random()));
  }

  public void paintComponent (Graphics page)
  {
    super.paintComponent(page);
    drawRunner(page);
  }
}
