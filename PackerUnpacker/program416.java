import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program416
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

            System.out.println("Enter The name of packed File");
            String PackedFile = sobj.nextLine();

            File Fpackobj = new File(PackedFile);

           boolean bret = Fpackobj.createNewFile();
           if(bret == false)
           {
               System.out.println("Unable to create File");
           }
            
            FileOutputStream fout = new FileOutputStream(Fpackobj);

            if(foobj.exists())
            {
                
                int ret = 0;
                File FileName[] = foobj.listFiles();

                System.out.println("Number of all Files are "+FileName.length);

                    System.out.println("File names are :");

                    byte Buffer[] = new byte[1024];
                    int iret = 0;

                    for(int i = 0;i < FileName.length;i++)
                    {

                        System.out.println("File Name : "+FileName[i].getName()+"| Size: "+FileName[i].length());
                    

                     FileInputStream fiobj = new FileInputStream(FileName[i]);

                        while((ret = fiobj.read(Buffer)) != -1)
                        {
                            fout.write(Buffer);

                        } 
                        
                    }               
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