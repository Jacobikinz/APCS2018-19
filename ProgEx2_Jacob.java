/**
* Jacob Urisman
* 9/11/18
* This program will give the volume of a sphere with a given radius and the distance between two given points
*/
import java.util.*;
import java.text.*;
public class ProgEx2_Jacob {
  public static void main(String[] args) {
    //The following code declares and initializes the variables
    String name;
    int radius;
    final double PI=Math.PI;
    double radiusInCm,volume,x1,y1,x2,y2,distance,slope,yIntercept;

    //This is for formatting decimals
    DecimalFormat df2 = new DecimalFormat("###,###.##");

    //The following code creates a new scanner for the user"s name
    Scanner input=new Scanner(System.in);
    System.out.println("Hello user, what is your name?");
    name=input.nextLine();

    //Easter Egg
    if (name.equals("ariel")){
      System.out.println("Howdy!");
    }

    //Next the program will prompt the user (by name) for a radius and assigns the input to radius (int)
    System.out.println("Ok "+name+", please enter the radius of your sphere in meters.");
    radius=input.nextInt();
    radiusInCm=radius*100;

    //The program then solves for the volume and prints it to the console
    volume=(4*PI*Math.pow(radiusInCm,3)/3);
    System.out.println("The volume of your circle is "+df2.format(volume)+" centimeters, "+name+".");

    //Now the program will ask for two coordinates
    System.out.println("Ok, "+name+", please enter two points and I will find the distance between them.");
    System.out.println("Please enter the coordinates of point 1.");
    x1=input.nextDouble();
    y1=input.nextDouble();
    System.out.println("Please enter the coordinates of point 2.");
    x2=input.nextDouble();
    y2=input.nextDouble();

    //Finally, the code will find the distance and print the equation of the line
    distance=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    System.out.println("The distance between your two points is "+df2.format(distance)+".");
    slope=((y2-y1)/(x2-x1));
    yIntercept=(-1*slope*x1+y1);
    System.out.println("The equation of the line is y="+df2.format(slope)+"x+"+df2.format(yIntercept)+".");
  }
}
