import java.util.*;
public class armstrong   
{
   public static void main (String args[])
   {
        int orginum,rem,res=0,c=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        orginum=n;
        while(orginum!=0)
        {
            orginum=orginum/10;
            c=c+1;
         }
        orginum=n;
        while(orginum!=0)
        {
            int rems=1; 
            rem = orginum%10;
            for(int i=0;i<c;i++)
            {
               rems=rem*rems;
               
            }
            res=res+rems;
            orginum=orginum/10;
          }
        System.out.println(res);
        if(res==n)
             System.out.println(n+" is Armstrong number");
        else
             System.out.println(n+" is not Armstrong number");
    }      
} 
