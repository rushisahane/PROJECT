import java.awt.*;
import java.awt.event.*;

class AWT_Button extends Frame//implements ActionListener
{
    Button a,b;

    AWT_Button()
    {
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent w)
            {
                System.exit(0);
            }
        });

        //set layout to insert buttons
        //setLayout(new FlowLayout());

        //Create objects of Buttons class
        a  = new Button("Demo");
        b = new Button("Hello");

        //set position of that Button
        a.setBounds(100,100,50,50);
        b.setBounds(100,160,50,50);

        //Add that Button To Frame
        this.add(a);
        this.add(b);
        
    }

    public static void main(String args[])
    {
        //create new Frame
        AWT_Button f = new AWT_Button();

        //setTitle of Window
        f.setTitle("Marvellous Infosystems");

        //Display the frame
        f.setVisible(true); 
    }
}
