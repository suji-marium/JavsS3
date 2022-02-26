import java.util.*;
class ExplicitException 
{  
   int n;
   public static void main(String args[])
  {
    Scanner obj = new Scanner(System.in);  
    
    int amount=15000,n;
    do 
     {
       System.out.println("1 Deposit\n2 Withdraw \n3.Exit \nPRESS A DIGIT ACCORDING TO THE NEED");
       n=obj.nextInt();    
       Bank b=new Bank();
       switch(n) 
       {
          case 1:
            amount=b.Deposit(amount);
            System.out.println("Available balance="+amount);
            break; 
        
          case 2:
            amount=b.Withdraw(amount);
            if(amount>=0)
            {
               System.out.println("Available balance="+amount);
              try
              {
                 if(amount<500)
                    throw new balanceException();
              }
              catch(balanceException e)
              {
                System.out.println(e);
              }
            }
            else 
            {
               System.out.println("Balance is less than entered amount");
            }
            break;

          case 3:
             break;
       }
     } while(n<3);
   } 
}

class Bank
{
  Scanner obj = new Scanner(System.in);
  int Deposit(int amount)
  {
      System.out.println("Enter the amount to be deposited");
      int deposit =obj.nextInt();
      amount = deposit+amount;
      return amount;
  }
  int Withdraw(int amount)
  {
    System.out.println("Enter the amount to be withdraw");
    int withdraw =obj.nextInt();
    if(amount>=withdraw)
       {  
         amount = amount-withdraw;
         return amount;
       }
    else
    {
      return -1;
    }
  }
}

class balanceException extends Exception
{
   balanceException()
   {
     System.out.println("Balance is less than 500");
   }
}
