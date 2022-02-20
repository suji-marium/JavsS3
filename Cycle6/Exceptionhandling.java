import java.io.*;

class Exceptionhandling
{ 
    public static void main(String args[])
  {
    ArithematicExceptionEg ae = new ArithematicExceptionEg();
    ArrayIndexOutOfBoundsExceptionEg aie = new ArrayIndexOutOfBoundsExceptionEg();
    FileNotFoundExceptionEg fe = new FileNotFoundExceptionEg();
  }
}

class ArithematicExceptionEg
{
  ArithematicExceptionEg()
  {
    try 
    {
       int a=100,b=a/0;
       System.out.println(b);
    } 
    catch(ArithmeticException e) 
    {
        System.out.println("Arithematic Exception has occured");
    }
  } 
}
  
class ArrayIndexOutOfBoundsExceptionEg
{
  ArrayIndexOutOfBoundsExceptionEg()
  {
      try
      {
        int b[]=new int[10];
        b[19]=21;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("ArrayIndexOutOfBoundsException has occured");
      }
  }
}

class FileNotFoundExceptionEg
{
   FileNotFoundExceptionEg()
   {
      try
      {
        FileInputStream fin=new FileInputStream("fin.txt");
      }
      catch(FileNotFoundException e)
      {
        System.out.println("FileNotFoundException has occured");
      }
   }
}
