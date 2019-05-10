package cc.moecraft.school.chapter3.circuit;

/**
 * Hallway Circuit Controller in E3.3
 */
public class Circuit3
{
    private boolean first;
    private boolean second;

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
     * Get the state of the first switch
     * @return the state of 1st switch but in INT....
     */
    public int getFirstSwitchState()
    {
        return toInt(first);
    }

    /**
     * Get the state of the second switch
     * @return the state of second switch but in INT....
     */
    public int getSecondSwitchState()
    {
        return toInt(second);
    }

    /**
     * Get the state of the lamp
     * @return the state of the lamp but in INT....
     */
    public int getLampState()
    {
        // or = true
        // and = false
        // so it's just a xor!
        return toInt(first ^ second);
    }

    public void toggleFirstSwitch()
    {
        first = !first;
    }

    public void toggleSecondSwitch()
    {
        second = !second;
    }

    public String toString()
    {
        return "Circuit(first=" + this.first +
                ", second=" + this.second + ")";
    }
}
