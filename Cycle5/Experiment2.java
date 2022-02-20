import java.io.*;
public class Experiment2
{
    public static void main(String args[]) throws Exception
    {
        int i=0,l=1,c=0,w=0;
        try
        {
            FileInputStream fin = new FileInputStream("e2.txt");
            while ((i=fin.read())!=-1)
            {
              ++c;
              if(i=='\n')
                ++l;
              if(i== ' '|| i=='\n')
                ++w;
            }
            System.out.println("No of lines ="+l);
            System.out.println("No of characters ="+c);
            System.out.println("No of words ="+w);
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
  }
  
