import java.util.*;
import java.io.*;

class program404
{
    public static void main( String arr[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName); 

        if(fobj.exists())
        {
            System.out.println("File Size is :"+fobj.length());
           
        }
        else
        {
             System.out.println("There is No Such File");
        }
        
    }
}