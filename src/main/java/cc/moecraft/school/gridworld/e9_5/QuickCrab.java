package cc.moecraft.school.gridworld.e9_5;

import info.gridworld.actor.CrabCritter;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

import static info.gridworld.grid.Location.LEFT;
import static info.gridworld.grid.Location.RIGHT;

/**
 * A {@code QuickCrab} processes actors the same way {@code CrabCritter}
 * does. It moves to one of the two locations, randomly selected, that
 * are two spaces to its right or left, if that location and the
 * intervening location are both empty. Otherwise, it moves like a
 * {@code CrabCritter}.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-12 13:47
 */
public class QuickCrab extends CrabCritter
{
    /**
     * Construct a quick crab. Set color to distinguish from normal crab.
     */
    public QuickCrab()
    {
        super();
        setColor(Color.PINK);
    }

    /**
     * A {@code QuickCrab} selects the locations two spaces to its right
     * or left, if that location and the intervening location are both
     * empty. Otherwise, it selects the locations like a
     * {@code CrabCritter}.
     *
     * @return The list of move locations to select.
     */
    @Override
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> locations = new ArrayList<>();

        // Validate left and right.
        Location left = validateMoveDirection(LEFT);
        if (left != null)
        {
            locations.add(left);
        }

        Location right = validateMoveDirection(RIGHT);
        if (right != null)
        {
            locations.add(right);
        }

        // Return the list of selected locations if any one of them is
        // valid, else "moves like a CrabCritter".
        return locations.isEmpty() ? super.getMoveLocations() : locations;
    }

    /**
     * Determine if a moving direction is valid: a moving direction is
     * valid when the box in front of it is valid on the grid, and the
     * box two cells in front of it is also valid on the grid, and they
     * are both empty.
     * <p>
     * Returns the location 2 cells away if valid, else return null.
     *
     * @param direction Direction to validate.
     * @return Location 2 cells away if valid, null if invalid.
     */
    private Location validateMoveDirection(int direction)
    {
        // Relative direction to absolute direction.
        int absDir = getDirection() + direction;

        // Get the adjacent locations 1 cell and 2 cells away.
        Location adjLoc1 = getLocation().getAdjacentLocation(absDir);
        Location adjLoc2 = adjLoc1.getAdjacentLocation(absDir);

        // Verify if location is valid on the grid.
        // If loc 2 cells away is valid, the loc 1 cell away also valid.
        if (!getGrid().isValid(adjLoc2))
        {
            return null;
        }

        // Verify if there are no actors in their place.
        if (getGrid().get(adjLoc1) != null ||
                getGrid().get(adjLoc2) != null)
        {
            return null;
        }

        // Return the location 2 cells away because that's where the
        // quick crab critter would move to.
        return adjLoc2;
    }
}
