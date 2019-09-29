/**
 * @author Jacob Urisman
 * @version 12/2/18
 * Comp Sci
 * Programming exercise
 */

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class Page{
  //Instance variable for page
  private String content;

  //Constructor for page
  public Page(String c){
    content=c;
  }

  //Setter for page
  public void rewrite(String rewrite){
    content=rewrite;
    System.out.println("You rewrite the page.");
  }

  //Getter for page
  public String read(){
    return content;
  }
}
