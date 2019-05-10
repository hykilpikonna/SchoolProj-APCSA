package info.gridworld.actor;

import info.gridworld.grid.Location;

import java.util.ArrayList;

/**
 * A {@code ChameleonCritter} takes on the color of neighboring
 * actors as it moves through the grid.
 * <p>
 * The implementation of this class is testable on the AP CS A and AB exams.
 *
 * @author Gridworld Student Manual
 */
public class ChameleonCritter extends Critter
{
    /**
     * Randomly selects a neighbor and changes this critter's color to be
     * the same as that neighbor's.
     * <p>
     * If there are no neighbors, no action is taken.
     */
    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0)
        {
            return;
        }

        int r = (int) (Math.random() * n);
        Actor other = actors.get(r);
        setColor(other.getColor());
    }

    /**
     * Turns towards the new location as it moves.
     */
    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
