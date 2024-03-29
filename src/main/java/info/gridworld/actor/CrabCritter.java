package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

/**
 * A {@code CrabCritter} looks at a limited set of neighbors when it eats
 * and moves. This class is not tested on the AP CS A and AB Exams.
 *
 * @author Gridworld Student Manual
 */
public class CrabCritter extends Critter
{
    public CrabCritter()
    {
        setColor(Color.RED);
    }

    /**
     * A crab gets the actors in the three locations immediately in front,
     * to its front-right and to its front-left.
     *
     * @return a list of actors occupying these locations
     */
    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> actors = new ArrayList<>();
        int[] dirs = {Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT};
        for (Location loc : getLocationsInDirections(dirs))
        {
            Actor a = getGrid().get(loc);
            if (a != null)
            {
                actors.add(a);
            }
        }

        return actors;
    }

    /**
     * @return list of empty locations immediately to the right and to the
     *         left.
     */
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locs = new ArrayList<>();
        int[] dirs = {Location.LEFT, Location.RIGHT};
        for (Location loc : getLocationsInDirections(dirs))
        {
            if (getGrid().get(loc) == null)
            {
                locs.add(loc);
            }
        }

        return locs;
    }

    /**
     * If the crab critter doesn't move, it randomly turns left or right.
     */
    public void makeMove(Location loc)
    {
        if (loc.equals(getLocation()))
        {
            double r = Math.random();
            int angle;
            if (r < 0.5)
            {
                angle = Location.LEFT;
            }
            else
            {
                angle = Location.RIGHT;
            }
            setDirection(getDirection() + angle);
        }
        else
        {
            super.makeMove(loc);
        }
    }

    /**
     * Finds the valid adjacent locations of this critter in different
     * directions.
     *
     * @param directions An array of directions (which are relative to the
     *                   current direction)
     * @return a set of valid locations that are neighbors of the current
     *         location in the given directions
     */
    public ArrayList<Location> getLocationsInDirections(int[] directions)
    {
        ArrayList<Location> locs = new ArrayList<>();
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();

        for (int d : directions)
        {
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (gr.isValid(neighborLoc))
            {
                locs.add(neighborLoc);
            }
        }
        return locs;
    }
}
