import java.util.*;

public class freqchar
{
    public static void main(String args [])
     {
         int i,c=0;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter the string length ");
         int n = obj.nextInt();
         
         System.out.println("Enter the string ");
         char a[] = new char[20]; 
         for(i=0;i<n;i++)
          {
              a[i] = obj.next().charAt(0);
          }
          
         System.out.print("Enter the character whose frequency is to be calculated ");
         char ch = obj.next().charAt(0); 
          
         for(i=0;i<n;i++)
           {  
             if (a[i] == ch)
             {
                 c +=1;
             }
           }
           System.out.println("Frequency of " +ch+ " character = "+c);
        
     }    
}
