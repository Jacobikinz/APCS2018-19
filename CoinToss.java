/**
* Jacob Urisman
* Comp Sci
*/

import java.util.*;
import java.text.*;

public class CoinToss {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    int tosses=100,heads,trials,success=0,coin;
    double probability;
    System.out.println("enter number of trials");
    trials=read.nextInt();
    for(int i=0;i<trials;i++){
      heads=0;
      for(int j=0;j<tosses;j++){
        coin=(int)(2*Math.random());
        if(coin==1)
          heads++;
      }
      System.out.println("the coin landed on heads "+heads+" times");
      if(heads==50)
        success++;
    }
    probability=(double)success/trials;
    System.out.println("the probability of the coin landing exactly 50 times is "+probability);
  }
}
