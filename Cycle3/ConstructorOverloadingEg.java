import java.util.*;
class ConstructorOverloadingEg
{
	public static void main(String[] args)
	{ 
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of circle :");
       int a = obj.nextInt();
       
       System.out.print("Enter length and breadth of rectangle :");
       int b = obj.nextInt();
       int c = obj.nextInt();
       
       perimeter obj1 = new perimeter(a);
       obj1 = new perimeter(b,c);
    }
}

class perimeter
{
    perimeter(int r)
    {
        double Perimeter = 3.14*2*r;
        System.out.println("Perimeter of circle = "+Perimeter);
    }
    
    perimeter(int l,int b)
    {
        double Perimeter = 2*(l+b);
        System.out.println("Perimeter of rectangle = "+Perimeter);
    }  
}
