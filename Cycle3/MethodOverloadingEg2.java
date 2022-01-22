import java.util.*;
class MethodOverloadingEg2
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 2 strings to be concatenated :");
        String c = obj.nextLine();
        String d = obj.nextLine();
        
        System.out.print("Enter 2 numbers to be concatenated :");
        int a = obj.nextInt();
        int b = obj.nextInt();
    
        Solve obj1 = new Solve();
        obj1.Concatenate(a,b);
        obj1.Concatenate(c,d);
    }
}

class Solve
{
    void Concatenate(int a,int b)
       { 
          System.out.println("Concatenated numbers = " +a+b);
       }
    
    void Concatenate(String a,String b)  
       {
         System.out.println("Concatenated strings = "+a+b);
       }
}     
