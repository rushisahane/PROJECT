import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program430
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);
      
        System.out.println("Enter the string");
        String str = sobj.nextLine();

        System.out.println("Enter the word that you want to search");
        String word = sobj.nextLine();

        String Arr[] = str.split(" ");


        System.out.println("Number of word are :"+Arr.length);

        System.out.println("Worlds from the string");

       int icount = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i].equals(word))
            {
                icount++;     
            }  
        }

        System.out.println("freaquncy of the word is  :" +icount);
    }
}