import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program408
{
    public static void main( String arr[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName); 

        if(fobj.exists())
        {
           FileInputStream fiobj = new FileInputStream(fobj);

           byte Buffer[] = new byte[100];              //its not able to write dat in file;
           int ret = 0;
           int Size = 0;

           while((ret = fiobj.read(Buffer)) != -1)
           {
              Size = Size + ret;
             // String str = new String(Buffer,StandardCharsets.UTF_8);
             // System.out.println(str);
           }

           System.out.println("Number of bytes are "+Size);

           
        }
        else
        {
             System.out.println("There is No Such File");
        }
        
    }
}