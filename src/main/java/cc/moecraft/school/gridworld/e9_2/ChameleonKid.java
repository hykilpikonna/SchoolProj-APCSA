package cc.moecraft.school.gridworld.e9_2;

import cc.moecraft.school.gridworld.e9_1.ChameleonCritter2;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

/**
 * The class {@code ChameleonKid} changes its color to the color of one
 * of the actors immediately in front or behind. If there is no actor in
 * either of these locations, then it darkens like the modified
 * {@code ChameleonCritter}.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-05 16:26
 */
public class ChameleonKid extends ChameleonCritter2
{
    /**
     * Modified this method so that it only obtains the actors immediately
     * in front or behind.
     *
     * @return The actors immediately in front or behind if exists.
     */
    @Override
    public ArrayList<Actor> getActors()
    {
        return getActorsInDirections(new int[]{Location.AHEAD, Location.HALF_CIRCLE});
    }

    /**
     * Finds the valid adjacent actors of this in specified directions.
     * <p>
     * This method is originally from {@code CrabCritter}.
     *
     * @param directions Directions relative to the current direction.
     * @return Actors from given list of directions.
     */
    public ArrayList<Actor> getActorsInDirections(int[] directions)
    {
        ArrayList<Actor> actors = new ArrayList<>();
        Grid<Actor> grid = getGrid();
        Location currentLoc = getLocation();

        for (int direction : directions)
        {
            // Get and validate the neighbor location in a direction.
            Location neighborLoc =
                    currentLoc.getAdjacentLocation(getDirection() + direction);
            if (!grid.isValid(neighborLoc))
            {
                continue;
            }

            // Get and validate the actor at the location of the grid.
            Actor actor = grid.get(neighborLoc);
            if (actor == null)
            {
                continue;
            }

            // Add the actor to the list.
            actors.add(actor);
        }

        return actors;
    }
}
