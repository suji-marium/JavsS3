import java.util.*;

public class seclarge
{
    public static void main(String args [])
     {
         
         int i,j,l=0,sl;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter no of elements in the array ");
         int n = obj.nextInt();
         System.out.println("Enter array elements");
         int a[] = new int[20];
         
         for(i=0;i<n;i++)
          {
              a[i] = obj.nextInt();
          }
        
         l = a[0]; 
         for(i=0;i<n;i++)
         { 
               if (a[i] > l)
               {
                   l = a[i];
               }
        }
        
        sl = a[0];
        for(i=0;i<n;i++)
        {
            
            if(a[i]>sl && a[i]<l)
                sl = a[i];
        }
    
         System.out.println("Second Largest Element = "+sl);
     }
    
}

