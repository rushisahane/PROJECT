import java.io.*;

class filereader
{
    public static void main(String a[])
    {
        try
        {
            FileWriter fw = new FileWriter("f1.txt");
            fw.write("Educating for Better Tomorrow");
            fw.close();

        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
        System.out.println("Success");
    }
}