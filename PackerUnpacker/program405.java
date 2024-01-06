import java.util.*;
import java.io.*;

class program405
{
    public static void main( String arr[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName); 

        if(fobj.exists())
        {
           BufferedReader bobj = new BufferedReader(new FileReader(fobj));

           String data = null;

           while((data = bobj.readLine()) != null)
           {
            System.out.println(data);
           }
           
        }
        else
        {
             System.out.println("There is No Such File");
        }
        
    }
}