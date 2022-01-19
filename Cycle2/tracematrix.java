import java.util.*;

public class tracematrix
{
    public static void main(String args [])
     {
         int i,j,s=0;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter no of rows ");
         int n = obj.nextInt();
         System.out.print("Enter no of columns ");
         int m = obj.nextInt();
         int a[][] = new int[20][20];
         
         if(n == m)
         {     
              System.out.println("Enter elmts of array");
              for(i=0;i<n;i++)
                 for(j=0;j<m;j++)
          
                   {
                      a[i][j] = obj.nextInt();
                   }
          
              for(i=0;i<n;i++)
                   for(j=0;j<m;j++)
                       if(i==j)
                          s = s +a[i][j];
                  
               System.out.println("Sum of diagonal elements = "+s);
         }
     
        else
           System.out.println("Matrix is not a square matrix !!");
         
     }
}
