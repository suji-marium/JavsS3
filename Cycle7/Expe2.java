class Bank 
{
    int amount=500;
    synchronized void withdraw(int amount)
    {
        if(this.amount<amount)
        {
            try{
                 wait();
               }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        this.amount-=amount;
        if (this.amount>amount)
        {
              System.out.println("Withraw Completed");
              System.out.println("Available Balance : "+this.amount);
        }
        else
        {
              System.out.println("Low balance");
              System.out.println("Not able to Withraw");
        }
    }

    synchronized void deposit(int amount)
    {
        this.amount+=amount;
        System.out.println("Deposit Completed");
        System.out.println("Available Balance : "+this.amount);
        notify();
    }
}

class Deposit extends Thread
{
    Bank b;
    Deposit(Bank b)
    {
        this.b=b;
    }
    public void run()
    {
        b.deposit(10000);
    }
}

class Withdraw extends Thread
{
    Bank b;
    Withdraw(Bank b)
    {
        this.b=b;
    }
    public void run()
    {
        b.withdraw(25000);
    }
}

class Expe2
{
    public static void main(String args[])
    {
        Bank b=new Bank();
        Deposit d=new Deposit(b);
        Withdraw w=new Withdraw(b);
        d.start();
        w.start();
    }
}
