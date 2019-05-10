package cc.moecraft.school.chapter3.bank;

public class SavingsAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount account = new SavingsAccount(1000, 10);
        account.addInterest();

        System.out.println("Amount after add interest: " + account);
        System.out.println("Expected: $1100");
    }
}
