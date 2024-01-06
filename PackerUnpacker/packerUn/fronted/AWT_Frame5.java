import java.awt.*;
import java.awt.event.*;

class AWT_Frame5 extends Frame
{
    AWT_Frame5(String name)
    {
        super(name);
    }

    public static void main(String ae[])
    {
        AWT_Frame5 f = new AWT_Frame5("Marvellous Infosystems");

        //Decide the siz 
        f.setSize(500,500);

        //Display the frame
        f.setVisible(true);

        //anyinamous inner class
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }

}