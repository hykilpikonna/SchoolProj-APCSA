package cc.moecraft.school.gridworld.e2_1;

import info.gridworld.actor.Bug;

/**
 * The class {@code CircleBug} is an alternative implementation of box bug
 * that runs in a circle instead of in a square.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-02-08 09:24
 */
public class CircleBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a circle bug that traces a circle of a given side length
     * @param length the side length
     */
    public CircleBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the circle.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}
