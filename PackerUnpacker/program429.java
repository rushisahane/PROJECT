import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program429
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);
      
        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");


        System.out.println("Number of word are :"+Arr.length);

        System.out.println("Worlds from the string");

       int icount = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i].equals("Demo"))
            {
                icount++;     
            }  
        }

        System.out.println("Demo is in string Count is :"+icount);
    }
}