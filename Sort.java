/**
 * Sorting algorithms
 */

import javax.swing.*;
public class Sort {

      ////////Selection Sort - from left to right//////////////////
      /**
      * Sort an array of integers into ascending order.
      * @param elements an array containing the items to be sorted.
      * Postcondition:  elements contains its original items and items in elements
      *                  are sorted in ascending order.
      */
          public static void selectionSort(int[] elements)
          {
              for (int j = 0; j < elements.length -1; j++)
              {
                  //let minIndex be the index that holds the current minimum
                  int minIndex = j;
                  for (int k = j + 1; k < elements.length; k++)
                  {
                      if (elements[k] < elements[minIndex])
                          minIndex = k;
                  }
                  int temp = elements[j];
                  elements[j] = elements[minIndex];
                  elements[minIndex] = temp;
              }
          }

       ////////Selection Sort - from right to left//////////////////
      /**
      * Sort an array of integers into ascending order.
      * @param elements an array containing the items to be sorted.
      * Postcondition:  elements contains its original items and items in elements
      *                  are sorted in ascending order.
      */

          public static void selectionSort2(int[] elements)
          {
              for (int j = elements.length - 1; j >= 0 ; j--)
              {
                  //let maxIndex be the index that holds the current max
                  int maxIndex = j;

                  for ( int k = j - 1; k >= 0; k-- )
                  {
                      if (elements[k] > elements[maxIndex])
                          maxIndex = k;
                  }
                  int temp = elements[maxIndex];
                  elements[maxIndex] = elements[j];
                  elements[j] = temp ;
              }
          }


         //////////Insertion Sort - starting at the beginning////////////
         /**
          * Sort an array of integers into ascending order.
          * @param elements an array containing the items to be sorted.
          * Postcondition: elements contains its original items and items in elements
          * are sorted in ascending order.
          */
          public static void insertionSort(int[] elements)
          {
              for (int j = 1; j < elements.length; j++)
              {
                  int temp = elements[j];
                  int possibleIndex = j;
                  while (possibleIndex > 0 && temp < elements[possibleIndex -1])
                  {
                      elements[possibleIndex] = elements[possibleIndex - 1];
                      possibleIndex--;
                  }
                  elements[possibleIndex] = temp;
              }
          }

         //////////Insertion Sort - starting at the end////////////
         /**
          * Sort an array of integers into ascending order.
          * @param elements an array containing the items to be sorted.
          * Postcondition: elements contains its original items and items in elements
          * are sorted in ascending order.
          */

          public static void insertionSort2(int[] elements)
          {
              for (int j = elements.length - 2; j >= 0; j--)
              {
                  int temp = elements[j];
                  int possibleIndex = j;
                  while (possibleIndex<elements.length-1 && temp>elements[possibleIndex+1])
                  {
                      elements[possibleIndex] = elements[possibleIndex+1];
                      possibleIndex++;
                  }
                  elements[possibleIndex]=temp;
              }
          }

          //////////Insertion Sort - starting at the end////////////
          /**
           * Sort an array of integers into ascending order.
           * @param elements an array containing the items to be sorted.
           * Postcondition: elements contains its original items and items in elements
           * are sorted in ascending order.
           */
           public static void insertionSort3(int[] elements)
           {
               for (int j = 1; j < elements.length; j++)
               {
                   int temp = elements[j];
                   int possibleIndex = j;
                   while (possibleIndex > 0 && temp > elements[possibleIndex -1])
                   {
                       elements[possibleIndex] = elements[possibleIndex - 1];
                       possibleIndex--;
                   }
                   elements[possibleIndex] = temp;
               }
           }


 /////////Main Methoid/////////////////////////////////////
          public static void main(String[] args) {
              /*
              int[] arr = { 4, 7, 3, 1, 2, 6, 5};

              for(int x : arr)
                  System.out.print(x + " ");
              System.out.println();
              selectionSort(arr);
              for(int x : arr)
                  System.out.print(x + " ");
              System.out.println();
              selectionSort3(arr);
              for(int x:arr)
                System.out.print(x+" ");
              System.out.println();
              selectionSort4(arr);
              for(int x:arr)
                System.out.print(x+" ");
              System.out.println();
              String[] words={"x","n","a","t","l","f"};
              for(String x:words)
                System.out.print(x+" ");
              System.out.println();
              stringSort(words);
              for(String x:words)
                System.out.print(x+" ");
              System.out.println();
              insertionSort2(arr);
              for(int x:arr)
                System.out.print(x+" ");
              System.out.println();
              insertionSort3(arr);
              for(int x:arr)
                System.out.print(x+" ");
              System.out.println();


              String str=JOptionPane.showInputDialog(null,"Please insert a multiple of 10.");
              int num=(int)(Double.parseDouble(str));
              int[] array=new int[num];
              for(int i=0;i<array.length;i++){
                array[i]=(int)((array.length+1)*Math.random());
              }
              for(int x:array)
                System.out.print(x+" ");
              System.out.println();
              insertionSort(array);
              for(int x:array)
                System.out.print(x+" ");
              System.out.println();
              */

              int[] myArray;
              int n=10000;
              long startTime,endTime;
              for(int i=0;i<10;i++){
                myArray=new int[n];
                for(int j=0;j<myArray.length;j++){
                    myArray[j] = (int)(100*Math.random());
                }
                startTime=System.currentTimeMillis();
                selectionSort(myArray);
                endTime=System.currentTimeMillis();
                System.out.print((endTime-startTime)+"\t");
                for(int j=0;j<myArray.length;j++){
                    myArray[j] = (int)(100*Math.random());
                }
                startTime=System.currentTimeMillis();
                insertionSort(myArray);
                endTime=System.currentTimeMillis();
                System.out.print((endTime-startTime)+"\t");
                System.out.println();
                n+=10000;
              }
          }

          /**
          * Sort an array of integers into descending order.
          * @param elements an array containing the items to be sorted.
          * Postcondition:  elements contains its original items and items in elements
          *                  are sorted in descending order.
          */
          public static void selectionSort3(int[] elements)
          {
              for (int j = 0; j < elements.length -1; j++)
              {
                  //let maxIndex be the index that holds the current minimum
                  int maxIndex = j;
                  for (int k = j + 1; k < elements.length; k++)
                  {
                      if (elements[k] > elements[maxIndex])
                          maxIndex = k;
                  }
                  int temp = elements[j];
                  elements[j] = elements[maxIndex];
                  elements[maxIndex] = temp;
              }
          }

          /**
          * Sort an array of integers into descending order.
          * @param elements an array containing the items to be sorted.
          * Postcondition:  elements contains its original items and items in elements
          *                  are sorted in descending order.
          */
          public static void selectionSort4(int[] elements)
          {
              for (int j = elements.length - 1; j >= 0 ; j--)
              {
                  //let minIndex be the index that holds the current max
                  int minIndex = j;

                  for ( int k = j - 1; k >= 0; k-- )
                  {
                      if (elements[k] < elements[minIndex])
                          minIndex = k;
                  }
                  int temp = elements[minIndex];
                  elements[minIndex] = elements[j];
                  elements[j] = temp ;
              }
          }

          public static void stringSort(String[] array){
            for(int i=0;i<array.length-1;i++){
              int mIndex=i;
              for(int j=i+1;j<array.length;j++){
                if(array[j].compareTo(array[mIndex])<0)
                  mIndex=j;
              }
              String temp=array[i];
              array[i]=array[mIndex];
              array[mIndex]=temp;
            }
          }

}
