
/**
 *
 * @author Evan-Carlo Fowler
 * @version May, 2019
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pacman extends JPanel
{
    final int width = 80;
    final int height = 74;
    final int startAngle = 30;
    int pacmanAngle = 300;
    int trail = 1;
    int xPos, yPos, xLine, yLine;
    String name;

    public Pacman(int x, int y, String n)
    {
        xPos= x;
        yPos = y;
        xLine = x;
        yLine = y;
        setPreferredSize (new Dimension(1000, 1000));
        setBackground (Color.black);
        name = n;
    }

    public void drawMan ( Graphics page )
    {
        page.setColor(Color.yellow);
        //the arc used as pacman
        page.fillArc (xPos, yPos, width, height, startAngle, pacmanAngle);
        page.setColor(Color.blue);

        page.drawLine(0, yLine-5, 900, yLine-5);
        page.drawLine(0, yLine+79, 900, yLine+79);
        page.setColor(Color.black);
        page.drawString(name, xPos+13, yPos+21);
        //page.fillRect(MIDX-40,MIDY-37, trail, 74);

        page.setColor(Color.white);
        page.fillOval(xLine + 80,  yLine +30, 12, 12);
        page.fillOval(xLine + 130, yLine +30, 12, 12);
        page.fillOval(xLine + 180, yLine +30, 12, 12);
        page.fillOval(xLine + 230, yLine +30, 12, 12);
        page.fillOval(xLine + 280, yLine +30, 12, 12);
        page.fillOval(xLine + 330, yLine +30, 12, 12);
        page.fillOval(xLine + 380, yLine +30, 12, 12);
        page.fillOval(xLine + 430, yLine +30, 12, 12);
        page.fillOval(xLine + 480, yLine +30, 12, 12);
        page.fillOval(xLine + 530, yLine +30, 12, 12);
        page.fillOval(xLine + 580, yLine +30, 12, 12);
        page.fillOval(xLine + 630, yLine +30, 12, 12);
        page.fillOval(xLine + 680, yLine +30, 12, 12);
        page.fillOval(xLine + 730, yLine +30, 12, 12);
        page.fillOval(xLine + 780, yLine +30, 12, 12);
        page.fillOval(xLine + 830, yLine +30, 12, 12);
        page.fillOval(xLine + 880, yLine +30, 12, 12);
    }

    public void move()
    {
        xPos+=20;
    }

    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        drawMan(page);
    }

    public int getX(){
        return xPos;
    }
}
