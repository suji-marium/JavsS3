import java.util.*;

public class sumarray
{
	public static void main(String[] args) {
		{   
		    int i,s=0;
		    Scanner obj = new Scanner (System.in);
		    System.out.print("Enter no of elements in the array ");
		    int n =  obj.nextInt();
		    System.out.println("Enter array elements");
		    int a[] = new int[20];
		    
        for (i=0;i<n;i++) 
		        a[i] = obj.nextInt();
		    for (i=0;i<n;i++)
		         s = s+a[i];
		    System.out.println("Sum = "+s);
		}
	}
}
