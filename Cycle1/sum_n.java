import java.util.*;

public class sum_n 
 {
    public static void main (String[] args) 
      {
        int i,sum=0;  
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(i=1;i<=n;i++)
           sum = sum + i;
        System.out.println("Sum = "+sum);
      }
 }
