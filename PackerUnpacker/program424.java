import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program423
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("____________Marvellouse PackerUnpacker CUI Panel____________");

        try
        {
            
            System.out.println("Please Enter The Folder Name which contains the file that you packed");
            String FolderName = sobj.nextLine();

            //System.out.println("your folder name is :" +FolderName);

            File foobj = new File(FolderName);

            System.out.println("Enter The name of packed File that you want to create");
            System.out.println("NOTE : Packed file while automatically created");
            String PackedFile = sobj.nextLine();

            File Fpackobj = new File(PackedFile);

            FileInputStream fin = new FileInputStream(Fpackobj);

            if(foobj.exists())
            {
              File FileName           
            }
            else
            {
                System.out.println("Folder is not present");
               
            }
   
   
        }//End Of try
        catch(Exception obj)
        {
            System.out.println("Exception Occured"+obj);
        }
        
        
    }//end of main
}//end of class