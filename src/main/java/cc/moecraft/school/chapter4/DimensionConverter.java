package cc.moecraft.school.chapter4;

/**
 * E4.1 & E4.2
 *
 * @author Ticrizon
 */
public class DimensionConverter
{
    // The length of a letter size sheet in Inch
    private static final double LENGTH_IN_INCH = 8.5;
    private static final double HEIGHT_IN_INCH = 11;

    public static void main(String[] args)
    {
        // Convert it to mm.
        double lengthInMm = LENGTH_IN_INCH * 25.4;
        double heightInMm = HEIGHT_IN_INCH * 25.4;

        // E4.1: Print results.
        System.out.println("Expected: 279.4 * 215.9");
        System.out.printf("Actual: %s * %s\n\n", heightInMm, lengthInMm);

        // E4.2: Print perimeter
        System.out.println("Expected: 990.6");
        System.out.println("Actual: " + ((heightInMm + lengthInMm) * 2));
    }
}
