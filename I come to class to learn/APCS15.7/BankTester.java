/**
* @author Jacob Urisman
* @version 11/12/18
* Comp Sci
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class BankTester{
  public static void main(String[] args) {
    BankAccount myBank=new BankAccount();
    myBank.accountDetails(1000,"Jacob");
    myBank.deposit(505.22);
    System.out.println(myBank.getBalance());
    myBank.withdraw(100);
    System.out.println("The "+myBank.getName()+" account balance is $"+myBank.getBalance());
    if(myBank.getName()!=null){
      System.out.println("Name is: "+myBank.getName());
    }
  }
}
