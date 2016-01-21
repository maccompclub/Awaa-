//import
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
//create class
public class Awaomain extends JPanel implements Runnable, KeyListener, MouseListener
{
    final static int FRAME_WIDTH = 1000, FRAME_HEIGHT = 600;
    static int top;
    //individual character width/height
    final static int charwidth = 13;
    final static int charheight = 15;
    final static int bubblew = 132;
    //number of characters on x and y axis
    static int charx = 50, chary = 40;
    static int lastent = 1;
    static char[] [] displayarray = new char [charx] [chary];
    static String[] [] realityarray = new String [charx] [chary];
    static String[] finemalavan = new String [1];    
    static entity[] everyone = new entity [charx * chary];
    static character Stewart;
    //static int [] [] colorchar = new int [charx] [chary]
    static boolean down = false, right = false, left = false, up = false, nothing = false;
    //class to prep the gui for use
    public Awaomain ()
    {
        //add keylisteners and mouselisteners to gui
        addKeyListener (this);
        addMouseListener (this);
        //focus so that keyboard and mouse input are received
        setFocusable (true);
        //prevents shift tab and tab from being consumed
        setFocusTraversalKeysEnabled (false);
        //mediatracker to make sure that the player's character is managed properly (present)
        this.setPreferredSize (new Dimension (FRAME_WIDTH, FRAME_HEIGHT));

        //gets top of usable window, excludes bar along top
        top = getInsets ().top;

        //start a new thread
        Thread t = new Thread (this);
        t.start ();
    }


    //run method to handle the majority of the management of the game
    public void run ()
    {

        Stewart = new character (0, 0, 0, 0);
        Stewart = loadchar (Stewart);
        repaint ();
        while (true)
        {
            while (!nothing)
            {
            }
            Stewart = updatepos (Stewart);
            /*for (int i = 0 ; i < charx * chary && i < lastent; i++)
            {
                everyone [i] = updateent (everyone [i]);
            }*/
            //repaint the screen
            //simulated lag
            try
            {
                Thread.sleep (100);
            }
            catch (Exception e)
            {
            }
            repaint ();


        }
    }


    public static character updatepos (character cha)
    {
        if (right)
        {
            cha.posx = cha.posx + 1;
            if (cha.posx == 50)
            {
                cha.chunkx++;
                cha.posx = 0;
                finemalavan = SFile_RW.loadreality (cha.chunkx, cha.chunky);
                realityarray = SFile_RW.adjust (finemalavan[0]);
            }
        }
        if (left)
        {
            cha.posx = cha.posx - 1;
            if (cha.posx == -1)
            {
                cha.chunkx--;
                cha.posx = 49;
                finemalavan = SFile_RW.loadreality (cha.chunkx, cha.chunky);
                realityarray = SFile_RW.adjust (finemalavan[0]);
            }
        }
        if (up)
        {
            cha.posy = cha.posy - 1;
            if (cha.posy == -1)
            {
                cha.chunky--;
                cha.posy = 39;
                finemalavan = SFile_RW.loadreality (cha.chunkx, cha.chunky);
                realityarray = SFile_RW.adjust (finemalavan[0]);
            }
        }
        if (down)
        {
            cha.posy = cha.posy + 1;
            if (cha.posy == 40)
            {
                cha.chunky++;
                cha.posy = 0;
                finemalavan = SFile_RW.loadreality (cha.chunkx, cha.chunky);
                realityarray = SFile_RW.adjust (finemalavan[0]);
            }
        }
        return cha;
    }


    public static character loadchar (character cha)
    {
        finemalavan = SFile_RW.loadreality (cha.chunkx, cha.chunky);
        realityarray = SFile_RW.adjust (finemalavan[0]);
        return cha;
    }




