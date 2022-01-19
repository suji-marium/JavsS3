import java.util.*;

public class replaceelmt
{
    public static void main(String args [])
     {
         
         int i;
         Scanner obj = new Scanner(System.in);
         System.out.print("Enter no of elements in the array ");
         int n = obj.nextInt();
         System.out.println("Enter array elements");
         int a[] = new int[20];

         for(i=1;i<=n;i++)
          {
              a[i] = obj.nextInt();
          }
          
         System.out.println("Enter element to be replaced and position");
         int x = obj.nextInt();
         int y = obj.nextInt();
         
         System.out.println("Enter element to be placed in previous position");
         int z = obj.nextInt();
         a[y] = z;
         
         System.out.println("Replaced array");
         for(i=1;i<=n;i++)
           {
              System.out.println(a[i]);
           }
     }
}
