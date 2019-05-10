package cc.moecraft.school.gridworld;

import info.gridworld.actor.Actor;

import java.awt.*;

/**
 * Simple actor for testing purpose.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-03-11 11:22
 */
public class TestActor extends Actor
{
    public TestActor()
    {
        // Does nothing
    }

    public TestActor(Color color)
    {
        setColor(color);
    }

    @Override
    public void act()
    {
        // Does nothing
    }
}
