package cc.moecraft.school.gridworld.e9_4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * A {@code BlusterCritter} looks at all of the neighbors within two
 * steps of its current location. (For a {@code BlusterCritter} not near
 * an edge, this includes 24 locations). It counts the number of critters
 * in those locations. If there are fewer than {@code c} critters, its
 * color gets brighter (color values increase). If there are {@code c} or
 * more critters, its color darkens (color value decrease). Here,
 * {@code c} is a value that indicates the courage of the critter. It
 * should be set in the constructor.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-06 13:32
 */
public class BlusterCritter extends Critter
{
    /**
     * The color value added to the color when brightening or darkening.
     */
    private static final int COLOR_CHANGE_FACTOR = 20;

    /**
     * The courage value of this critter.
     */
    private int courage;

    /**
     * Construct a {@code BlusterCritter} with a specific courage value.
     * Also initializes the color to GRAY for identification from other
     * regular critters.
     *
     * @param courage The courage of this critter.
     */
    public BlusterCritter(int courage)
    {
        this.courage = courage;
        setColor(Color.GRAY);
    }

    /**
     * If there are fewer critters than the courage value, its color gets
     * brighter. If there are the same amount or more critters than the
     * courage value, its color darkens.
     *
     * @param actors The list of actors to process.
     */
    @Override
    public void processActors(ArrayList<Actor> actors)
    {
        // Count the critters in the actors.
        int count = 0;
        for (Actor actor : actors)
        {
            if (actor instanceof Critter)
            {
                count ++;
            }
        }

        // Check the relationship between the count and the courage.
        // 1 if need to be brighten, -1 if need to be darken.
        brighten(count < courage ? 1 : -1);
    }

    /**
     * Make the color of this brighter.
     * <p>
     * This is implemented with a relative increment instead of a ratio
     * because in the instructions it said "color value increases" or
     * "color value decreases" but not something like "color value
     * increases like flower" or "color value increases with a ratio".
     *
     * @param multiplier Multiplier of the color change factor value.
     *                  (set to negative to darken.)
     */
    public void brighten(int multiplier)
    {
        Color color = getColor();
        int factor = COLOR_CHANGE_FACTOR * multiplier;

        // Math.min and Math.max is used because else it would go out of
        // range from 0 to 255.
        int r = max(min(color.getRed() + factor, 255), 0);
        int g = max(min(color.getGreen() + factor, 255), 0);
        int b = max(min(color.getBlue() + factor, 255), 0);

        setColor(new Color(r, g, b));
    }

    /**
     * Select all critters in its relative locations two steps from its
     * current location.
     *
     * @return The list of critters.
     */
    @Override
    public ArrayList<Actor> getActors()
    {
        ArrayList<Actor> critters = new ArrayList<>();
        Grid<Actor> grid = getGrid();

        for (Location loc : getPossibleLocations())
        {
            // Special cases where location is invalid.
            if (!grid.isValid(loc))
            {
                continue;
            }

            // Get the actor at this location.
            Actor actor = grid.get(loc);

            // Detect if the actor is not null.
            if (actor instanceof Critter)
            {
                critters.add(actor);
            }
        }

        return critters;
    }

    /**
     * Generate a list of 24 possible locations relative to the current
     * location. The generated locations are all within 2 steps of its
     * current locations, but they does not need to be valid on the grid.
     *
     * @return 24 possible locations relative to the current location.
     */
    public ArrayList<Location> getPossibleLocations()
    {
        ArrayList<Location> locations = new ArrayList<>();

        // Get the current location's x and y.
        final int curX = getLocation().getRow();
        final int curY = getLocation().getCol();

        // Loop through all the relative x and y values within 2 steps.
        for (int x = -2; x <= 2; x++)
        {
            for (int y = -2; y <= 2; y++)
            {
                // Ignore the current location.
                if (x == 0 && y == 0)
                {
                    continue;
                }

                // Get this target location incremented with the x and y.
                Location target = new Location(curX + x, curY + y);

                // Add the target location to the list.
                locations.add(target);
            }
        }

        return locations;
    }
}

