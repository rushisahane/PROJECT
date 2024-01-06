import java.io.*;

class Filewritebuffer
{
    public static void main(String arg[])
    {
        try
        {
            FileOutputStream fout = new FileOutputStream("f1.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            String str = "Marvellouse Infosystems";
            byte b[] = str.getBytes();
            bout.write(b);

            bout.flush();
            bout.close();
            fout.close();
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}