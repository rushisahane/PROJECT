import java.awt.*;
import java.awt.event.*;

class AWT_Frame8 extends Frame
{
    AWT_Frame8()
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
        //set Background color
        this.setBackground(new Color(51,153,255));

        //Create font object for printing
        Font fn = new Font("Century",Font.BOLD,55);

        //set the font
        g.setFont(fn);

        //set the font color
        g.setColor(Color.black);

        //draw String on Frame
        g.drawString("Marvellous Infosystems",250,250);
    }

    public static void main(String a[])
    {
        //..create new Frame
        AWT_Frame8 f = new AWT_Frame8();

        //set size eof window
        f.setSize(1200,500);

        //set Title of window
        f.setTitle("Marvellouse Infosystems");

        //Display that Frame
        f.setVisible(true);
    }
}