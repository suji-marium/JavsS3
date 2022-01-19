import java.util.*;

public class largearray
{
    public static void main(String args [])
     {
         
         int i,j,l=0;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter no of rows ");
         int n = obj.nextInt();
         System.out.print("Enter no of columns ");
         int m = obj.nextInt();
         System.out.println("Enter array elements");
         int a[][] = new int[20][20];
         
         for(i=0;i<n;i++)
           for(j=0;j<m;j++)
            {
              a[i][j] = obj.nextInt();
            }
        
         l = a[0][0]; 
         
         for(i=0;i<n;i++)
            for(j=0;j<m;j++)
               if (a[i][j] > l)
               
                   l = a[i][j];
            
         System.out.println("Largest Element = "+l);
     }
}
