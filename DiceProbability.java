/**
* Jacob Urisman
* Comp Sci
*/

import java.util.*;
import java.text.*;

public class DiceProbability {
  public static void main(String[] args) {
    int sum,die1,die2,numTrial,sumTotal=0,ones=0;
    double expSum,oneProb;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter the number of trials");
    numTrial=read.nextInt();
    for(int i=0;i<numTrial;i++){
      die1=(int)(6*Math.random()+1);
      die2=(int)(6*Math.random()+1);
      if(die1==1&&die2==1)
        ones++;
      sum=die1+die2;
      sumTotal+=sum;
    }
    expSum=(double)sumTotal/numTrial;
    oneProb=(double)ones/numTrial;
    System.out.println("After "+numTrial+" the expected sum is "+expSum);
    System.out.println("The estimated probability for both dice getting 1 is "+oneProb);
  }
}
