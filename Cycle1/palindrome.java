import java.util.*;

public class palindrome 
 {
    public static void main (String[] args) 
      {
        int orgi,rem,res=0;  
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        orgi = n;
        while(orgi!=0)
        {
            rem = orgi%10;
            res = res*10 + rem;
            orgi = orgi/10;
        }
        if (res==n)
            System.out.println(n+" is paliondrome");
        else
           System.out.println(n+" is not paliondrome");
      }
 }
