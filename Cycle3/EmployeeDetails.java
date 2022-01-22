import java.util.*;
class EmployeeDetails 
{
    String name ;
    int epno,pn;
    void EnterDetails()  
      {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name :");
        name = obj.nextLine();  
       
        System.out.print("Enter Empo No :"); 
        epno = obj.nextInt();
        
        System.out.print("Enter Phone no :"); 
        pn = obj.nextInt();
      }
       
    void PrintDetails()
      {
        System.out.println("Name : "+name);
        
        System.out.println("Empo No : "+epno); 

        System.out.println("Phone no : "+pn); 
      }

    public static void main(String[] args) 
      {
        int i;  
        EmployeeDetails obj[] = new EmployeeDetails[50];

        for(i=0;i<5;i++) 
          {  
            obj[i] = new EmployeeDetails();
            obj[i].EnterDetails(); 
          }
        System.out.println();
        System.out.println("Details of Employess");  
        for(i=0;i<5;i++) 
          {
            obj[i].PrintDetails();
          }
       }
}
