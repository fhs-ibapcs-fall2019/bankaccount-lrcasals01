public class BankAccount
{
    public double balance;
    public String accountHolder;
    public int accountNumber;
    public String password;
    public boolean loggedIn;
    
    public BankAccount(double balance, String accountHolder, int accountNumber,
    String password)
    {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.password = password;
        this.loggedIn = false;
    }
    
    //mutator - allow you to change an instance variable (attribute)
    public void logIn(String name, String password)
    {
        if (accountHolder.equals(name) && this.password.equals(password))
        {
            loggedIn = true;
        }
    }
    
    //allows for Deposit
     public double Deposit(double amount)
     {
        if(loggedIn)
        {
            balance = balance + amount;
            return balance;
        }
      else
        {
            throw new IllegalStateException("Please log in");
        }
    }
    
    //allows for Withdraw if enough funds are present
      public double Withdraw(double amount)
     {
        if(loggedIn)
        {
            if(balance > amount)
            {
                balance = balance - amount;
                return balance;
            }
            else
            {
                throw new IllegalStateException("Insufficent Funds");
            }
        }
      else
        {
            throw new IllegalStateException("Please log in");
        }
    }

    // Give Account Information
    public String toString()
    {
      if (loggedIn){
         return accountHolder + " Account# " + accountNumber 
         + " Balance : $" + this.balance;  
      }
      else
      {
         throw new IllegalStateException("Please log in");
      }
    }
    
    //log user out
    public void logOut()
    {
        loggedIn = false;
    }
}