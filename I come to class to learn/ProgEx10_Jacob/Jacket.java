/**
* @author Jacob Urisman
* @version 3/11/19
* This object is a jacket. The variables are material, cost, size, and type
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jacket{ //I think this is all fairly self-explanatory
  private int cost;
  private String material,type,size;

  public Jacket(String t,String s,String m,int c){
    size=s;
    material=m;
    type=t;
    cost=c;
  }

  public String getType(){
    return type;
  }

  public String getSize(){
    return size;
  }

  public String getMaterial(){
    return material;
  }

  public int getCost(){
    return cost;
  }

  public String toString(){
    return "A size "+size+" "+type+" jacket made of "+material+" that costs $"+cost+".";
  }

  public boolean equals(Jacket x){
    return (this.getType().equals(x.getType())&&this.getSize()==x.getSize());
  }

  public void setCost(int n){
    cost=n;
  }

  public void setSize(String s){
    size=s;
  }

  //Optional part 1
  public int compareTo(Jacket x){
    if(this.getSize().equals("extra large")&&x.getSize().equals("large")||
    this.getSize().equals("large")&&x.getSize().equals("medium")||
    this.getSize().equals("medium")&&x.getSize().equals("small")||
    this.getSize().equals("small")&&x.getSize().equals("extra small"))
      return 1;
    else if(this.getSize().equals("large")&&x.getSize().equals("extra large")||
    this.getSize().equals("medium")&&x.getSize().equals("large")||
    this.getSize().equals("small")&&x.getSize().equals("medium")||
    this.getSize().equals("extra small")&&x.getSize().equals("small"))
      return -1;
    else
      return 0;
  }
}
