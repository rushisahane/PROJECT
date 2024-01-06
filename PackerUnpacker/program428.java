import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

class program428
{
    public static void main( String arr[]) 
    {
        Scanner sobj = new Scanner(System.in);
      
        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");


        System.out.println("Number of word are :"+Arr.length);

        System.out.println("Worlds from the string");

        int iMax = 0;
        int MaxIndex = 0; 

        for(int i = 0;i < Arr.length;i++)
        {
            if(iMax <= Arr[i].length())
            {
                iMax = Arr[i].length();
                MaxIndex = i;      
            }  
        }

        System.out.println("Largest Word is from the string is : "+Arr[MaxIndex]+"  With the length : "+iMax);
    }
}