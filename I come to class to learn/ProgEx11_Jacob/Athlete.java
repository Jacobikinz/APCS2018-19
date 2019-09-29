/**
 * An abstract class defining an athlete.
 *
 * @author Jacob Urisman
 * @version 3/31/19
 */

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Athlete{
  private int number;
  private String sport;
  private int height;
  private String position;

  public Athlete(int n, String s, int h, String p){
    number=n;
    sport=s;
    height=h;
    position=p;
  }

  //setter methods
  public void setNumber(int x){
    number=x;
  }
  public void setSport(String x){
    sport=x;
  }
  public void setHeight(int x){
    height=x;
  }
  public void setPosition(String x){
    position=x;
  }

  //getter methods
  public int getNumber(){
    return number;
  }
  public String getSport(){
    return sport;
  }
  public int getHeight(){
    return height;
  }
  public String getPosition(){
    return position;
  }

  //toString
  public String toString(){
    return "Number: "+number+" Sport: "+sport+" Height: "+height+" Position: "+position;
  }

  //equals
  public boolean equals(Athlete x){
    return(sport==x.getSport()&&position==x.getPosition());
  }

  //unique methods
  public abstract void changeTeam(String s);

  public abstract void newStrategy();
}
