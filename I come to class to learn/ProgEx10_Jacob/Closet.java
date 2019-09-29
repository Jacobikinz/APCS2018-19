/**
* @author Jacob Urisman
* @version 3/11/19
* This object is a closet. It is an ArrayList of Jackets
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Closet{
  private ArrayList<Jacket> myJackets;

  public Closet(ArrayList<Jacket> x){
    myJackets=x;
  }

  public ArrayList<Jacket> getJackets(){
    return myJackets;
  }

  //Method A
  public ArrayList<Jacket> cheaperThan(int n){
    ArrayList<Jacket> result=new ArrayList<Jacket>();
    for(Jacket j:myJackets){
      if(j.getCost()<n)
        result.add(j);
    }
    return result;
  }

  //Another method A
  public ArrayList<Jacket> allType(String t){
    ArrayList<Jacket> result=new ArrayList<Jacket>();
    for(Jacket j:myJackets){
      if(j.getType().equals(t))
        result.add(j);
    }
    return result;
  }


  //Method B
  public void outOfFashion(String t){
    for(int i=0;i<myJackets.size();i++){
      if(myJackets.get(i).getType().equals(t))
        myJackets.remove(i);
    }
  }

  //Method C
  public void imGrowing(String s){
    for(Jacket j:myJackets){
      j.setSize(s);
    }
  }

  public String toString(){
    return myJackets.toString();
  }

  //Optional part 2
  public void sizeSort(){
    for(int j=0;j<myJackets.size()-1;j++)
    {
      Jacket temp=myJackets.get(j);
      while(temp.compareTo(myJackets.get(j+1))<0){
        myJackets.remove(j);
        myJackets.add(temp);
      }
    }
  }
}
