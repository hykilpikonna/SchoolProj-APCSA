package cc.moecraft.school.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 * E4.4
 *
 * @author Ticrizon
 */
public class IntegerCalculations4
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

        // Get max and min for less calculation so more performance.
        int max = Math.max(x, y);
        int min = Math.min(x, y);

        // Print results
        System.out.println("Sum:        " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product:    " + (x * y));
        System.out.println("Average:    " + ((x + y) / 2d));
        System.out.println("Distance:   " + (max - min));
        System.out.println("Maximum:    " + max);
        System.out.println("Minimum:    " + min);
    }
}
