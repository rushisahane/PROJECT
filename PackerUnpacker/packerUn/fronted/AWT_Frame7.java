import java.awt.*;
import java.awt.event.*;

class AWT_Frame7 extends Frame
{
    AWT_Frame7()
    {
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }

    public void paint(Graphics g)
    {
        this.setBackground(new Color(51,153,255));
    }

    public static void main(String a[])
    {
        //..create new Frame
        AWT_Frame7 f = new AWT_Frame7();

        //set size eof window
        f.setSize(300,300);

        //set Title of window
        f.setTitle("Marvellouse Infosystems");

        //Display that Frame
        f.setVisible(true);
    }
}