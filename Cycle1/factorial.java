import java.util.*;

public class factorial
 {
    public static void main (String[] args) 
      {
        int i,fact=1;  
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(i=1;i<=n;i++)
           fact = fact * i;
        System.out.println("Factorial of " +n+ " = "+fact);
      }
 }
