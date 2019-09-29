/**
* Jacob Urisman
* Comp Sci 
*/

import java.util.*;
import java.text.*;

public class CircleProb {
  public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    int trials,success=0;
    double x,y,prob,circleProb;
    final double pi=Math.PI;
    System.out.println("enter number of trials");
    trials=read.nextInt();
    for(int i=0;i<trials;i++){
      x=(2*Math.random()-1);
      y=(2*Math.random()-1);
      if(Math.pow(x,2)+Math.pow(y,2)<=1)
        success++;
    }
    System.out.println(success);
    prob=(double)success/trials;
    circleProb=4*prob;
    System.out.println(circleProb);
  }
}
