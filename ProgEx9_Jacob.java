/**
* @author Jacob Urisman
* @version 2/11/19
* Programming Exercise 9: Sorting Algorithms
*/

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgEx9_Jacob extends JPanel implements ActionListener{
  int x=50; //i separated the frame into vertical sections this wide
  int y=450;
  static int c1=1; //count for insertion sort
  static int c2=0; //count for selection sort
  int[] array=new int[10];
  int[] array2=new int[10];
  JButton button = new JButton("Sort");
  boolean sort=false;

  public ProgEx9_Jacob(){
    setPreferredSize(new Dimension(1200, 500));
    setBackground(Color.blue);
    button.addActionListener(this);
    add(button);
    randomizeArray(array);
    randomizeArray(array2);
  }
  public void paintComponent(Graphics page){
    super.paintComponent(page);
    page.setColor(Color.black);
    page.drawString("Insertion Sort",100,50);
    page.drawString("Selection Sort",700,50);
    page.drawLine(600,0,600,500);
    page.setColor(Color.red);
    //i used a loop to draw the rectangles
    for(int i=0;i<array.length;i++){
      page.fillRect(x*(i+1),y-array[i],x,array[i]);
    }
    for(int i=0;i<array2.length;i++){
      page.fillRect(x*(i+13),y-array2[i],x,array2[i]);
    }
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button){
      //i put it in a try-catch because it was showing a weird error whenever i pressed the sort button if it was already sorted
      try{
        insertionSort(array);
        selectionSort(array2);
        repaint();
      }
      catch(ArrayIndexOutOfBoundsException E){}
    }
  }
  //insertion sort, but its one step at a time
  public static void insertionSort(int[] elements){
    int temp=elements[c1];
    int possibleIndex=c1;
    while (possibleIndex>0 && temp<elements[possibleIndex-1]){
      elements[possibleIndex]=elements[possibleIndex-1];
      possibleIndex--;
    }
    elements[possibleIndex]=temp;
    c1++;
  }
  //selection sort, but its one step at a time
  public static void selectionSort(int[] elements){
    int minIndex=c2;
    for (int j=c2+1;j<elements.length;j++){
      if(elements[j]<elements[minIndex])
        minIndex=j;
    }
    int temp=elements[c2];
    elements[c2]=elements[minIndex];
    elements[minIndex]=temp;
    c2++;
  }
  //made this to make randomizing the arrays easier
  public static void randomizeArray(int[] elements){
    for(int i=0;i<elements.length;i++){
      elements[i]=(int)(400*Math.random());
    }
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame ("Demonstrates the use of Sorting Algorithms");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.add(new ProgEx9_Jacob());
    frame.pack();
    frame.setVisible(true);
  }
}
