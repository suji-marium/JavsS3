import java.util.*;
class multiplication {
        public static void main(String args [])
         {
             int i,j,k;
             Scanner obj = new Scanner(System.in);
             System.out.print("Enter no of rows of matrix 01 ");
             int r1 = obj.nextInt();
             System.out.print("Enter no of columns of matrix 01 ");
             int c1 = obj.nextInt();

             System.out.print("Enter no of rows of array 02 ");
             int r2 = obj.nextInt();
             System.out.print("Enter no of columns of array 02 ");
             int c2 = obj.nextInt();
             
             int a[][] = new int[20][20];
             int b[][] = new int[20][20];
             int c[][] = new int[20][20];
             
             if(c1==r2)
              {  
                 System.out.println("Enter elmts of array 01 ");
                 for(i=0;i<r1;i++)
                   for(j=0;j<c1;j++)
                    {
                     a[i][j] = obj.nextInt();
                    }
  
                   System.out.println("Enter elmts of array 02");
                   for(i=0;i<r2;i++)
                     for(j=0;j<c2;j++)
                     {
                       b[i][j] = obj.nextInt();
                    }
        
                    System.out.println("Resultant array ");
                    for(i=0;i<r1;i++)
                       { 
                         for(j=0;j<c2;j++)
                           {
                            c[i][j]=0;
                            for(k=0;k<c1;k++)
                              {
                               c[i][j] += a[i][k] * b[k][j];
                              }
                           } 
                        }
                    for(i=0;i<r1;i++)
                     { 
                        System.out.println("\n"); 
                        for(j=0;j<c2;j++)
                        {
                         System.out.print("\t"+c[i][j]);
                       }  
                    }    
                }
             else
                  System.out.println("Matrix multiplication is not possible");
         }
    }

