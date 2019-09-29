/**
 * An abstract class defining a fencer.
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

public class Fencer extends Athlete implements CompareHeight{
  //new instance variables and corresponding getter/setter
  private String weapon;
  public void setWeapon(String x){
    weapon=x;
  }
  public String getWeapon(){
    return weapon;
  }

  public Fencer(int h,String w){
    super(0,"Fencing",h,"Fencer");
    weapon=w;
  }

  //toString
  public String toString(){
    return super.toString()+" Weapon: "+weapon;
  }

  //equals
  public boolean equals(Fencer x){
    return(this.getWeapon()==x.getWeapon());
  }

  //unique methods
  public void changeTeam(String newTeam){
    System.out.println("Player has moved to "+newTeam);
  }

  public void newStrategy(){
    String[] possiblePositions=new String[]{"First","Second","Third","Substitute"};
    int choose=(int)(4*Math.random());
    super.setPosition(possiblePositions[choose]);
  }

  public void trySomethingNew(){
    String[] weapons=new String[]{"Foil","Epee","Saber"};
    int choose=(int)(3*Math.random());
    if(weapons[choose]==weapon)
      choose=(int)(3*Math.random());
    else
      weapon=weapons[choose];
  }
  public int difference(Athlete x){
    return(this.getHeight()-x.getHeight());
  }
}
