import java.util.*;

public class factors 
 {
    public static void main (String[] args) 
      {
        int i;  
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("Factors of "+n+ " are ");
        for (i=1;i<=n;i++) 
          { 
           if(n%i==0)
             {
              System.out.println(i);
             }
          }
      }
 }     
