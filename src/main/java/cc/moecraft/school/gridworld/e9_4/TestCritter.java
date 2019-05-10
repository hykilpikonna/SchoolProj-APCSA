package cc.moecraft.school.gridworld.e9_4;

import info.gridworld.actor.Critter;

import java.awt.*;

/**
 * A {@code TestCritter} does not act.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-03-14 09:48
 */
public class TestCritter extends Critter
{
    String id;

    /**
     * Initialize color.
     */
    public TestCritter()
    {
        this(null);
    }

    public TestCritter(Object id)
    {
        if (id == null) this.id = null;
        else this.id = id.toString();
        setColor(Color.YELLOW);
    }

    @Override
    public void act()
    {
        // Does nothing but print id: for priority testing.
        if (id != null)
        {
            System.out.println("TestCritter With ID Executed: " + id);
        }
    }
}
