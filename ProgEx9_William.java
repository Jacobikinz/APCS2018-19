/**
 * Name: William Chang
 * 
 * This class generates a visualizer (using rectangles whose height represents the number's
 * size) for the selection and insertion sort algorithms. Features:
 * • User sets the array size/number of rectangles
 * • Each rectangle height is unique (1 to N)
 * • Four different modes
 * • Pass # is displayed for modes that show each pass individually
 * 
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgEx9_William extends JPanel implements ActionListener
{
    private final int N;
    private String prompt = "Enter the size of the array.";
    
    private int passNum;
    private int currentMode; //0 = One-click, 1 = Manual, 2 = Auto slow, 3 = Auto fast
    private int slowPause = 400, fastPause = 80; //Pause time for automatic sorting
    private boolean sorting = true; //keeps track of if we are currently sorting
    private boolean sortChecked; //have we checked if sorting is done yet?
    private boolean sortClicked;
    
    private int[] heightsSS, heightsIS; //SS: selection sort (blue). IS: insertion sort (red)
    
    private JButton sort = new JButton("Sort!");
    private JButton mode = new JButton("One-click");
    private JLabel blueSS = new JLabel("Blue: Selection |", SwingConstants.RIGHT);
    private JLabel redIS = new JLabel(" Red: Insertion", SwingConstants.LEFT);
    
    
    //Constructor
    public ProgEx9_William()
    {
        //Determine number of rectangles
        N = Integer.parseInt(JOptionPane.showInputDialog(prompt));
        
        //Change pause time for fast automatic sorting if array is larger
        if(N > 50)
            fastPause = 3000/N + 5;
        
        //Graphics setup
        setPreferredSize(new Dimension(400,500));
        if(N > 40)
            setPreferredSize(new Dimension(N*10,500)); //window size based on N
        setLayout(new GridLayout(2,2,0,400));
        setBackground(Color.yellow);
        
        sort.addActionListener(this);
        add(sort);
        mode.addActionListener(this);
        add(mode);
        
        blueSS.setForeground(Color.blue);
        add(blueSS);
        redIS.setForeground(Color.red);
        add(redIS);
        
        randomize(); //randomizes heightsSS and heightsIS
    }
    
    //-- Sorting Algorithms --//
    //Selection sort
    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                    minIndex = k;
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
    }
    
    //Overloading, for step-wise sort
    public static void selectionSort(int[] elements, int j)
    {
        int minIndex = j;
        for (int k = j + 1; k < elements.length; k++)
        {
            if (elements[k] < elements[minIndex])
                minIndex = k;
        }
        int temp = elements[j];
        elements[j] = elements[minIndex];
        elements[minIndex] = temp;
    }
    
    //Insertion sort
    public static void insertionSort(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }
    
    //Overloading, for step-wise sort
    public static void insertionSort(int[] elements, int j)
    {
        if(j > 0)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex -1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }
    
    //-- Visuals --//
    public void paintComponent(Graphics p)
    {
        super.paintComponent(p);
        
        //Actions if array needs to be sorted, i.e. Sort button clicked
        if(sorting && sortClicked)
        {
            sortClicked = false; //won't run loop again
            
            //Different modes
            if(currentMode == 0)             //One-click: sorts all at once
            {
                selectionSort(heightsSS);
                insertionSort(heightsIS);
                
                sorting = false; //done sorting
            }
            else if(currentMode == 1)        //Manual: one pass per click
            {
                if(passNum > N - 1)
                    sorting = false; //done sorting
                else
                {
                    selectionSort(heightsSS, passNum);
                    insertionSort(heightsIS, passNum);
                    
                    passNum++;
                    sort.setText("Pass: " + passNum);
                }
            }
            else //currentMode == 2 or 3
            {
                if(passNum > N - 1)
                    sorting = false; //done sorting
                else
                {
                    selectionSort(heightsSS, passNum);
                    insertionSort(heightsIS, passNum);
                    
                    passNum++;
                    sort.setText("Pass: " + passNum);
                    
                    //Pause
                    try
                    {
                        if(currentMode == 2) //Auto slow: goes step-by-step at slow pace
                            Thread.sleep(slowPause);
                        else                 //Auto fast: goes step-by-step at fast pace
                            Thread.sleep(fastPause);
                    }
                    catch(InterruptedException ex)
                    {}
                    
                    sortClicked = true; //keep going w/o pressing button again
                }
            }
            
            //if sorting finishes in this round...
            if(!sorting && !sortChecked)
            {
                passNum = 0;
                sort.setText("Mix!"); //now sorted, so button changed to Mix
                sortChecked = true; //this has been checked, so don't check until later
            }
        }
        
        paintRects(p);
        repaint();
    }
    
    //Interaction control
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == sort)
        {
            if(sorting)
                sortClicked = true;
            else
            {
                randomize(); //rescramble elements
                sort.setText("Sort!"); //now unsorted, so button changed to Sort
                
                sortChecked = false; //now we need to check if sorting is finished
                sorting = true; //commence sorting
            }
        }
        if(e.getSource() == mode)
        {
            if(currentMode == 0)
            {
                mode.setText("Manual");
                currentMode++;
            }
            else if(currentMode == 1)
            {
                mode.setText("Auto slow");
                currentMode++;
            }
            else if(currentMode == 2)
            {
                mode.setText("Auto fast");
                currentMode++;
            }
            else
            {
                mode.setText("One-click");
                currentMode = 0;
            }
        }
    }
    
    //-- Other methods --//
    //Randomizes the heights arrays
    public void randomize()
    {
        boolean[] used = new boolean[N];
        heightsSS = new int[N];
        heightsIS = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            int num = (int)(N*Math.random()) + 1;
            
            if(!used[num-1])
            {
                heightsSS[i] = num;
                heightsIS[i] = num;
                used[num-1] = true;
            }
            else
                i--;
        }
    }
    
    //Draws the rectangles whose heights represent their value
    public void paintRects(Graphics p)
    {
        final int MX = getWidth() / 2;
        final int MY = getHeight() / 2;
        
        for(int j = 0; j < N; j++) 
        {
            double hx = MY/(1.3*N); //making rectangles taller so they are visible
            int h1 = (int)(hx * heightsSS[j]), h2 = (int)(hx * heightsIS[j]);
            int dx = (int)(1.8*MX/N); //distance between each rectangle
            int x = (int)(MX - dx*(N/2.)) + (j*dx);
            int y1 = MY - h1, y2 = MY;
            
            //Selection sort rectangle
            p.setColor(Color.blue);
            p.fillRect(x, y1, dx-1, h1);
            
            //Insertion sort rectangle
            p.setColor(Color.red);
            p.fillRect(x, y2, dx-1, h2);
        }
    }
    
    //-- Main method --//
    public static void main(String[] args)
    {
        JFrame frame = new JFrame ("Sorting Visualizer");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        frame.add(new ProgEx9_William());
        frame.pack();
        frame.setVisible(true);
    }
}