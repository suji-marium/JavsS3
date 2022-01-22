import java.util.*;
class StudentDetails
{
	public static void main(String[] args)
	{ 
		Student obj1 = new Student();
		obj1.Student_read();
		obj1.Student_print();
	}
}

class Student
{
    int n,i,r;
    String name;
    int sub[] = new int[5];
    
    void Student_read()
    {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name :");
        name = obj.nextLine();  
        System.out.print("Enter Roll no :");
        r = obj.nextInt();
        
        for(i=0;i<5;i++)
             {
               System.out.print("Enter mark of sub"+(i+1)+ "= ");
               sub[i] = obj.nextInt();
             }
    }

    void Student_print()
    {
        System.out.println("\n");
        System.out.println("Name : "+name);
        
        System.out.println("Roll no : "+r);
        
        for(i=0;i<5;i++)
             {
               System.out.println("Mark of sub "+(i+1)+ " = "+sub[i]);
             }
    }
}
