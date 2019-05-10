package cc.moecraft.school.chapter3.bank;

/**
 * A simulated bank account class.
 * E3.8
 *
 * @author Ticrizon
 */
public class SavingsAccount
{
    private double balance;
    private double interestRate;

    /**
     * Construct a bank account
     * @param balance Initial balance
     * @param interestRate Interest rate
     */
    public SavingsAccount(double balance, double interestRate)
    {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    /**
     * Deposits money into the bank account.
     * @param amount the amount to deposit.
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw.
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    /**
     * Add a interestRate with the rate set in variable interestRate
     */
    public void addInterest()
    {
        balance *= (interestRate / 100d) + 1;
    }

    public String toString()
    {
        return "BankAccount(balance=" + this.getBalance() + ")";
    }

    // #################
    // Getters & Setters
    // #################

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
}
