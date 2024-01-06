import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program432
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("____________Marvellouse PackerUnpacker CUI Panel____________");

        try
        {
            
            System.out.println("Enter the name of Packed File");
            System.out.println("NOTE : Packed File should be in the Current directory");

            String PackFile = sobj.nextLine();

         
            File Fpackobj = new File(PackFile);

            FileInputStream fin = new FileInputStream(Fpackobj);

            if(Fpackobj.exists())
            {
                System.out.println("Packed File is There");

                byte Header[] = new byte[100];

                fin.read(Header,0,100);

                String strHeader = new String(Header);

                System.out.println(strHeader);

                String Arr[] = strHeader.split(" ");          //File tar Create Hot ahe pan Ji File Create Hotiye Tya File Madhe 
                                                              //Packed File Cha Data Lihila jat Nahiye
               System.out.println("File name is "+Arr[0]);
                System.out.println("File size is :" +Arr[1]);

                File obj = new File(Arr[0]);                   
                obj.createNewFile();
                        
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