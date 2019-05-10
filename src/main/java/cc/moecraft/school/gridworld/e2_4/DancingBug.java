package cc.moecraft.school.gridworld.e2_4;

import info.gridworld.actor.Bug;

/**
 * The class {@code DancingBug} is an alternative implementation of box bug
 * that makes a different turn before each move.
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @version 1.0
 * @since 2019-02-08 15:23
 */
public class DancingBug extends Bug
{
    private int stepIndex = 0;
    private final int[] turns;

    /**
     * Constructs a dancing bug that makes a different turn before each move.
     *
     * @param turns The turns after each move.
     */
    public DancingBug(int[] turns)
    {
        this.turns = turns;
    }

    /**
     * Turns the specified times in the value at the recorded index of the
     * array, incrementing the index, and then act like how {@code Bug} acts.
     */
    public void act()
    {
        for (int i = 0; i < turns[stepIndex]; i++) turn();
        stepIndex ++;
        if (stepIndex == turns.length) stepIndex = 0;
        super.act();
    }
}
