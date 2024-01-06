import java.util.*;
import java.io.*;

class program406
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

           byte Buffer[] = new byte[100];              //its not able to read data in file;
           int ret = 0;

           while((ret = fiobj.read(Buffer)) != -1)
           {
              System.out.println(Buffer);
           }

           
        }
        else
        {
             System.out.println("There is No Such File");
        }
        
    }
}