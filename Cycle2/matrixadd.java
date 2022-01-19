import java.util.*;

public class matrixadd
{
    public static void main(String args [])
     {
         int i,j;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter no of rows of array 01 ");
         int n = obj.nextInt();
         System.out.print("Enter no of columns of array 01 ");
         int m = obj.nextInt();
         
         int a[][] = new int[20][20];
         int b[][] = new int[20][20];
         int c[][] = new int[20][20];
         
         System.out.println("Enter elmts of array 01 ");
         for(i=0;i<n;i++)
          for(j=0;j<m;j++)
          
          {
              a[i][j] = obj.nextInt();
          }


         System.out.print("Enter no of rows of array 02 ");
         int x = obj.nextInt();
         System.out.print("Enter no of columns of array 02 ");
         int y = obj.nextInt();
         
         System.out.println("Enter elmts of array 02");
         for(i=0;i<n;i++)
          for(j=0;j<m;j++)
          
          {
              b[i][j] = obj.nextInt();
          }
    
          if(n==x && m==y)
            {    
                System.out.println("Resultant array ");
                for(i=0;i<n;i++)
                   { 
                     System.out.println("\n");
                     for(j=0;j<m;j++)
          
                      {
                        c[i][j] = a[i][j] + b[i][j];
                        System.out.print("\t"+c[i][j]);
                       }
                   }
            }
         else
         System.out.println("Addition is not possible");
     }
}
