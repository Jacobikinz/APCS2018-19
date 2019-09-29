/**
* Jacob Urisman
*/
import java.util.Scanner;
public class Means {
  public static void main(String[] args) {
    double x,y;
    Scanner one = new Scanner(System.in);
    System.out.println("Enter first number.");
    x=one.nextDouble();
    Scanner two = new Scanner(System.in);
    System.out.println("Enter second number.");
    y=two.nextDouble();
    System.out.println("Arithmetic mean: "+((x+y/2)));
    System.out.println("Geometric mean: "+(Math.sqrt(x*y)));
  }
}
