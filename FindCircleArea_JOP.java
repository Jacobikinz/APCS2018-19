/**
 *  AP CS:  FindCircleArea
 *  
 *  This class prompts the user for a radius of a circle using a dialog 
 *  box calculates the area of a circle with that radius, and then 
 *  returns the result using another type of dialog box
 *  This class illustrates the use of JOptionPane and the Math class.
 */


//import JOptionPane class from javax.swing package
import javax.swing.JOptionPane;


public class FindCircleArea_JOP //class header
   {
    /** 
    *  This method executes the program, accepting a radius of a circle
    *  and then calculating and printing the area of that circle.
    */
   public static void main(String[] args) //main method header
      {
      //declare all variables
      final double PI = Math.PI;  // final constant PI
      String radiusInput;         // radius of circle entered by user
      double radius;              // value of radius
      double area;                // area of circle 
   
      //use a dialog box to read in radius from user - will be a String
      radiusInput = JOptionPane.showInputDialog(null, "What is the radius of your circle?");
   
      //convert radius from type String to type double 
      //Note: you can't cast a String to a double
      radius = Double.parseDouble(radiusInput);
   
      //calculate the area of the circle
      area = PI*Math.pow(radius,2);
   
      //return the result using a dialog box
      JOptionPane.showMessageDialog(null, "The area of a circle with radius " + 
                          radius + " = " + area +".");
   
      }
   }

