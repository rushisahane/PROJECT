//program to Demonstarte Displayingn image on frame
//it supports .gif anf .jpg formate

import java.awt.*;
import java.awt.event.*;

class AWT_Frame9 extends Frame
{
    //..create image class object
    static Image im;

    AWT_Frame9()
    {
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent w)
            {
                System.exit(0);
            }
        });

        //Create Image object and load the image
        im = Toolkit.getDefaultToolkit().getImage("Marvellouse logo3 final.jpg");

        //create object of MadiaTracker for waiting purpose
        MediaTracker m = new MediaTracker(this);

        //add image
        //1 is id for that image
        m.addImage(im,1);

        try
        {
            m.waitForID(1);
        }
        catch(InterruptedException e)
        {}
    }

    public void paint(Graphics g)
    {
        //Dreaw Image on screen
        g.drawImage(im,0,0,null);
    }

    public static void main(String a[])
    {
        //create new Frame
        AWT_Frame9 f = new AWT_Frame9();

        //set size of window
        f.setSize(2424,960);

        //set title of window
        f.setTitle("Marvellouse Infosystems");

        //Dispaly Frame
        f.setVisible(true);

    }
}