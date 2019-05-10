package cc.moecraft.school.chapter3.bank;

public class BankAccountTester
{
    public static void main(String[] args)
    {
        System.out.println("\nTesting Deposit And Withdraw:");
        testDepositAndWithdraw();

        System.out.println("\nTesting Interest Addition:");
        testAddInterest();
    }

    public static void testDepositAndWithdraw()
    {
        BankAccount account = new BankAccount();
        account.deposit(1000d);
        account.withdraw(500d);
        account.withdraw(400d);

        System.out.println("Remaining: " + account);
        System.out.println("Expected: $100");
    }

    public static void testAddInterest()
    {
        BankAccount account = new BankAccount();
        account.deposit(1000d);
        account.addInterest(10d);

        System.out.println("Amount after add interest: " + account);
        System.out.println("Expected: $1100");
    }
}
