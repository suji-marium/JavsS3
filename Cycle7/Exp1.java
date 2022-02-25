import java.util.*;
public class Exp1 
{
    public static void main(String args[])throws Exception
    {
        Number n=new Number();
        n.start();
    }
}

class Number extends Thread
{
    Scanner obj=new Scanner(System.in);
    public void run()
    {
        int i,n,t;
        System.out.println("Enter the number of random integers to be inserted");
        n=obj.nextInt();
        System.out.println("Enter the time limit after which element to be placed");
        t=obj.nextInt();
        Random r=new Random();
        for(i=0;i<n;i++)
        {
            int rand_int=r.nextInt(t);
            System.out.println("The random integer is "+rand_int);
            if(rand_int%2==0)
             {
                 Square s=new Square(rand_int);
                 s.start();
             }
             else
             {
                 Cube c=new Cube(rand_int);
                 c.start();
             }

             try
             {
                 Thread.sleep(1000);
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
        }
    }
}

class Square extends Thread
{
    int n;
    Square(int n)
    {
        this.n=n;
    }

    public void run()
    {
        System.out.println("Square of "+this.n+" is " +(this.n*this.n));
    }
}

class Cube extends Thread
{
    int n;
    Cube(int n)
    {
        this.n=n;
    }
    
    public void run()
    {
        System.out.println("Cube of "+this.n+" is " +(this.n*this.n*this.n));
    }
}
