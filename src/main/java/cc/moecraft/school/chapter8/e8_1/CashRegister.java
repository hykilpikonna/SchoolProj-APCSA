package cc.moecraft.school.chapter8.e8_1;

/**
 * The class {@code CashRegister} contains methods to record purchase
 * and payments for a customer, calculating the change with them, and
 * composing a receipt containing all of the purchases and payments.
 *
 * <p>Note: Instances of the class should be created per customer.
 * Reusing the same object for different customers can result in an
 * inaccurate receipt.
 *
 * @author Yijie Gui
 * @author Andy Ge
 * @author Cole MacKennon
 * @since 2019-01-30
 */
public class CashRegister
{
    private double purchase;
    private double payment;
    private String receipt;

    /**
     * Construct a cash register class with default value of zeros.
     * And initializes the receipt to an empty string.
     */
    public CashRegister()
    {
        purchase = 0;
        payment = 0;
        receipt = "";
    }

    /**
     * Record a purchase with a specified amount of money, and includes
     * this record in the receipt.
     *
     * @param amount Amount of money for this purchase.
     */
    public void recordPurchase(double amount)
    {
        purchase += amount;
        receipt += amount + "\n";
    }

    /**
     * Record a payment made by the customer with a specified amount of
     * money, and includes this record in the receipt.
     *
     * @param amount Amount of money paid by the customer.
     */
    public void receivePayment(double amount)
    {
        payment += amount;
        receipt += amount + "\n";
    }

    /**
     * Record a payment made by the customer with a specified amount of
     * money expressed by the amount of coins and the type of the coin,
     * and includes this record in the receipt.
     *
     * @param coinCount Amount of the coin paid by the customer.
     * @param coinType Type of the coin.
     */
    public void receivePayment(int coinCount, Coin coinType)
    {
        receivePayment(coinCount * coinType.getValue());
    }

    /**
     * Calculates and returns the change, and resets the purchase and payment
     * records to 0.
     *
     * <p>Note: This methods does not reset the receipt.
     *
     * @return Calculated amount of change.
     */
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;

        return change;
    }

    /**
     * Finalizes and returns the receipt containing all of the records of
     * the purchase and payment for this customer along with the total
     * amount of this customer's recorded purchase.
     *
     * <p>Note: This methods does not reset the receipt, and does not print
     * the receipt to System.out.
     *
     * @return Composed string of the receipt.
     */
    public String printReceipt()
    {
        receipt += "Total Amount Due: ";
        receipt += purchase + "\n";
        
        return receipt;
    }
}
