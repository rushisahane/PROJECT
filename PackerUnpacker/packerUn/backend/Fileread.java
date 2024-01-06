import java.io.*;

class Fileread
{
    public static void main(String arg[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("demo.txt");
            int i = 0;

            while((i = fin.read()) != -1)
            {
                System.out.print((char)i);
            }

            fin.close();
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}