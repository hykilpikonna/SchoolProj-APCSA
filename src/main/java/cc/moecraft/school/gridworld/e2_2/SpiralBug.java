package cc.moecraft.school.gridworld.e2_2;

import info.gridworld.actor.Bug;

/**
 * The class {@code SpiralBug} is an alternative implementation of box bug
 * that runs in a spiral instead of in a square.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @version 1.0
 * @since 2019-02-08 15:23
 */
public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a spiral bug that traces a spiral starting with the
     * given side length
     *
     * @param length the side length
     */
    public SpiralBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the spiral, increase the side
     * length if it reaches the border.
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
            turn();
            steps = 0;
            sideLength ++;
        }
    }
}
