/**
* Jacob Urisman
*/
import java.util.Scanner;
public class Eggs {
  public static void main(String[] args) {
    int dozen;
    int remain;
    int eggs;
    Scanner read = new Scanner(System.in);
    System.out.println("How many eggs do you have?");
    eggs=read.nextInt();
    dozen=(eggs/12);
    remain=(eggs%12);
    System.out.println("You have "+dozen+" dozen eggs with "+remain+" left over.");
    if (eggs==17);
      System.out.println("nut");
  }
}
