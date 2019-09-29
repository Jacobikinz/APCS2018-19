/**
* @author Jacob Urisman
* @version ∞
* Comp Sci Tomfoolery
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnowyOwl extends Owl{
  private String s1="hare",s2="lemming",s3="small bird";
  public SnowyOwl(){
    super("Snowy owl");
  }
  public String getFood(){
    int chance=(int)(3*Math.random());
    if(chance==0)
      return s1;
    else if(chance==1)
      return s2;
    else
      return s3;
  }
}
