package cc.moecraft.school.chapter3.counter;

public class Counter
{
    private int value;

    /**
     * Click once
     */
    public void click()
    {
        value ++;
    }

    /**
     * Reset to 0
     */
    public void reset()
    {
        value = 0;
    }

    /**
     * Undo one step
     */
    public void undo()
    {
        value = Math.max(value - 1, 0);
    }

    @Override
    public String toString()
    {
        return String.valueOf(getValue());
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
}
