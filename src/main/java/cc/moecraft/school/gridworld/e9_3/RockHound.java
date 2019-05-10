package cc.moecraft.school.gridworld.e9_3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;

import java.util.ArrayList;

/**
 * A {@code RockHound} gets the actors to be processed in the same way as
 * a {@code Critter}. It removes any rocks in that list from the grid.
 * <p>
 * A {@code RockHound} moves like a {@code Critter}.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-05 16:56
 */
public class RockHound extends Critter
{
    /**
     * Remove the rocks from the list.
     *
     * @param actors The list of actors selected.
     */
    @Override
    public void processActors(ArrayList<Actor> actors)
    {
        // Process all actors.
        for (Actor actor : actors)
        {
            // Determine if it is a rock.
            if (actor instanceof Rock)
            {
                // Remove it if it is.
                actor.removeSelfFromGrid();
            }
        }
    }
}
