package cc.moecraft.school.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * E4.6
 *
 * @author Ticrizon
 */
public class MeasurementConverter
{
    private static final double MILES_PER_METER = 0.000621371d;
    private static final double FEET_PER_METER = 3.28084d;
    private static final double INCHES_PER_METER = 39.3701d;

    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(in);

        // Read input
        System.out.println("Input your measurement in meters:");
        double meters = input.nextDouble();

        // Print output
        System.out.println(meters + " meters");
        System.out.println("= " + (meters * MILES_PER_METER) + " miles");
        System.out.println("= " + (meters * FEET_PER_METER) + " feet");
        System.out.println("= " + (meters * INCHES_PER_METER) + " inches");
    }
}
