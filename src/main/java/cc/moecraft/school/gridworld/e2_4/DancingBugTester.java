package cc.moecraft.school.gridworld.e2_4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

/**
 * Tester class for the class {@code ZBug}.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @version 1.0
 * @since 2019-02-08 14:57
 */
public class DancingBugTester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new UnboundedGrid<>());
        DancingBug bob = new DancingBug(new int[]{1, 1, 1, 2});
        world.add(new Location(2, 4), bob);
        world.show();
    }
}
