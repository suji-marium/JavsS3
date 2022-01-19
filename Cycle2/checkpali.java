import java.util.*;
public class checkpali
{
    public static void main(String args [])
     {
         int i,flag=0,c=0;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter the string length ");
         int n = obj.nextInt();
         
         System.out.println("Enter the string");
         char a[] = new char[20]; 
         for(i=0;i<n;i++)
          {
              a[i] = obj.next().charAt(0);
          }
          
          
          for(i=0;a[i]!='\0';i++)
               if(a[i] != a[n-i-1])
                  {
                      flag = 1;
                      break;
                  }
               
          if(flag == 1)
             System.out.println("Entered string is not palindrome");

          else
             System.out.println("Entered string is palindrome");
     }
}


