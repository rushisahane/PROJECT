 import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program436
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);
      
        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");


        System.out.println("Number of word are :"+Arr.length);

        System.out.println("Words from the string");

        for(int i = 0;i < Arr.length;i++)
        {
            System.out.println(Arr[i]);
            System.out.println(Arr[i].length());
        }

        
    }
}