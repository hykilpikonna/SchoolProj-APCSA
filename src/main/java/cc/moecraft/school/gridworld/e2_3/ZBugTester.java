package cc.moecraft.school.gridworld.e2_3;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * Tester class for the class {@code ZBug}.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @version 1.0
 * @since 2019-02-08 14:57
 */
public class ZBugTester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        ZBug bob = new ZBug(5);
        world.add(new Location(2, 4), bob);
        world.show();
    }
}
