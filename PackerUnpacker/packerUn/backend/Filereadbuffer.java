import java.io.*;

class Filereadbuffer
{
    public static void main(String a[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("f1.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = 0;

            while((i = bin.read()) != -1)
            {
                System.out.println((char)i);
            }
            bin.close();
            fin.close();
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}