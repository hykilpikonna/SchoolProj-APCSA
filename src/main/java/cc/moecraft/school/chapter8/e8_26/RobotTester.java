package cc.moecraft.school.chapter8.e8_26;

import java.awt.*;

/**
 * This class tests the methods of class {@code Robot}.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-01-31 15:16
 */
public class RobotTester
{
    public static void main(String[] args)
    {
        // Create a robot instance.
        Robot myBot = new Robot();

        // Print initial value
        System.out.printf("Location: %s, Expected: (0, 0)\n",
                pointToString(myBot.getLocation()));
        System.out.printf("Direction: %s, Expected: N\n", myBot.getDirection());
        System.out.println();

        // Move
        myBot.move();
        myBot.move();

        System.out.println("Moved 2");
        System.out.printf("Location: %s, Expected: (0, 2)\n",
                pointToString(myBot.getLocation()));
        System.out.println();

        // Turn and move
        myBot.turnLeft();
        myBot.move();
        myBot.move();

        System.out.println("Turned left and moved 2");
        System.out.printf("Location: %s, Expected: (-2, 2)\n",
                pointToString(myBot.getLocation()));
        System.out.printf("Direction: %s, Expected: W\n", myBot.getDirection());
    }

    /**
     * Convert a point object to a string representing the coordinate pair.
     *
     * @param point Point object
     * @return Coordinate pair
     */
    private static String pointToString(Point point)
    {
        return String.format("(%s, %s)", point.x, point.y);
    }
}
