/**
* @author Jacob Urisman
* @version 12/3/18
* Comp Sci Tomfoolery
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class StomachTester{
  public static void main(String[] args) {
    EdibleSubstance iceCream=new EdibleSubstance("Vanilla","Dairy");
    EdibleSubstance steak=new EdibleSubstance("Meat","Meat");
    EdibleSubstance spicyPepperJack=new EdibleSubstance("Spicy","Dairy");
    EdibleSubstance habanero=new EdibleSubstance("Spicy","Pepper");
    EdibleSubstance salad=new EdibleSubstance("Leaf","Vegetable");
    EdibleSubstance lemon=new EdibleSubstance("Sour","Fruit");
    EdibleSubstance jalapeno=new EdibleSubstance("Spicy","Pepper");
    EdibleSubstance[] dinner={iceCream,steak,spicyPepperJack,habanero,salad};
    Stomach myStomach=new Stomach(dinner);
    System.out.println(myStomach.getFoodsEaten()[0].getFlavor());
    System.out.println(myStomach.getFoodsEaten()[1].getType());
    System.out.println(myStomach.toString());
    System.out.println(myStomach.areFlavor("Sour").toString());
    System.out.println(myStomach.keepFlavor("Spicy"));
  }
}
