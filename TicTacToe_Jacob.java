/**
 * @author Jacob Urisman
 * @version 1/24/19
 *
 * This game will allow two people to play tic tac toe
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe_Jacob extends JPanel implements ActionListener{
  private int turn=1;//will switch between even and odd to determine turn
  private String[][] pieces; //array that will hold the values, Red or Blue, of each button
  private JButton[][] buttons;
  private int redWins=0,blueWins=0;

  //Constructor
  public TicTacToe_Jacob(){
    setPreferredSize(new Dimension(500,500));
    setLayout(new GridLayout(3,3));
    pieces=new String[3][3];
    buttons=new JButton[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        buttons[i][j]=new JButton(pieces[i][j]);
        buttons[i][j].addActionListener(this);
        add(buttons[i][j]);
      }
    }
  }

  //Clicked method
  public void clicked(int row, int column){
    if(pieces[row][column]!=null){
      if(pieces[row][column]!="Howdy there, partner")
        JOptionPane.showMessageDialog(null,"that spot is occupied, try again");
      else{
        if(turn%2==0){
          pieces[row][column]="Blue";
        }
        else{
          pieces[row][column]="Red";
        }

        if(winCheck(row,column)) //is there a winner?
        {
          printWinner();//prints winner
        }
      }
    }
    else{
      //depending upon whose turn it is, set the color and update any needed count
      if(turn%2==0){
        pieces[row][column]="Blue";
      }
      else{
        pieces[row][column]="Red";
      }

      if(winCheck(row,column)) //is there a winner?
      {
        printWinner();//prints winner
      }

      else if(turn==9){  //game over and no winner: it's a tie print out corresponding message
                          //using JOptionPane
        JOptionPane.showMessageDialog(null,"Oopsie, it's a tie.");
        JOptionPane.showMessageDialog(null,"Red has "+redWins+" wins and Blue has "+blueWins+" wins.");
        pieces=new String[3][3];
        turn=0;
        resetButtons();
      }
      else if(turn==8)
        easterEgg();
      turn++;
    }
  }

  /**
   * This method will check to see if anyone has won and return true or false.
   */
  public boolean winCheck(int i, int j){
    //check vertical, horizontal, and both diagonals
    //Note:  Some of the spots on board might be empty; you cannot ask the color
    //of a square (an element of pieces[i][j]) until you first check that pieces[i][j]!=null (i.e. not empty)
    int count=0;
    //this first checks the column
    for(String[] row:pieces){
      if(row[j]!=null&&row[j]=="Red")
        count++;
      else if(row[j]!=null&&row[j]=="Blue")
        count--;
    }
    if(Math.abs(count)==3)
      return true;
    //now check row
    count=0;
    for(String str:pieces[i]){
      if(str!=null&&str=="Red")
        count++;
      else if(str!=null&&str=="Blue")
        count--;
    }
    if(Math.abs(count)==3)
      return true;
    //finally check diagonals
    count=0;
    for(int row=0;row<pieces.length;row++){
      if(pieces[row][row]!=null&&pieces[row][row]=="Red")
        count++;
      else if(pieces[row][row]!=null&&pieces[row][row]=="Blue")
        count--;
    }
    if(Math.abs(count)==3)
      return true;

    count=0;
    for(int row=pieces.length-1;row>=0;row--){
      if(pieces[row][pieces.length-row-1]!=null&&pieces[row][pieces.length-row-1]=="Red")
        count++;
      else if(pieces[row][pieces.length-row-1]!=null&&pieces[row][pieces.length-row-1]=="Blue")
        count--;
    }
    if(Math.abs(count)==3)
      return true;
    return false;
  }
  /**
   * This method will print out the appropriate message when someone has won. Use JOptionPane
   */
  public void printWinner(){
    if(turn%2==0){
      JOptionPane.showMessageDialog(null,"Blue has won");
      blueWins++;
    }
    else{
      JOptionPane.showMessageDialog(null,"Red has won");
      redWins++;
    }
    JOptionPane.showMessageDialog(null,"Red has "+redWins+" wins and Blue has "+blueWins+" wins.");
    pieces=new String[3][3];
    turn=0;
    resetButtons();
  }

  public void easterEgg(){
    if(pieces[0][0]!=null&&pieces[0][0]==pieces[2][2]&&pieces[0][0]==pieces[0][2]&&pieces[0][0]==pieces[2][0]&&pieces[0][0]!=pieces[0][1]&&pieces[0][1]!=null&&pieces[0][1]==pieces[1][0]&&pieces[0][1]==pieces[1][2]&&pieces[0][1]==pieces[2][1])
      pieces[1][1]="Howdy there, partner";
  }

/////////////////DO NOT EDIT ANYTHING BELOW HERE///////////////////////////
  /*
   *This method fires an event when a square (button) is clicked
   */
  public void actionPerformed(ActionEvent event){
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(event.getSource()==buttons[i][j]){
          clicked(i,j);
          resetButtons();
        }
      }
    }
  }

/*
* this method restes all the buttons with the correct texts.
*/
  public void resetButtons(){
    for(int a=0; a<3; a++){
      for(int b=0; b<3;b++){
        buttons[a][b].setText(pieces[a][b]);
        if(pieces[a][b]!=null)
          if(pieces[a][b].equals("Red"))
            buttons[a][b].setForeground(Color.red);
          else
            buttons[a][b].setForeground(Color.blue);
      }
    }
    repaint();
  }

  public static void main(String[] arg)
  {
    JFrame frame=new JFrame ("TicTacToe");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.add(new TicTacToe_Jacob());
    frame.pack();
    frame.setVisible(true);
  }
}
