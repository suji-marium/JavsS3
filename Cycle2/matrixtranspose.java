import java.util.*;

public class matrixtranspose
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
         int b[][] = new int[20][20];
         
         System.out.println("Enter elmts of array");
         for(i=0;i<n;i++)
          for(j=0;j<m;j++)
          
          {
              a[i][j] = obj.nextInt();
          }
   
         System.out.println("Entered Matrix");
         for(i=0;i<n;i++)
          {
          System.out.print("\n");
          for(j=0;j<m;j++)
              System.out.print(a[i][j]+ "\t");
          }
   
   
   
        for(i=0;i<n;i++)
          for(j=0;j<m;j++)
          
          {
              b[j][i] = a[i][j];
          }

        System.out.println("\nTransposed Matrix");
        for(i=0;i<m;i++)
         { 
          System.out.print("\n");
          for(j=0;j<n;j++)
              System.out.print(b[i][j]+"\t");
         }
     }
}


