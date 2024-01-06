import java.util.*;
import java.io.*;

class program409
{
    public static void main(String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter The Name Of Source File");
            String Source = sobj.nextLine();
            
            System.out.println("Enter The Name Of Destination File");
            String Destination = sobj.nextLine();

            File Fsource = new File(Source);
            File FDest = new File(Destination);

            boolean bret = Fsource.exists();
            if(bret == false)
            {
              System.out.println("Unable To Create Destination File");
              return;
            }

            bret = FDest.createNewFile();
            if(bret == false)
            {
                System.out.println("Unable to create destination file");
                return;
            }


        }//End Of try
        catch(Exception obj)
        {
            System.out.println("Exception Occured"+obj);
        }
        
    }//end of main
}//end of class