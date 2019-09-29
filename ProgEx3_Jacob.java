/**
* Jacob Urisman
* 9/20/18
* Rock Paper Scissors game
*/
import javax.swing.*;
public class ProgEx3_Jacob {
  public static void main(String[] args) {
    //Rock=0, Paper=1, Scissors=2
    //Declares and Initializes variables
    int compWin=0,userWin=0;
    String userMove,compMove="";
    //Loop for multiple rounds
    while(true){
      int x=(int)(3*Math.random());
      userMove=JOptionPane.showInputDialog(null,"What is your move?");

      //Assigns each computer move to a string literal
      if(x==0){
        compMove="rock";
      }
      else if(x==1){
        compMove="paper";
      }
      else if(x==2){
        compMove="Scissors";
      }

      //Checks cases of the game
      //User chooses rock
      if(userMove.equalsIgnoreCase("rock")){
        if(compMove.equalsIgnoreCase("rock")){
          JOptionPane.showMessageDialog(null,"You chose rock, I chose rock, it's a tie. Score:"+userWin+","+compWin);
        }
        else if(compMove.equalsIgnoreCase("paper")){
          compWin++;
          JOptionPane.showMessageDialog(null,"You chose rock, I chose paper, I win. Score:"+userWin+","+compWin);
        }
        else{
          userWin++;
          JOptionPane.showMessageDialog(null,"You chose rock, I chose scissors, you win. Score:"+userWin+","+compWin);
        }
      }
      //User chooses paper
      else if(userMove.equalsIgnoreCase("paper")){
        if(compMove.equalsIgnoreCase("paper")){
          JOptionPane.showMessageDialog(null,"You chose paper, I chose paper, it's a tie. Score:"+userWin+","+compWin);
        }
        else if(compMove.equalsIgnoreCase("scissors")){
          compWin++;
          JOptionPane.showMessageDialog(null,"You chose paper, I chose scissors, I win. Score:"+userWin+","+compWin);
        }
        else{
          userWin++;
          JOptionPane.showMessageDialog(null,"You chose paper, I chose rock, you win. Score:"+userWin+","+compWin);
        }
      }
      //User chooses scissors
      else if(userMove.equalsIgnoreCase("scissors")){
        if(compMove.equalsIgnoreCase("scissors")){
          JOptionPane.showMessageDialog(null,"You chose scissors, I chose scissors, it's a tie. Score:"+userWin+","+compWin);
        }
        else if(compMove.equalsIgnoreCase("rock")){
          compWin++;
          JOptionPane.showMessageDialog(null,"You chose scissors, I chose rock, I win. Score:"+userWin+","+compWin);
        }
        else{
          userWin++;
          JOptionPane.showMessageDialog(null,"You chose scissors, I chose paper, you win. Score:"+userWin+","+compWin);
        }
      }

      //Easter egg
      else if(userMove.equalsIgnoreCase("laser")||userMove.equalsIgnoreCase("gun")||userMove.equalsIgnoreCase("black hole"))
        JOptionPane.showMessageDialog(null,"No, you can't use a "+userMove+".");

      else{
        JOptionPane.showMessageDialog(null,"That is not a valid input, please try again");
      }
    }
  }
}
