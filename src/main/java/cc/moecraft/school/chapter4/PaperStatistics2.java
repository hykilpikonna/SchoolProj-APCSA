package cc.moecraft.school.chapter4;

/**
 * E4.2
 *
 * @author Ticrizon
 */
public class PaperStatistics2
{
    // The length of a letter size sheet in Inch
    private static final double LENGTH_IN_INCH = 8.5;
    private static final double HEIGHT_IN_INCH = 11;
    private static final double MM_PER_INCH = 25.4;

    public static void main(String[] args)
    {
        // Convert it to mm.
        double lengthInMm = LENGTH_IN_INCH * MM_PER_INCH;
        double heightInMm = HEIGHT_IN_INCH * MM_PER_INCH;

        // E4.2: Print perimeter
        System.out.println("Expected: 990.6");
        System.out.println("Actual: " + ((heightInMm + lengthInMm) * 2));
    }
}
