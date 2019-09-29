/**
* Jacob Urisman
* Comp Sci stars program
*/

import java.util.*;
import java.text.*;

public class Stars {
  public static void main(String[] args) {
    final int MAX_ROWS=10;

    //a
    for(int row=MAX_ROWS;row>=1;row--){
      for(int star=1;star<=row;star++)
        System.out.print("*");
      System.out.println();
    }

    //b
    for(int row=1; row<=MAX_ROWS;row++){
      for(int space=1;space<=(MAX_ROWS-row);space++)
        System.out.print(" ");
      for(int star=1;star<=row;star++)
        System.out.print("*");
      System.out.println();
    }

    //c
    for(int row=MAX_ROWS;row>=1;row--){
      for(int space=1;space<=(MAX_ROWS-row);space++)
        System.out.print(" ");
      for(int star=1;star<=row;star++)
        System.out.print("*");
      System.out.println();
    }

    //d
    for(int row=9;row>=1;row-=2){
      for(int space=row;space>=0;space-=2)
        System.out.print(" ");
      for(int star=1;star<=MAX_ROWS-row;star++)
        System.out.print("*");
      System.out.println();
    }
    for(int row=1;row<=9;row+=2){
      for(int space=row;space>=0;space-=2)
        System.out.print(" ");
      for(int star=1;star<=MAX_ROWS-row;star++)
        System.out.print("*");
      System.out.println();
    }
  }
}
