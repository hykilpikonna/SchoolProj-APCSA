package cc.moecraft.school.chapter3.product;

/**
 * E3.13
 *
 * @author Ticrizon
 */
public class Product
{
    private String name;
    private double price;

    /**
     * All args constructor.
     * @param name Name
     * @param price Price
     */
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    /**
     * Reduce the price by an amount.
     * Set to 0 if less than 0.
     * @param amount Amount to reduce by.
     */
    public void reducePrice(double amount)
    {
        price = Math.max(0, price - amount);
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String toString()
    {
        return "Product(name=" + this.getName() +
                ", price=" + this.getPrice() + ")";
    }
}
