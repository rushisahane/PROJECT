import java.util.*;
import java.io.*;

class program411
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Please Enter The Folder Name");
            String FolderName = sobj.nextLine();

            File fobj = new File(FolderName);

            if(fobj.exists())
            {
                
            }
            else
            {
                System.out.println("There is no Such Folder");

            }
   
        }//End Of try
        catch(Exception obj)
        {
            System.out.println("Exception Occured"+obj);
        }
        
        
    }//end of main
}//end of class