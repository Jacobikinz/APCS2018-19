/**
 * This class contains various methods whose sole purpose is to help us understand
 * if statements.  This class and these methods were not written for real use and
 * should not be used as a model for any future programming assignments.
 *
 * Please note:  These methods may or may not work correctly (on purpose).
 */

//import the Scanner class from the java.util package
import java.util.Scanner;

public class IfClass
{
    //by declaring these variables static at the beginning of the class,
    //they can be accessed and used by any/all static methods in the class

    static double balance = 1000;                   //initial balance
    final static int OVERDRAFT_PENALTY = 500;       //constant penalty for overdraft

    /**
     * prints whether an integer is positive
     */
    public static void isPositive(int x)
    {
         //add code
         if(x>0)
          System.out.println("Yes, "+x+" is positive.");

    }

    /**
     * withdrawals specified amount from acount
     *@param amount:  amount to withdrawal from account
     */
    public static void withdrawal(double amount)
    {
        if (amount <= balance) //notice that the variable balance was decared at the beginning of the class.
            balance = balance - amount;
        if(amount > balance)
            balance = balance - OVERDRAFT_PENALTY;
        System.out.println("Thank you for your withdrawal.  Your current balance = $"
                            + balance + ".");
    }


    /**
     * deposits specified amount to acount
     *@param amount:  amount to deposit into account
     */
    public static void deposit(double amount)
    {
        if (amount < 0)
            System.out.println("Sorry, that is an illegal amount");
        else if (amount >=0)
           balance = balance + amount;
           System.out.println("Thank you for your deposit.  Your current balance = $"
                            + balance + ".");
    }


    /**
     * prints the magnitide of a number
     * @param integer:  number whose magnitude will be determined
     */
    public static void getMagnitude(int integer)
    {
        if(integer < 0 )
           System.out.println("Please enter a postive integer");
        if(integer > 0 && integer < 10 )
          System.out.println(integer + " is between 1 and 9.");
        if(integer >= 10 && integer < 100)
          System.out.println(integer + " is between 10 and 99.");
        if(integer >= 100 && integer<1000)
          System.out.println(integer + " is between 100 and 999.");
        //else if
           System.out.println(integer + " is greater than or equal to 1000.");
    }



    /**
     * mystery method
     */
    public static void testInts(int x, int y)
    {
        if(x > 5)
            if(y > 5)
               System.out.println("x and y are > 5!");

        else
           System.out.println("sorry, x is <= 5");
    }


}
