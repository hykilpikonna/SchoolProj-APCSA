package cc.moecraft.school.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 * E4.5
 *
 * @author Ticrizon
 */
public class IntegerCalculations5
{
    public static void main(String[] args) throws IOException
    {
        // Initialize reader.
        // Buffered reader is a lot better in performance than Scanner.
        // This is because it doesn't take extra time parsing the input.
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        // Inputs, type must be int.
        int x, y;

        try
        {
            System.out.println("Input integer X: ");
            x = Integer.parseInt(reader.readLine());

            System.out.println("Input integer Y: ");
            y = Integer.parseInt(reader.readLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println("ERROR, ERROR! Input must be int.");
            return;
        }

        // Calculate results.
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int sum = (x + y);
        int difference = (x - y);
        int product = (x * y);
        double average = (((double) x + y) / 2d);
        int distance = (max - min);

        // Get max amount of spaces in front.
        int maxSpaces = getMaxLength(sum, difference, product, distance, max, min);
        String intFormat = "%" + maxSpaces + "d\n";
        String floatFormat = "%" + (maxSpaces + 2) + ".2f\n";

        // Print results
        System.out.printf("Sum:        " + intFormat, sum);
        System.out.printf("Difference: " + intFormat, difference);
        System.out.printf("Product:    " + intFormat, product);
        System.out.printf("Average:     " + floatFormat, average);
        System.out.printf("Distance:   " + intFormat, distance);
        System.out.printf("Maximum:    " + intFormat, max);
        System.out.printf("Minimum:    " + intFormat, min);
    }

    /**
     * Get max length of all the String value of the objects.
     *
     * @param objects Objects
     * @return Max length.
     */
    private static int getMaxLength(Object ... objects)
    {
        int maxLength = 0;

        for (Object object : objects)
            maxLength = Math.max(maxLength, object.toString().length());

        return maxLength;
    }
}
