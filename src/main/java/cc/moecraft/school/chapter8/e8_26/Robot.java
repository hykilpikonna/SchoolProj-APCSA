package cc.moecraft.school.chapter8.e8_26;

import java.awt.Point;

/**
 * The class {@code Robot} simulates a robot wandering on an infinite plane.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-01-30 16:27
 */
public class Robot
{
    // Use index to represent the direction.
    // This way I don't have to use a lot of if or switch
    // statements to process strings directly.
    private static final String[] DIRECTION_NAMES = {"N", "E", "S", "W"};
    private static final int[] DIRECTION_MOVES_X = {0, 1,  0, -1};
    private static final int[] DIRECTION_MOVES_Y = {1, 0, -1,  0};

    private Point location;
    private int directionCode;

    /**
     * Construct a robot simulator with a default point of 0, 0 and a direction
     * code representing North.
     */
    public Robot()
    {
        location = new Point();
        directionCode = 0;
    }

    /**
     * Turns right. For example, if it is currently facing North, by calling
     * this method would make it facing East.
     */
    public void turnRight()
    {
        directionCode++;
        if (directionCode == 4) directionCode = 0;
    }

    /**
     * Turns left. For example, if it is currently facing West, by calling
     * this method would make it facing East.
     */
    public void turnLeft()
    {
        directionCode--;
        if (directionCode == -1) directionCode = 3;
    }

    /**
     * Move 1 integer value toward the direction that this robot is facing.
     */
    public void move()
    {
        location.translate(DIRECTION_MOVES_X[directionCode], DIRECTION_MOVES_Y[directionCode]);
    }

    /**
     * Get the current location of the robot on the 2D plane.
     *
     * @return A 2D point containing X and Y coordinates.
     */
    public Point getLocation()
    {
        return location;
    }

    /**
     * Get the name of the robot's facing direction. The name could be "N",
     * "E", "S", or "W", representing north, east, south, and west.
     *
     * @return The name of the robot's facing direction.
     */
    public String getDirection()
    {
        return DIRECTION_NAMES[directionCode];
    }
}
