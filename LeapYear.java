/**
* Jacob Urisman
* Comp Sci
*/

import java.util.*;
public class LeapYear{
  public static void main(String[] args) {
    int year;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter a year.");
    year=read.nextInt();
    if(year<1582)
      System.out.println("error");
    else if(year%100==0)
      if(year%400==0)
        System.out.println(""+year+" is a leap year");
      else
        System.out.println(""+year+" is not a leap year");
    else if(year%4==0)
      System.out.println(""+year+" is a leap year");
    else
      System.out.println(""+year+" is not a leap year");
  }
}
