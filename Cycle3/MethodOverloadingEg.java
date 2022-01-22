import java.util.*;
class MethodOverloadingEg
{
	public static void main(String[] args)
	{ 
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of circle :");
       int a = obj.nextInt();
       
       System.out.print("Enter length and breadth of rectangle :");
       int b = obj.nextInt();
       int c = obj.nextInt();
       
       System.out.print("Enter base and height of triangle :");
       float d = obj.nextInt();
       float e = obj.nextInt();
       
       shapes obj1 = new shapes();
       obj1.area(a);
       obj1.area(b,c);
       obj1.area(d,e);
    }
}

class shapes
{
    void area(int r)
    {
        double Area = 3.14*r*r;
        System.out.println("Area of circle = "+Area);
    }
    
    void area(int l,int b)
    {
        double Area = l*b;
        System.out.println("Area of rectangle = "+Area);
    }
    
    void area(float b,float h)
    {
        double Area = (h*b)/2;
        System.out.println("Area of triangle = "+Area);
    }
}
