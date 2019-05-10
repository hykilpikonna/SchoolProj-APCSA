package cc.moecraft.school.gridworld.e2_3;

import info.gridworld.actor.Bug;

/**
 * The class {@code ZBug} is an alternative implementation of box bug
 * that runs in a Z shape instead of in a square, and it only run once.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @version 1.0
 * @since 2019-02-08 15:23
 */
public class ZBug extends Bug
{
    private int steps;
    private int zStep; // Representing which side of Z it is now going to.
    private int sideLength;

    /**
     * Constructs a Z bug that traces a Z letter with the given side length
     *
     * @param length the side length
     */
    public ZBug(int length)
    {
        setDirection(90);
        steps = 0;
        zStep = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the Z letter, increase the zStep if
     * it reaches the border.
     */
    public void act()
    {
        if (zStep > 2) return;

        if (steps < sideLength)
        {
            // Stop if can't move.
            if (!canMove())
            {
                zStep = 3;
                return;
            }
            move();
            steps++;
        }
        else
        {
            switch (zStep)
            {
                case 0: setDirection(225); break;
                case 1: setDirection(90); break;
            }
            steps = 0;
            zStep ++;
        }
    }
}
