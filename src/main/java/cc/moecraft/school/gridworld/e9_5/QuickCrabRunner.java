package cc.moecraft.school.gridworld.e9_5;

import cc.moecraft.school.gridworld.TestActor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import javax.swing.*;
import java.lang.reflect.Field;

/**
 * The class {@code QuickCrabRunner} is the tester class for
 * {@code QuickCrab}.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-12 14:18
 */
public class QuickCrabRunner
{
    public static void main(String[] args)
    {
        // Run cases
        testCase0();
        testCase1();
        testCase8();
        testCase9();
        testCase16();
    }

    /**
     * Case 0: Empty world, the crab gets to move everywhere it wants.
     */
    public static void testCase0()
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new QuickCrab());
        world.show();
        setTitle(world, "Quick Crab Tester: Case 0 [GridWorld]");
    }

    /**
     * Case 1: Empty world, the crab gets to move everywhere it wants...
     *         Except that it also has to eat stuff.
     */
    public static void testCase1()
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new QuickCrab());

        for (int i = 0; i < 10; i++)
        {
            world.add(new Location(3, i), new TestActor());
        }
        world.show();
        setTitle(world, "Quick Crab Tester: Case 1 [GridWorld]");
    }

    /**
     * Case 8: The crab are blocked, no space to move 2 cells at once.
     */
    public static void testCase8()
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new QuickCrab());

        world.add(new Location(4, 3), new Rock());
        world.add(new Location(4, 6), new Rock());
        world.show();
        setTitle(world, "Quick Crab Tester: Case 8 [GridWorld]");
    }

    /**
     * Case 8: The crab are blocked, no space to move 2 cells at once...
     *         Except that it would have space after one move.
     */
    public static void testCase9()
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new QuickCrab());

        world.add(new Location(4, 2), new Rock());
        world.add(new Location(4, 6), new Rock());
        world.show();
        setTitle(world, "Quick Crab Tester: Case 9 [GridWorld]");
    }

    /**
     * Case 16: No place to move anywhere, has to turn.
     */
    public static void testCase16()
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new QuickCrab());

        world.add(new Location(4, 3), new Rock());
        world.add(new Location(4, 5), new Rock());
        world.show();
        setTitle(world, "Quick Crab Tester: Case 16 [GridWorld]");
    }

    /**
     * Set the title of the JFrame of the GUI of a world using reflection
     *
     * @param world World.
     * @param title Title.
     */
    private static void setTitle(World world, String title)
    {
        try
        {
            // Get the frame field from the class.
            Field frameField = World.class.getDeclaredField("frame");

            // Hack the "private" tag.
            frameField.setAccessible(true);

            // Get the actual frame object from the world object.
            JFrame frame = (JFrame) frameField.get(world);

            // Set the title.
            frame.setTitle(title);
        }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            // This would never happen unless the GridWorld API is
            // changed somehow in the future.
            e.printStackTrace();
        }
    }
}
