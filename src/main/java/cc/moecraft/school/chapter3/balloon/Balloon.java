package cc.moecraft.school.chapter3.balloon;

/**
 * P3.3
 *
 * @author Ticrizon
 */
public class Balloon
{
    private double radius = 0;

    /**
     * Inflate it
     * @param amount Increase radius by this amount.
     */
    public void inflate(double amount)
    {
        radius += amount;
    }

    /**
     * Get the volume.
     * @return Volume in radius unit squared.
     */
    public double getVolume()
    {
        // According to google, volume of a sphere is
        // (4/3)πr^3
        return (4d / 3d) * Math.PI * (radius * radius * radius);
    }

    // It didn't say I have to create a tester for this.
    // But I already tested anyways.
}
