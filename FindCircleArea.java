/**
 *  AP CS:  FindCircleArea
 *  This class contains one method - the main method that asks
 *  the user for a radius of a circle, gets the input using the 
 *  nextDouble() method, calculates the area, and then prints the 
 *  result to the console.
 *  This class illustrates the use of the Scanner and Math class.
 */

//import the Scanner class from the java.util package
import java.util.Scanner;

public class FindCircleArea //class header
{
   /** 
   *  The main method is run when the program is executed
   */
  public static void main(String[] args) //main method header
  {
    //declare variables
    final double PI = Math.PI;  // final constant PI
    double radius;              // value of radius entered by user
    double area;                // area of circle 
    
    //start a scanner object to get user input.  here we call the
    //variable "read", but it can be called anything.
    Scanner read = new Scanner(System.in);
    //ask user for desired input
    System.out.println("What is the radius of your circle?");
    
    //read in radius from user and save it in variable "radius" 
    radius = read.nextDouble();
 
    //calculate the area of the circle
    area = PI*Math.pow(radius,2);
 
    //print the result to the console
    System.out.println("The area of a circle with radius " + 
                       radius + " = " + area +"."); 
  } 
}
/////////////////////sample output////////////////////////////////
//The area of a circle with radius 10.0 = 314.1592653589793.

/* NOTES
Use read.nextInt() to read an integer and read.next() to read a String
Other useful methods of Math class: sqrt(), abs(), log10(), sin(), etc.
*/