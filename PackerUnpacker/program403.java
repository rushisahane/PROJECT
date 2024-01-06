import java.util.*;
import java.io.*;

class program403
{
    public static void main( String arr[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name");
        String FileName = sobj.nextLine();

        System.out.println("File Name Is : "+FileName);

        File fobj = new File(FileName); 

        boolean bobj =  fobj.createNewFile();

        if(bobj == true)
        {
            System.out.println("File Is Succesfully created");
        }
        else
        {
            System.out.println("Unable To Create File");
        }
        
    }
}