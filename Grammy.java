//********************************************************************
//  Grammy.java
//
//  Demonstrates the use of a ArrayList object.
//********************************************************************

import java.util.ArrayList;

public class Grammy
{
   //--------------------------------------------------------------------------
   //  Stores and modifies a list of Best Pop Solo Performance Grammy winners.
   //--------------------------------------------------------------------------
   public static void main (String[] args)
   {
      ArrayList<String> list = new ArrayList<>();

      list.add("Adele");
      list.add("Pharrell Williams");
      list.add("Ed Sheeran");

      //1. Print the list
      System.out.println(list);


      //2. Print the first element of the list
      System.out.println(list.get(0));

      //3. Print the size of the list
      System.out.println(list.size());

      //4. Add an element to the list, confirm by reprinting the list
      list.add("John Coltrane");

      System.out.println(list);

      //5. Delete the element at index 2, confirm by reprinting the list
      list.remove(2);

      System.out.println(list);

      //6. Replace the element at index 1, confirm by reprinting the list
      list.set(1,"Charles Mingus");
      System.out.println(list);

      //7. Add an element at index 0, confirm by reprinting the list
      list.add(0,"Stan Getz");
      System.out.println(list);

      //8. Print the size of element at index 2
      System.out.println(list.get(2).length());

      ArrayList<Integer> arr=new ArrayList<Integer>;
      arr.add(1029401984);

   }
}
