import java.io.*;

class filewriter
{
    public static void main(String ard[])
    {
        try
        {
            FileReader fr = new FileReader("f1.txt");
            int i = 0;

            while((i = fr.read()) != -1)
            {
                System.out.println((char)i);
            }
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}