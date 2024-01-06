import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program433
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("____________Marvellouse PackerUnpacker CUI Panel____________");

        try
        {
            
            System.out.println("Enter the name of packed File");
            System.out.println("NOTE : Packed File should be int he current dirctory");
            String PackFile = sobj.nextLine();


            File Fpackobj = new File(PackFile);
            int ret = 0;

            FileInputStream fin = new FileInputStream(Fpackobj);

            if(Fpackobj.exists())
            {
                byte Header[] = new byte[100];

                fin.read(Header,0,100);

                        String strHeader = new String(Header);

                        System.out.println(strHeader);

                        String Arr[] = strHeader.split(" ");
                        System.out.println("File name is "+Arr[0]);
                        System.out.println("File size is :" +Arr[1]);

                        File obj = new File(Arr[0]);
                        obj.createNewFile();

                        int FileSize = Integer.parseInt(Arr[1]);

                        byte DataArray[] = new byte[FileSize];

                        fin.read(DataArray,0,FileSize);

                        FileOutputStream fout = new FileOutputStream(obj);
                        fout.write(DataArray,0,FileSize);
                
                        
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