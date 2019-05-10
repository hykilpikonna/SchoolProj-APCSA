package cc.moecraft.school.gridworld.e9_3;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.*;

/**
 * The class {@code ChameleonKidRunner} is the tester class for
 * {@code ChameleonKid}.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-05 16:48
 */
public class RockHoundRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        // Setup the world like the demo.
        world.add(new Location(7, 2), new Rock(Color.YELLOW));
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(1, 5), new Rock(Color.RED));
        world.add(new Location(5, 5), new Rock(Color.PINK));
        world.add(new Location(2, 8), new Rock(Color.BLUE));
        world.add(new Location(7, 8), new Rock());

        // Add the rock hound
        world.add(new Location(4, 4), new RockHound());

        // Show the world.
        world.show();
    }
}
