/**
* @author Jacob Urisman
* @version 11/14/18
* Comp Sci Tomfoolery
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class ShapeZoo {
  public static void main(String[] args) {
    Circle cir1=new Circle(200,200);
    Circle cir2=new Circle(100,100);
    cir1.setColor("yellow");
    cir1.setDiameter(50);
    cir1.makeVisible();
    cir2.makeVisible();
    Square sqr1=new Square();
    sqr1.makeVisible();
    cir1.slowMoveVertical(-200);
    cir2.slowMoveVertical(-100);
    cir2.slowMoveVertical(100);
  }
}
