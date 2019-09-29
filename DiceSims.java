/**
* Jacob Urisman
* Comp Sci
*/

import java.util.*;
import java.text.*;

public class DiceSims {
  public static void main(String[] args) {
    int sum,die,trials,tosses=60,sumTotal=0,ones=0,success=0;
    double oneProb;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter the number of trials");
    trials=read.nextInt();
    for(int i=0;i<trials;i++){
      ones=0;
      for(int j=0;j<tosses;j++){
        die=(int)(6*Math.random()+1);
        if(die==1)
          ones++;
        }
      System.out.println("the dice landed on 1 "+ones+" times");
      if(ones==10)
        success++;
    }
    System.out.println(success);
    oneProb=(double)success/trials;
    System.out.println("The estimated probability for exactly 10 dice being 1 is "+oneProb);
  }
}
