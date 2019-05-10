package cc.moecraft.school.chapter8.e8_1;

/**
 * The class {@code Coin} contains the value and the name for one
 * coin in a type of coin.
 *
 * <p>For example, the coin type QUARTER would have a value of 0.25,
 * and its name "quarter".
 *
 * @author Yijie Gui
 * @author Andy Ge
 * @author Cole MacKennon
 * @since 2019-01-30
 */
public class Coin
{
    public static final Coin QUARTER = new Coin(0.25, "quarter");
    public static final Coin DIME = new Coin(0.1, "dime");
    public static final Coin NICKEL = new Coin(0.05, "nickel");
    public static final Coin PENNY = new Coin(0.01, "penny");

    private double value;
    private String name;

    /**
     * Construct an instance of a type of coin with the value of the
     * coin and its name.
     *
     * @param value Value of one coin of this type of coin.
     * @param name Name of its name.
     */
    public Coin(double value, String name)
    {
        this.value = value;
        this.name = name;
    }

    /**
     * Get the value of one coin of this type of coin.
     *
     * <p>For example, the coin type QUARTER would return 0.25.
     *
     * @return The value of one coin of this type.
     */
    public double getValue()
    {
        return value;
    }

    /**
     * Get the name of this type of the coin.
     *
     * @return The name of this type of coin.
     */
    public String getName()
    {
        return name;
    }
}
