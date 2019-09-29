/**
 * Practice 2D Arrays
 */
public class TwoDArrays {

    public static void main(String[] args) {

        //1. Declare and then fill a 2D array of ints call sums that will hold the following addition table.
        // Use an initializer list.
        //
        //  0 1 2 3
        //  1 2 3 4
        //  2 3 4 5
        int[][] sums={{0,1,2,3},{1,2,3,4},{2,3,4,5},{3,4,5,6}};


        //2. Print the array defined above (in a rectangular format). Use for-each nested loops.
        for (int[] array:sums) {
          for(int num:array){
            System.out.print(num);
          }
          System.out.println();
        }




        //3.What does each of the following print?  Write your answer first , then test it. If an error is produced, write error.
        System.out.println(sums.length);
        //3


        System.out.println(sums[0].length);
        //4

        //System.out.println(sums[0][1].length);
        //1
        //error

        System.out.println(sums[2][1]);
        //3

        System.out.println(sums[1][0]);
        //1

        //System.out.println(sums[3][0]);
        //error

        System.out.println(method1(sums));
        System.out.println(method2(sums));
        System.out.println(method3(sums,6));
        System.out.println(method4(sums,6));
        System.out.println(method5(sums,12));

    }
    /*
     * Write the following (static) methods. Tests them using the array sums in the main method, and appropiate print calls
     */

    //4. A method that will take a 2D array of ints and will return the sum of the elements in the first row.
    //   Try a for-each loop. Call it method1

    public static int method1(int[][] array){
      int result=0;
      for(int x:array[0]){
        result+=x;
      }
      return result;
    }



    //5. A method that will take a 2D array of ints and will return the sum of the elements in the first column.
    //   Call it method2

    public static int method2(int[][] array){
      int result=0;
      for(int[] x:array){
        result+=x[0];
      }
      return result;
    }




    //6. A method that will take a 2D array of ints and an integer n and will return true if any of the rows has a sum of n.
    //   Call it method3

    public static boolean method3(int[][] array,int n){
      int result;
      for(int[] subarray:array){
        result=0;
        for(int x:subarray){
          result+=x;
        }
        if(n==result)
          return true;
      }
      return false;
    }



    //7. A method that will take a 2D array of ints and an integer n and will return true if any of the columns have a sum of n.
    //   Call it method4

    public static boolean method4(int[][] array,int n){
      int result=0;
      int count=0;
      for(int i=0;i<array.length;i++){
        for(int[] x:array){
          result+=x[count];
        }
        count++;
        if(n==result)
          return true;
      }
      return false;
    }



    //8. A method that will take a 2D array of ints and an integer n and will return true if the main diagonal
    //   has a sum of n.  Assume that the 2D array has the same number of rows and columns. You will need a 'square'
    //   array to test this method.
    //   Call it method5

    public static boolean method5(int[][] array,int n){
      int result=0;
      for(int i=0;i<array.length;i++){
        result+=array[i][i];
      }
      return(n==result);
    }





}
