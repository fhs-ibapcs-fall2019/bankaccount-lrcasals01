/**
 * Write a description of class TestClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestClass
{
    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount(500, "Lucas", 123, "pass");
        a1.logIn("Lucas", "pass");
        System.out.println(a1);
        
        a1.Deposit(10000);
        System.out.println(a1);
        
        a1.Withdraw(500);
        System.out.println(a1);

    }
}