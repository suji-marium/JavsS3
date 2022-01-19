import java.util.*;

public class serachchar
{
    public static void main(String args [])
     {
         int i,flag=0;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter the string length ");
         int n = obj.nextInt();
         
         System.out.println("Enter the string ");
         char a[] = new char[20]; 
         for(i=0;i<n;i++)
          {
              a[i] = obj.next().charAt(0);
          }
          
         System.out.print("Enter the character to be searched ");
         char ch = obj.next().charAt(0); 
          
         for(i=0;i<n;i++)
           {  
             if (a[i] == ch)
             {
                 flag = 0;
                 break;
             }
             else
               flag = 1;
           }
        if(flag == 1)
           System.out.println("Character is not present in the string");
        else
           System.out.println("Character is present in position "+(i+1));
     }    
}
