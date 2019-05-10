package cc.moecraft.school.gridworld.e9_4;

import cc.moecraft.school.gridworld.TestActor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.*;

/**
 * The class {@code BlusterCritterRunner} is the tester for the class
 * {@code BlusterCritter}.
 *
 * @author YGui (https://github.com/hykilpikonna)
 * @since 2019-03-06 15:21
 */
public class BlusterCritterRunner
{
    public static void main(String[] args)
    {
        testCase0();
        testCase1();
        testDetectionRange();
    }

    /**
     * Case 0: World with the exact amount of other critters around this
     *         critter to darken it.
     */
    public static void testCase0()
    {
        ActorWorld worldWithOtherCritters = new ActorWorld();
        worldWithOtherCritters.add(new Location(4, 4), new BlusterCritter(4));

        // TestCritter is a critter that does not move.
        worldWithOtherCritters.add(new Location(3, 3), new TestCritter(1));
        worldWithOtherCritters.add(new Location(3, 4), new Rock());
        worldWithOtherCritters.add(new Location(3, 5), new TestCritter(2));
        worldWithOtherCritters.add(new Location(4, 5), new Rock());
        worldWithOtherCritters.add(new Location(5, 5), new TestCritter(3));
        worldWithOtherCritters.add(new Location(5, 4), new Rock());
        worldWithOtherCritters.add(new Location(5, 3), new TestCritter(4));
        worldWithOtherCritters.add(new Location(4, 3), new Rock());
        worldWithOtherCritters.show();
    }

    /**
     * Case 1: World with exactly 1 less critter around it.
     */
    public static void testCase1()
    {
        ActorWorld worldWithOtherCritters = new ActorWorld();
        worldWithOtherCritters.add(new Location(4, 4), new BlusterCritter(4));

        // TestActor is a shade.
        worldWithOtherCritters.add(new Location(3, 3), new TestActor());
        worldWithOtherCritters.add(new Location(3, 4), new Rock());
        worldWithOtherCritters.add(new Location(3, 5), new TestCritter());
        worldWithOtherCritters.add(new Location(4, 5), new Rock());
        worldWithOtherCritters.add(new Location(5, 5), new TestCritter());
        worldWithOtherCritters.add(new Location(5, 4), new Rock());
        worldWithOtherCritters.add(new Location(5, 3), new TestCritter());
        worldWithOtherCritters.add(new Location(4, 3), new Rock());
        worldWithOtherCritters.show();
    }

    /**
     * Test detection range for getPossibleLocations()
     */
    public static void testDetectionRange()
    {
        ActorWorld worldWithoutOtherCritters = new ActorWorld();
        BlusterCritter critter = new BlusterCritter(2);
        worldWithoutOtherCritters.add(new Location(4, 4), critter);
        worldWithoutOtherCritters.show();

        // Visually show it's range.
        for (Location loc : critter.getPossibleLocations())
        {
            if (critter.getGrid().isValid(loc))
            {
                critter.getGrid().put(loc, new TestActor(Color.PINK));
            }
        }
    }
}
