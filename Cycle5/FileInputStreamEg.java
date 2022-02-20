import java.io.*;
class FileInputStreamEg
{
    public static void main(String args[]) throws Exception
    {
        
        int i=0,j=1;
        try
         {
           FileInputStream fin = new FileInputStream("e1.txt"); 
           System.out.print(j +"-");
           while((i=fin.read())!=-1)
           {
             System.out.print((char)i);
             if(i=='\n')
               System.out.print(++j +"-");
           }
         }  
        catch(Exception e)
        {
            System.out.println(e); 
        }
        fin.close();
    }
}
