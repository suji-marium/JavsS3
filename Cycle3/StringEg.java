import java.util.*;
class StringEg
{
	public static void main(String[] args)
	{ 
	   int i;
       Scanner obj = new Scanner(System.in);
	    
	   System.out.print("Enter the string length ");
       int n = obj.nextInt();
         
       System.out.println("Enter the string");
       char a[] = new char[20]; 
       for(i=0;i<n;i++)
       {
         a[i] = obj.next().charAt(0);
       }
	   Strings obj1 = new Strings();
	   obj1.frequency(a,n);
	   obj1.reverse(a,n);
	}
}
	    
	    
class Strings
{
    void frequency(char a[],int n)
     {
        int i,c=0;
	    Scanner obj2 = new Scanner(System.in);
	    System.out.print("Enter a charcter whose frequency is to be found :");
	    char y = obj2.next().charAt(0);
	    
	    for(i=0;i<n;i++)
	         if(a[i] == y)
	             c = c + 1;
	    System.out.println("Frequency of entered character is "+c);
     }

    void reverse(char a[],int n)
    {
        char b[] = new char[20];
        int i,m=n-1;
        for(i=0;i<n;i++,m--)
        {
            b[i] = a[m];
        }
        
        System.out.println("Reversed String ");
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+b[i]);
        }
    }
}
