
/**
 *
 * @Evan-Carlo Fowler
 * @version May, 2019
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PacManRace extends JPanel implements ActionListener
{
    int numPacmans;
    Pacman[] pacmans;
    JButton button1 = new JButton("Start");
    Timer timer;
    int xPos = 30;
    boolean started = false;

    public PacManRace(){
        button1.addActionListener(this); //make the panel the listener of the button(is a method)
        add(button1);
        timer = new Timer(15, this);
        numPacmans = Integer.parseInt(JOptionPane.showInputDialog(null, "How many PacMans?"));
        setPreferredSize(new Dimension(900, 200*numPacmans));
        setBackground (Color.black);
        pacmans = new Pacman[numPacmans];
        for(int i = 0; i < numPacmans; i++)
        {
            pacmans[i] = new Pacman(xPos, (i+1)*100, "PacMan"+(i+1));
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1){
            timer.start();
            started=true;
        }
        repaint();
    }

    public void paintComponent(Graphics page){
        super.paintComponent(page);
        for(int i=0; i<numPacmans; i++){
            pacmans[i].drawMan(page);
        }
        if(started){
            for(int i =0; i<numPacmans; i++){
                pacmans[i].move();
                if((pacmans[i].getX()+60)>=900){
                   timer.stop();
                   started=false;
                }
            }
        }
    }

    public static void main (String[] args)
    {
        JFrame window = new JFrame("TimerPacman");
        window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        window.add(new PacManRace());
        window.pack();
        window.setVisible(true);
    }
}
