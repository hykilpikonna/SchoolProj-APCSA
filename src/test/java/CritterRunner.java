import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.CrabCritter;
import info.gridworld.grid.Location;

/**
 * Class created by Hykilpikonna on 2019-03-01 at 16:37!
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-03-01 16:37
 */
public class CritterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CrabCritter crabCritter = new CrabCritter();
        crabCritter.setDirection(Location.SOUTH);
        world.add(new Location(3, 4), crabCritter);
        world.show();
    }
}
