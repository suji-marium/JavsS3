import java.util.*;

public class replacechar
{
    public static void main(String args[])
    {
        int i;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the string length ");
        int n = obj.nextInt();
        System.out.println("Enter string elements ");
        char a[] = new char[20];
        
        for(i=1;i<=n;i++)
            a[i] = obj.next().charAt(0);
        
        System.out.println("Enter the position of the character to be replaced :");
        int x = obj.nextInt();
        
        System.out.println("Enter the character to be placed at previous position:");
        char ch = obj.next().charAt(0);
        
        for(i=1;i<=n;i++)
             a[x] = ch;
        System.out.println("Replaced String");
        for(i=1;i<=n;i++)
            System.out.println(a[i]);
    }
}