    //method to draw and manage output
    public void paintComponent (Graphics g)
    {

        g.setColor (Color.white);
        g.fillRect (0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        g.setColor (Color.black);
        for (int i = 0 ; i < charx ; i++)
        {
            for (int z = 0 ; z < chary ; z++)
            {
                //color lookup table
                /*
                switch (colorchar [i] [z]){
                case 1:
                g.setColor(Color.red);
                break;
                etc
                }
                */
                /*g.drawString ("@",(i + 1) * charwidth, top + charheight * (z + 1));
                System.out.print("@ ");*/
                displayarray [i] [z] = realityarray[i][z].charAt(0);
                displayarray [Stewart.posx] [Stewart.posy] = '@';
                g.drawString (displayarray [i] [z] + "", (i + 1) * charwidth, top + charheight * (z + 1));
            }
        }
        /*g.setColor(Color.white);
        g.fillRect(0,0,200,200);
        g.setColor(Color.red);
        //NOTE 50, 60 is bottom left
        g.drawString ("@", 50, 60);
        g.setColor(Color.black);
        g.drawRect(45,45,20,18); */
    }


    //check if the user presses a key
    public void keyPressed (KeyEvent e)
    {
        //variable to get the int value of the input
        int key = e.getKeyCode ();
        //NOTE the # value here is NOT for the numpad, must be changed so that it is
        if (key == KeyEvent.VK_NUMPAD2)
        {
            down = true;
            nothing = true;
        }
        if (key == KeyEvent.VK_NUMPAD8)
        {

            up = true;
            nothing = true;

        }
        if (key == KeyEvent.VK_NUMPAD4)
        {

            left = true;
            nothing = true;

        }
        if (key == KeyEvent.VK_NUMPAD6)
        {

            right = true;
            nothing = true;
        }
        if (key == KeyEvent.VK_NUMPAD9)
        {

            right = true;
            up = true;
            nothing = true;
        }
        if (key == KeyEvent.VK_NUMPAD7)
        {

            left = true;
            up = true;
            nothing = true;
        }
        if (key == KeyEvent.VK_NUMPAD3)
        {

            right = true;
            down = true;
            nothing = true;
        }
        if (key == KeyEvent.VK_NUMPAD1)
        {

            left = true;
            down = true;
            nothing = true;
        }
        if (key == KeyEvent.VK_NUMPAD5)
        {
            nothing = true;
        }

    }


    public void keyTyped (KeyEvent e)
    {

    }


    //get input if user releases a key
    public void keyReleased (KeyEvent e)
    {
        //declare in value to key released
        int key = e.getKeyCode ();

        if (key == KeyEvent.VK_NUMPAD2)
        {
            down = false;
            nothing = false;
        }
        if (key == KeyEvent.VK_NUMPAD8)
        {

            up = false;
            nothing = false;

        }
        if (key == KeyEvent.VK_NUMPAD4)
        {

            left = false;
            nothing = false;

        }
        if (key == KeyEvent.VK_NUMPAD6)
        {

            right = false;
            nothing = false;
        }
        if (key == KeyEvent.VK_NUMPAD9)
        {

            right = false;
            up = false;
            nothing = false;
        }
        if (key == KeyEvent.VK_NUMPAD7)
        {

            left = false;
            up = false;
            nothing = false;
        }
        if (key == KeyEvent.VK_NUMPAD3)
        {

            right = false;
            down = false;
            nothing = false;
        }
        if (key == KeyEvent.VK_NUMPAD1)
        {

            left = false;
            down = false;
            nothing = false;
        }
        if (key == KeyEvent.VK_NUMPAD5)
        {
            nothing = false;
        }

    }


    public void mouseClicked (MouseEvent e)
    {


    }


    public void mouseEntered (MouseEvent e)
    {
    }


    public void mouseExited (MouseEvent e)
    {
    }


    //if the user clicks something on the screen
    public void mousePressed (MouseEvent e)
    {
        //get the int values of its coordinates
        int mx = e.getX ();
        int my = e.getY ();
        System.out.println (mx);
        System.out.println (my);







    }


    public void mouseReleased (MouseEvent e)
    {
    }


    //main method to create jframe
    public static void main (String[] args)
    {
        //new Jframe
        JFrame f = new JFrame ();
        //add in the prep
        f.getContentPane ().add (new Awaomain ());
        //exit on close
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        //close up shop and make it visible
        f.pack ();
        f.setVisible (true);
    }
}
