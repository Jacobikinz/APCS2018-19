/**
 * An abstract class defining an footballer/soccer player.
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

public class Footballer extends Athlete implements Comparable<Footballer>, CompareHeight{
  //new instance variables and corresponding getter/setter
  private int transferFee;
  public void setTransferFee(int x){
    transferFee=x;
  }
  public int getTransferFee(){
    return transferFee;
  }

  public Footballer(int n,int h,String p,int t){
    super(n,"Football",h,p);
    transferFee=t;
  }

  //toString
  public String toString(){
    return super.toString()+" Transfer Fee: £"+transferFee;
  }

  //equals
  public boolean equals(Athlete x){
    return(this.getPosition()==x.getPosition());
  }

  //unique methods
  public void changeTeam(String newTeam){
    super.setNumber((int)(100*Math.random()));
    System.out.println("Player has been traded to "+newTeam+" and their new number is "+this.getNumber());
  }

  public void newStrategy(){
    String[] possiblePositions=new String[]{"Forward","MidFielder","Defender","GoalKeeper"};
    int choose=(int)(4*Math.random());
    super.setPosition(possiblePositions[choose]);
  }

  //additional method
  public void goodSeason(){
    transferFee*=1.5;
  }

  //comparable
  public int compareTo(Footballer x){
    return(transferFee-x.getTransferFee());
  }
  public int difference(Athlete x){
    return(this.getHeight()-x.getHeight());
  }
}
