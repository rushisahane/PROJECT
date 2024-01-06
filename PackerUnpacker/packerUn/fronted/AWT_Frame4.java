// program to demonstrate concept of adapter class

import java.awt.*;
import java.awt.event.*;

class AWT_Frame4 extends Frame
{
    AWT_Frame4(String name)
    {
        super(name);
    }

    public static void main(String ae[])
    {
        //create new frame
        AWT_Frame4 f = new AWT_Frame4("Marvellouse Infosystems");

        //Dicide Size of that Frame
        f.setSize(500,500);

        //Dispaly that frame
        f.setVisible(true);

        //Add action Listener to frame
        //passte object of class which implements Windowlistener
        f.addWindowListener(new ActionListener());
    }
}

//class which is extends WindowAdapter
class ActionListener extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
