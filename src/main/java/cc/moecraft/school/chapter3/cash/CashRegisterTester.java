package cc.moecraft.school.chapter3.cash;

public class CashRegisterTester
{
    public static void main(String[] args)
    {
        System.out.println("=====>> Testing Print Receipt <<=====");
        testPrintReceipt();

        System.out.println("\n\n\n=====>> Testing Sale Total <<=====");
        testSaleTotal();
    }

    public static void testPrintReceipt()
    {
        CashRegister9 register = new CashRegister9();

        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.receivePayment(50);

        // Testing print receipt.
        register.printReceipt();

        double change = register.giveChange();

        System.out.println("Change = " + change);
        System.out.println("Expected = 11.25");
    }

    public static void testSaleTotal()
    {
        CashRegister10 register = new CashRegister10();

        // One person passes
        register.recordPurchase(100);
        register.recordPurchase(50);
        register.receivePayment(151);
        System.out.println("Change 1: " + register.giveChange());

        // The second person passes
        register.recordPurchase(100);
        register.receivePayment(120);
        System.out.println("Change 2: " + register.giveChange());

        // The total
        System.out.println("\nSales Total = $" + register.getSalesTotal());
        System.out.println("Expected = $250");

        System.out.println("\nSales Count = " + register.getSalesCount());
        System.out.println("Expected = 2");

        // Reset
        register.reset();
        System.out.println("\n-- Reset --");

        System.out.println("\nSales Total = $" + register.getSalesTotal());
        System.out.println("Expected = $0");

        System.out.println("\nSales Count = " + register.getSalesCount());
        System.out.println("Expected = 0");
    }
}
