package deprecated.gridworld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

/**
 * Class created by Hykilpikonna on 2019-02-08 at 08:55!
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-02-08 08:55
 */
public class RGBGridReverse
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        Grid<Actor> grid = world.getGrid();
        int rLen = grid.getNumRows();
        int cLen = grid.getNumCols();
        for (int r = 0; r < rLen; r++)
        {
            for (int c = 0; c < cLen; c++)
            {
                world.add(new Location(r, c), new RGBFlower((rLen - r + c) * 8));
            }
        }
        world.show();
    }
}
