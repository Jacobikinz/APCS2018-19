/**
* Jacob Urisman
* Comp Sci
*/

import java.util.*;
import java.text.*;

public class ExponentialApproximator {
  public static void main(String[] args) {
    int n;
    double x,sum=0,denom,num;
    Scanner read=new Scanner(System.in);
    System.out.println("enter n");
    n=read.nextInt();
    System.out.println("enter x");
    x=read.nextDouble();
    for(int i=0;i<n;i++){
      denom=1;
      for(int j=1;j<=i;j++){
        denom*=j;
      }
      num=(Math.pow(x,i)/denom);
      sum+=num;
    }
    System.out.println(sum);
  }
}
