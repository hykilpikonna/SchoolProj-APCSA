import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

/**
 * The class {@code JumperRunner} is the tester for {@code Jumper}.
 *
 * @author Hykilpikonna (Jack) (https://github.com/hykilpikonna)
 * @author Steve Rosario
 * @author Kyle Lopez
 *
 * @since 2019-02-27 16:39
 */
public class JumperRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        // Create a jumper.
        Jumper bob = new Jumper();

        // Add the jumper in.
        world.add(new Location(4, 0), bob);

        // Shows that it jumps over rocks and flowers.
        world.add(new Location(1, 0), new Rock());
        world.add(new Location(3, 0), new Flower());

        // Shows that it does not override actors like flowers and
        // other jumpers.
        world.add(new Location(0, 8), new Flower());

        // Shows that it does not jump over other actors.
        world.add(new Location(7, 8), new Actor());

        // Display the world.
        world.show();
    }
}
