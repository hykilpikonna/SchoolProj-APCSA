package cc.moecraft.school.chapter3.circuit;

/**
 * Hallway Circuit Controller in E3.5
 */
public class Circuit5
{
    private boolean[] switches = new boolean[2];

    /**
     * Convert a boolean to an int
     * IDK why the book uses int...
     * But it uses, so whatever, I'll just convert it
     *
     * @param bool boolean value
     * @return int value of the boolean
     */
    private int toInt(boolean bool)
    {
        return bool ? 1 : 0;
    }

    /**
     * Get the state of an indexed switch in boolean
     * This is private because it's not part of the class in the book.
     *
     * @param switchIndex Index of the switch, 1 or 2
     * @return the state of the switch.
     */
    private boolean getRawState(int switchIndex)
    {
        switchIndex --; // Since it's 1 or 2, not 0 or 1, it has to -1
        return switches[switchIndex];
    }

    /**
     * Get the state of an indexed switch in int
     * @param switchIndex Index of the switch, 1 or 2
     * @return the state of the switch but in INT....
     */
    public int getSwitchState(int switchIndex)
    {
        return toInt(getRawState(switchIndex));
    }

    /**
     * Get the state of the lamp
     * @return the state of the lamp but in INT....
     */
    public int getLampState()
    {
        // or = true ; and = false ; So it's just a xor!
        return toInt(getRawState(1) ^ getRawState(2));
    }

    /**
     * Toggle the state of an indexed switch
     * @param switchIndex Index of the switch, 1 or 2
     */
    public void toggleSwitch(int switchIndex)
    {
        switchIndex --; // Since it's 1 or 2, not 0 or 1, it has to -1
        switches[switchIndex] = !switches[switchIndex];
    }

    public String toString()
    {
        return "Circuit5(switches=" + java.util.Arrays.toString(this.switches) + ")";
    }
}
