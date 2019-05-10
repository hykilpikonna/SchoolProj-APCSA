package cc.moecraft.school.gridworld.e2_2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

/**
 * Tester class for the class {@code SpiralBug}.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @version 1.0
 * @since 2019-02-08 14:57
 */
public class SpiralBugTester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new UnboundedGrid<>());
        SpiralBug bob = new SpiralBug(2);
        world.add(new Location(10, 10), bob);
        world.show();
    }
}
