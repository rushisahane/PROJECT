import java.io.*;

class FileWrite
{
    public static void main(String a[])
    {
        try
        {
            FileOutputStream fout = new FileOutputStream("demo.txt");

            String s = "Marvellouse Infosystems";

            byte b[] = s.getBytes();
            //converting string to byte array;
            fout.write(b);

            fout.close();

            System.out.println("Success");

        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}