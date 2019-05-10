package cc.moecraft.school.chapter3.bank;

/**
 * A simulated bank account class.
 * E3.6, E3.7
 *
 * @author Ticrizon
 */
public class BankAccount
{
    private double balance;

    /**
     * Construct a bank account with balance and owner
     * @param balance Initial balance
     */
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    /**
     * Default constructor, register everything as default.
     */
    public BankAccount()
    {
        this(0);
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
     * Add a interest with a rate
     * @param rate The percentage it increase by.
     */
    public void addInterest(double rate)
    {
        balance *= (rate / 100d) + 1;
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
}
