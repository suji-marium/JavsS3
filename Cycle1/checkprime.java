import java.util.*;

public class checkprime
 {
    public static void main (String[] args) 
      {
        int i,flag=0;  
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for (i=2;i<n/2;i++) 
          { 
           if(n%i==0)
             {
              flag = 1;
              break;
             }
          }
        if(flag ==0)
            System.out.print(n+" is prime");
        else
            System.out.print(n+" is not prime");

      }
 }     
