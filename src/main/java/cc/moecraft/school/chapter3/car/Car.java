package cc.moecraft.school.chapter3.car;

/**
 * E3.12
 *
 * @author Ticrizon
 */
public class Car
{
    private double fuelEfficiencyInMilesPerGallon;

    /**
     * Gas in tank in gallon.
     */
    private double gasInTank;

    /**
     * Constructor
     *
     * @param fuelEfficiencyInMilesPerGallon Fuel efficiency in miles per gallon
     */
    public Car(double fuelEfficiencyInMilesPerGallon)
    {
        this.fuelEfficiencyInMilesPerGallon = fuelEfficiencyInMilesPerGallon;
        this.gasInTank = 0;
    }

    /**
     * Simulates driving the car for a certain distance.
     * Also reduces the gasInTank amount.
     *
     * @param distance Distance in miles.
     */
    public void drive(double distance)
    {
        gasInTank -= distance / fuelEfficiencyInMilesPerGallon;
    }

    /**
     * Add gas to the tank.
     *
     * @param amount Gas amount in gallon.
     */
    public void addGas(double amount)
    {
        gasInTank += amount;
    }

    /**
     * Get gas in tank in gallon
     *
     * @return Gas in tank, in gallon.
     */
    public double getGasInTank()
    {
        return gasInTank;
    }
}
