package cc.moecraft.school.gridworld.e9_2;

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
public class ChameleonKidRunner
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

        // Add the chameleon kid in a place without detected actors.
        world.add(new Location(4, 4), new ChameleonKid());

        // Add another in a place with detected actors.
        world.add(new Location(2, 5), new ChameleonKid());
        world.add(new Location(6, 2), new ChameleonKid());

        // Show the world.
        world.show();
    }
}
