/**
  *@author Anna Novatney and Jacob Urisman(mostly)
  *@version 5/21/19
  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//for sound
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Track extends JPanel implements ActionListener{
  private int runners;
  private Runner[] heat;
  JButton b1=new JButton("Gunshot"),b2=new JButton("False Start");
  private Timer timer;
  final private int xPos=30;
  private boolean begun=false;
  final private String[] names=new String[]{"Anna","Jacob","Ariel","Evan","Tamara","Kam","Ethan"}; //We decided on these names for the runners
  Clip clip;

  public Track(){
    b1.addActionListener(this);
    add(b1);
    b2.addActionListener(this);
    add(b2);
    timer=new Timer(15, this);
    runners=Integer.parseInt(JOptionPane.showInputDialog(null,"How many runners are in this heat?"));
    setPreferredSize(new Dimension(1100,200*runners));
    setBackground (Color.orange);
    heat=new Runner[runners];
    for(int i=0;i<runners;i++){
      heat[i]=new Runner(xPos,(i+1)*100,"Lane "+(i+1)+": "+names[i]);
    }
  }

  //Action Performed class
  public void actionPerformed(ActionEvent e){
    //Start Button
    if(e.getSource()==b1){
      timer.start();
      begun=true;
      try{
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sports_Crowd.wav").getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.loop(0);
      }catch(Exception ex) {}
    }
    //Reset button
    if(e.getSource()==b2){
      timer.stop();
      clip.stop();
      begun=false;
      for(int i=0;i<runners;i++){
        heat[i]=new Runner(xPos,(i+1)*100,"Lane "+(i+1)+": "+names[i]);
      }
    }
    repaint();
  }

  //Paint Component
  public void paintComponent(Graphics page){
    super.paintComponent(page);
    for(int i=0;i<runners;i++){
      heat[i].drawRunner(page);
    }
    if(begun){
      for(int i=0;i<runners;i++){
        heat[i].updatePosition();
        if((heat[i].getX()+0)>=1000){
          timer.stop();
          clip.stop();
          begun=false;
          JOptionPane.showMessageDialog(null,""+heat[i].getName()+" won");
          break;
        }
      }
    }
  }

  //Main
  public static void main(String[] args){
    JFrame window=new JFrame("Track");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.add(new Track());
    window.pack();
    window.setVisible(true);
  }
}
