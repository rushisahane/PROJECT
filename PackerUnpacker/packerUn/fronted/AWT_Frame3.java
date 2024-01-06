//program to demonstrate event deligation model using ActionListener

import java.awt.*;
import java.awt.event.*;

class AWT_Frame3 extends Frame
{
    AWT_Frame3(String name)
    {
        super(name);
    }

    public static void main(String arf[])
    {
        //create new frame
        AWT_Frame3 f = new AWT_Frame3("Marvellouse Infosystems");

        //Dicide Size of that Frame
        f.setSize(500,500);

        //Display that Frame
        f.setVisible(true);

        //Add action Listener to farme
        //pass the object of class
        f.addWindowListener(new ActionListener());  //interface

    }

}

//class which implements WindowListener
class ActionListener implements WindowListener
{
    public void windowDeactivated(WindowEvent e) 
    {}

    public void windowActivated(WindowEvent e)
    {}

    public void windowDeiconified(WindowEvent e)
    {}

    public void windowIconified(WindowEvent e)
    {}

    public void  windowClosed(WindowEvent e)
    {}

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e)
    {}

    
}