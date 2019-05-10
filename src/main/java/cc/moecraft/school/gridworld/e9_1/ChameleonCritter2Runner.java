package cc.moecraft.school.gridworld.e9_1;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * The class {@code ChameleonCritter2Runner} is the tester class for
 * {@code ChameleonCritter2}.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-03-05 16:15
 */
public class ChameleonCritter2Runner
{
    public static void main(String[] args)
    {
        // Create a world.
        ActorWorld world = new ActorWorld();

        // Add the critter in.
        world.add(new Location(2, 4), new ChameleonCritter2());

        // Show the world.
        world.show();
    }
}
