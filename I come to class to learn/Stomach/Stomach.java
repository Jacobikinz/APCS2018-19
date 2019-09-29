/**
* @author Jacob Urisman
* @version 12/3/18
* Comp Sci Tomfoolery
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class Stomach{
  private EdibleSubstance[] foodsEaten;
  public Stomach(EdibleSubstance[] meal){
    foodsEaten=meal;
  }
  public EdibleSubstance[] getFoodsEaten(){
    return foodsEaten;
  }
  public void changeFood(EdibleSubstance food, int num){
    foodsEaten[num]=food;
  }
  public EdibleSubstance[] areFlavor(String flav){
    int count=0;
    for(EdibleSubstance food: foodsEaten){
      if(food.getFlavor()==flav){
        count++;
      }
    }
    EdibleSubstance[] newFlav=new EdibleSubstance[count];
    int count2=0;
    for(EdibleSubstance food: foodsEaten){
      if(food.getFlavor()==flav){
        newFlav[count2]=food;
        count2++;
      }
    }
    return newFlav;
  }
  public EdibleSubstance[] areType(String type){
    int count=0;
    for(EdibleSubstance food: foodsEaten){
      if(food.getType()==type){
        count++;
      }
    }
    EdibleSubstance[] newType=new EdibleSubstance[count];
    int count2=0;
    for(EdibleSubstance food: foodsEaten){
      if(food.getFlavor()==type){
        newType[count2]=food;
        count2++;
      }
    }
    return newType;
  }
  public String toString(){
    String result="";
    for(EdibleSubstance food:foodsEaten){
      result+=(food.toString()+"\n");
    }
    return result;
  }
  public int keepFlavor(String flavor){
    EdibleSubstance[] temp=this.areFlavor(flavor);
    int result=foodsEaten.length-temp.length;
    foodsEaten=temp;
    return result;
  }
}
