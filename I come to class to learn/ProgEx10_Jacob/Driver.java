
/**
* @author Jacob Urisman
* @version 3/11/19
* This is my tester
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Driver
{
  public static void main(String[] args){
    Jacket j1=new Jacket("boathouse","large","polyester",80);
    Jacket j2=new Jacket("biker","medium","leather",120);
    Jacket j3=new Jacket("rain","large","Nylon",40);
    Jacket j4=new Jacket("biker","large","leather",500);

    ArrayList<Jacket> jackets=new ArrayList<Jacket>();
    jackets.add(j1);
    jackets.add(j2);
    jackets.add(j3);
    jackets.add(j4);

    Closet closet=new Closet(jackets);

    System.out.println(closet);
    System.out.println(closet.allType("biker")); //method A1
    System.out.println(closet.cheaperThan(100)); //method A2
    closet.sizeSort(); //Optional
    System.out.println(closet);
    closet.outOfFashion("rain"); //Method B
    System.out.println(closet);
    closet.imGrowing("extra Large"); //Method C
    System.out.println(closet);
  }
}
