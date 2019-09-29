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

public class ElfOwl extends Owl{
  private String s1="moth";
  private String location;
  public ElfOwl(String l){
    super("Elf owl");
    location=l;
  }
  public String getFood(){
    return s1;
  }
  public String getLocation(){
    return location;
  }
}
