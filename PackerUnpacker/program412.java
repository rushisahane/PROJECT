import java.util.*;
import java.io.*;

class program412
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Please Enter The Folder Name");
            String FolderName = sobj.nextLine();

            //System.out.println("your folder name is :" +FolderName);

            File foobj = new File(FolderName);
            int ret = 0;

            if(foobj.exists())
            {

                File Allfiles[] = foobj.listFiles();

                System.out.println("Number of all Files are "+Allfiles.length);
               
            }
            else
            {
                System.out.println("Folder is not  present");
            }

        
   
        }//End Of try
        catch(Exception obj)
        {
            System.out.println("Exception Occured"+obj);
        }
        
        
    }//end of main
}//end of class