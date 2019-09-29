/**
*Jacob Urisman
*Hi-Lo
*10/8/18
*/

import java.util.*;

public class ProgEx4_Jacob{
  public static void main(String[] args) {
    //variables (as you do)
    int max=-1,count=0,num,guess=-1;
    String yn="yes",password;
    boolean quit=false,pass=false;
    Scanner read=new Scanner(System.in);

    //intro message
    System.out.println("Howdy and welcome to Hi-Lo, type quit at any time to end the game");

    //password.
    //careful, you only get 3 tries
    System.out.println("Enter password to start game. You get 3 tries");
    password=read.next();
    for(int i=0;i<2;i++){
      if(password.equalsIgnoreCase("password")){
        pass=true;
        continue;
      }
      else if(password.equalsIgnoreCase("quit")){
        quit=true;
        continue;
      }
      else{
        System.out.println("Nope, try again. Enter password.");
        password=read.next();
      }
    }

    //game
    while(yn.equalsIgnoreCase("yes")&&quit==false){
      //does password work?
      if(pass==false)
        break;

      //actual game
      System.out.println("Please enter the maximum value of the game.");

      //*----------try/catch allows program to check for quit and valid input----------*//

      //maximum value
      while(max<=1){
        try{
          max=read.nextInt();
        }
        catch(java.util.InputMismatchException e){
          if(read.next().equalsIgnoreCase("quit")){
            quit=true;
            break;
          }
          else{
            System.out.println("Try again, and this time, enter a number greater than 1");
          }
        }
      }
      if(quit==true)
        break;

      //Easter Egg
      if(max==17)
        System.out.println("hey, thats pretty good");

      //number for game
      num=(int)(max*Math.random()+1);

      //guess
      System.out.println("Guess a number.");

      //first guess
      while(guess<1){
        try{
          guess=read.nextInt();
          count++;
        }
        catch(java.util.InputMismatchException e){
          if(read.next().equalsIgnoreCase("quit")){
            quit=true;
            break;
          }
          else{
            System.out.println("Try again");
          }
        }
      }

      //subsequent guesses
      while(guess!=-1){

        //too low
        if(guess<1){
          System.out.println("Too low, try again");
          try{
            guess=read.nextInt();
            count++;
          }
          catch(java.util.InputMismatchException e){
            if(read.next().equalsIgnoreCase("quit")){
              quit=true;
              break;
            }
            else{
              System.out.println("Try again");
            }
          }
        }

        //too high
        else if(guess>max){
          System.out.println("Too high, try again");
          try{
            guess=read.nextInt();
            count++;
          }
          catch(java.util.InputMismatchException e){
            if(read.next().equalsIgnoreCase("quit")){
              quit=true;
              break;
            }
            else{
              System.out.println("Try again");
            }
          }
        }

        //lower
        else if(guess>num){
          System.out.println("Lower you have guessed "+count+" times, try again.");
          try{
            guess=read.nextInt();
            count++;
          }
          catch(java.util.InputMismatchException e){
            if(read.next().equalsIgnoreCase("quit")){
              quit=true;
              break;
            }
            else{
              System.out.println("Try again");
            }
          }
        }

        //higher
        else if(guess<num){
          System.out.println("Higher you have guessed "+count+" times, try again.");
          try{
            guess=read.nextInt();
            count++;
          }
          catch(java.util.InputMismatchException e){
            if(read.next().equalsIgnoreCase("quit")){
              quit=true;
              break;
            }
            else{
              System.out.println("Try again");
            }
          }
        }

        //win condition
        else{
          System.out.println("You got it, the number was "+num+" and it took you "+count+" tries.");
          count=0;
          max=-1;
          guess=-1;
          break;
        }
      }
      if(quit==true)
        break;

      //again?
      System.out.println("Would you like to play again?");
      yn=read.next();
    }
  }
}
