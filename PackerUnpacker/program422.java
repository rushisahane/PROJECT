import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program422
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
                
                int Counter = 0;

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

                           System.out.println("Header : "+FileName[i]+"Size length : "+FileName[i].length());

                           byte headerbyte[] = name.getBytes();//String to byte array conversion;
                           
                           FileInputStream fiobj = new FileInputStream(FileName[i]);

                           fout.write(headerbyte,0,headerbyte.length); //write header in packed file;

                            while((ret = fiobj.read(Buffer)) != -1)
                            {
                               fout.write(Buffer,0,ret);

                            } 
                            Counter++;
                        }
                        
                    }  

                    System.out.println("--------Summary-----------");
                    System.out.println("Number of file Scanned : "+FileName.length); 
                    System.out.println("Numbers of Packed File are :"+Counter);
                    System.out.println("------------Thanku for using Marvellouse Packer Unpacker Panal-------------");            
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