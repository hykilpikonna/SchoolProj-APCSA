package cc.moecraft.school.chapter8.e8_1;

/**
 * Tester for the cash register methods with coins.
 *
 * @author Yijie Gui
 * @author Andy Ge
 * @author Cole MacKennon
 * @since 2019-01-30
 */
public class CashRegisterCoinTester
{
    public static void main(String[] args)
    {
        // Creates new cash register
        CashRegister register = new CashRegister();

        //Takes a purchase of 1 dollar and 62 cents
        register.recordPurchase(1.62);

        //Pays with 4 of each type of coin
        register.receivePayment(4, Coin.QUARTER);
        register.receivePayment(4, Coin.DIME);
        register.receivePayment(4, Coin.NICKEL);
        register.receivePayment(4, Coin.PENNY);

        //Prints Change and Receipt
        System.out.println("######## Start Receipt ########");
        System.out.println(register.printReceipt());
        System.out.println("######### End Receipt ##########");
        System.out.println();

        System.out.println("Calculated Change: " + register.giveChange());
        System.out.println("Expected Change: 0.02");
    }
}
