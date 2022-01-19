import java.util.*;
public class fibonacci
 {
    public static void main (String[] args) 
      {
          
        int first_term=0,sec_term=1,next_term,i;  
        
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("FIBONACCI SERIES");
        
        for(i=0;i<n;i++)  
          {
              System.out.println(first_term);
              next_term = first_term + sec_term;
              first_term = sec_term;
              sec_term = next_term;
          }
      }
 }
          
          
          
