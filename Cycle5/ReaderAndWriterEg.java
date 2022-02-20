import java.util.*;
import java.io.*;

public class ReaderAndWriterEg 
{
  public static void main(String args[])  
  {
      try
      {
        Scanner obj=new Scanner(System.in);
        FileWriter fw=new FileWriter("e3.txt");
        System.out.print("Enter your name: ");
        String name=obj.nextLine();
        System.out.print("Enter your address: ");
        String addr=obj.nextLine();
        fw.write(name);
        fw.write("\n");
        fw.write(addr);
        fw.close();

        FileReader fr =new FileReader("e3.txt");
        int i;
        while((i=fr.read())!=-1)
        {
          System.out.print((char)i);
        }
       fr.close();
      }
      
      catch(Exception e)
      {
          System.out.println(e);
      }  
  }
}
