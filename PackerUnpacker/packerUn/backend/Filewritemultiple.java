import java.io.*;

class Filewritemultiple
{
    public static void main(String ap[])
    {
        try
        {
            FileOutputStream fout1 = new FileOutputStream("f1.txt");
            FileOutputStream fout2 = new FileOutputStream("f2.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();

            byte b = 'a';

            bout.write(b);
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
            System.out.println("Success"); 
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}