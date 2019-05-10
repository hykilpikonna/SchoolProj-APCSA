package cc.moecraft.school.gridworld.e9_1;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

/**
 * The class {@code ChameleonCritter2} is created for the assignment
 * exercise 1 in chapter 9.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-05 16:11
 */
public class ChameleonCritter2 extends Critter
{
    /**
     * The darkening factor from {@code Flower}.
     */
    private static final double DARKENING_FACTOR = 0.05;

    /**
     * Randomly selects a neighbor and changes this critter's color to be
     * the same as that neighbor's.
     * <p>
     * If there are no neighbors, its color will darken.
     */
    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0)
        {
            darken();
            return;
        }

        int r = (int) (Math.random() * n);
        Actor other = actors.get(r);
        setColor(other.getColor());
    }

    /**
     * Darken itself the same way as {@code Flower} does.
     */
    public void darken()
    {
        Color c = getColor();
        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

        setColor(new Color(red, green, blue));
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
