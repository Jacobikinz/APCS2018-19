
/**
* @author Jacob Urisman
* @version 11/12/18
* Comp Sci
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class BankAccount
{
  private double balance;
  private String name;

  public void accountDetails(double b, String n){
    balance=b;
    name=n;
  }
  public double getBalance(){
    return balance;
  }
  public String getName(){
    return name;
  }
  public void deposit(double d){
    balance+=d;
  }
  public void withdraw(double w){
    balance-=w;
  }
}
