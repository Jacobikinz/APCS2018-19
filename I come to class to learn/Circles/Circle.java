/**
* @author Jacob Urisman
* @version 11/12/18
* Comp Sci
*/
public class Circle
{
    // instance variables
    private double radius;
    private String color;
    private static int countCircle=0;

    //Constructor
    public Circle(){
      radius=1;
      color="red";
      countCircle++;
    }
    public Circle(double r,String c){
      this.radius=radius;
      this.color=color;
      countCircle++;
    }

    //getter for Circle
    public double getRadius(){
      return radius;
    }
    public String getColor(){
      return color;
    }
    //setter
    public void setRadius(double r){
      radius=r;
    }
    public void setColor(String c){
      color=c;
    }
    public double area(){
      return Math.PI*Math.pow(radius,2);
    }
    public double circumference(){
      return Math.PI*radius*2;
    }
    public String toString(){
      return "Circle with radius "+radius+" and color "+color;
    }
    public static int getCount(){
      return countCircle;
    }
    public boolean equals(Circle c){
      return (this.getColor()==c.getColor()&&this.getRadius()==c.getRadius())
    }
}
