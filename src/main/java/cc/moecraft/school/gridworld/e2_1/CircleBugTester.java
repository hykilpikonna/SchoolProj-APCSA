package cc.moecraft.school.gridworld.e2_1;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Tester class for the class {@code CircleBug}.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-02-08 14:57
 */
public class CircleBugTester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<>(9, 9));
        CircleBug bob = new CircleBug(2);
        world.add(new Location(5, 1), bob);
        world.show();
    }
}
