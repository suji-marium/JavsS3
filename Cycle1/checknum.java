import java.util.*;

public class checknum 
 {
    public static void main (String[] args) 
      {
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        if(n%2==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");
      }
 }
