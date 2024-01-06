import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program421
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

            Fpackobj.createNewFile();

            FileOutputStream fout = new FileOutputStream(Fpackobj);

            if(foobj.exists())
            {
                
                int ret = 0;
                File FileName[] = foobj.listFiles();

                String name;

                System.out.println("Number of all Files are "+FileName.length);

                System.out.println("File names are :");

                byte Buffer[] = new byte[1024];
                

                    for(int i = 0;i < FileName.length;i++)
                    {
                        name = FileName[i].getName();
 

                        if(name.endsWith(".txt"))
                        {
                            
                            name = name + " " + (FileName[i].length());

                             for(int j = name.length();j < 100 ;j++)
                             {
                                   name = name + " ";
                             }

                           System.out.println("Header : "+name+"Size length : "+name.length());

                           byte headerbyte[] = name.getBytes();//String to byte array conversion;
                           
                           FileInputStream fiobj = new FileInputStream(FileName[i]);

                           fout.write(headerbyte,0,headerbyte.length); //write header in packed file;

                            while((ret = fiobj.read(Buffer)) != -1)
                            {
                               fout.write(Buffer,0,ret);

                            } 
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