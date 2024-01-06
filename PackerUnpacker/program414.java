import java.util.*;
import java.io.*;

class program414
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
        

            if(foobj.exists())
            {

                File FileName[] = foobj.listFiles();

                System.out.println("Number of all Files are "+FileName.length);

                System.out.println("Files are >");
                for(int i = 0;i < FileName.length;i++)
                {
                    System.out.println("File name is :"+FileName[i].getName()+" | Size :"+FileName[i].length());
                }
               
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