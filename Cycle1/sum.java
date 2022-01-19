import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        int sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int m = obj.nextInt();
        int n = obj.nextInt();
        sum = m+n;
        System.out.println("Sum = "+sum);
    }
}
