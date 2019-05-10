package cc.moecraft.school.chapter3.cash;

import java.util.ArrayList;

/**
 * A cash register totals up sales and computes change due.
 * E3.9
 *
 * @author Ticrizon
 */
public class CashRegister9
{
    // Note: This is a better solution because it allows you to easily remove
    //       or undo a purchase or payment. If you concat the receipt directly
    //       to a string when a payment or a purchase is recorded, you would
    //       have to search in the string to find the line and delete it when
    //       trying to undo, and it would cause confusion.
    private ArrayList<Double> purchases;
    private ArrayList<Double> payments;

    /**
     * Default constructor.
     */
    public CashRegister9()
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
        double change = getTotalPayment() - getTotalPurchase();
        purchases = new ArrayList<>();
        payments = new ArrayList<>();
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
        // This assignment specifically said to use String.concat,
        // so I used that...
        // Normally I use StringBuilder.append

        String receipt = "";
        receipt = receipt.concat("-----== Start of a receipt ==-----\n");
        receipt = receipt.concat("##### [Purchases] #####\n");

        for (Double purchase : purchases)
            receipt = receipt.concat("> ").concat(String.valueOf(purchase)).concat("\n");

        receipt = receipt.concat("\n##### [Payments] #####\n");

        for (Double payment : payments)
            receipt = receipt.concat("> ").concat(String.valueOf(payment)).concat("\n");

        receipt = receipt.concat("\n-----== End of the receipt ==-----\n");

        return receipt;
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
}
