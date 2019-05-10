package cc.moecraft.school.chapter3.cash;

import java.util.ArrayList;

/**
 * A cash register totals up sales and computes change due.
 * E3.10
 *
 * @author Ticrizon
 */
public class CashRegister10
{
    private double salesTotal = 0;
    private double salesCount = 0;

    private ArrayList<Double> purchases;
    private ArrayList<Double> payments;

    /**
     * Default constructor.
     */
    public CashRegister10()
    {
        purchases = new ArrayList<>();
        payments = new ArrayList<>();
    }

    /**
     * Records the sale of an item.
     * @param amount The price of the item.
     */
    public void recordPurchase(double amount)
    {
        purchases.add(amount);
    }

    /**
     * Processes a payment received from the customer.
     * @param amount The amount of the payment.
     */
    public void receivePayment(double amount)
    {
        payments.add(amount);
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     * @return The change due to the customer.
     */
    public double giveChange()
    {
        double totalPayment = getTotalPayment();
        double totalPurchase = getTotalPurchase();
        double change = totalPayment - totalPurchase;
        purchases = new ArrayList<>();
        payments = new ArrayList<>();

        // Record values to total
        salesTotal += totalPurchase;
        salesCount ++;

        return change;
    }

    /**
     * Print the receipt in string to System.out
     */
    public void printReceipt()
    {
        System.out.println(getReceipt());
    }

    /**
     * Get the receipt as a string.
     * @return The receipt.
     */
    public String getReceipt()
    {
        // E3.10 didn't say use String.concat
        // so I changed it to StringBuilder.append

        StringBuilder receipt = new StringBuilder();
        receipt.append("-----== Start of a receipt ==-----\n");
        receipt.append("##### [Purchases] #####\n");

        for (Double purchase : purchases)
            receipt.append("> ").append(purchase).append("\n");

        receipt.append("\n##### [Payments] #####\n");

        for (Double payment : payments)
            receipt.append("> ").append(payment).append("\n");

        receipt.append("\n-----== End of the receipt ==-----\n");

        return receipt.toString();
    }

    /**
     * Get a total of payment amount.
     * @return Total payment amount.
     */
    private double getTotalPayment()
    {
        return countTotal(payments);
    }

    /**
     * Get a total of purchase amount.
     * @return Total purchase amount.
     */
    private double getTotalPurchase()
    {
        return countTotal(purchases);
    }

    /**
     * Count the total amount of an array list.
     * @param list The array list.
     * @return The total amount.
     */
    private static double countTotal(ArrayList<Double> list)
    {
        double total = 0d;
        for (double amount : list) total += amount;
        return total;
    }

    /**
     * Reset the sale count
     */
    public void reset()
    {
        salesCount = 0;
        salesTotal = 0;
    }

    /**
     * Get the sales total
     * @return Sales total
     */
    public double getSalesTotal()
    {
        return salesTotal;
    }

    /**
     * Get the sales count.
     * @return Sales count.
     */
    public double getSalesCount()
    {
        return salesCount;
    }
}
