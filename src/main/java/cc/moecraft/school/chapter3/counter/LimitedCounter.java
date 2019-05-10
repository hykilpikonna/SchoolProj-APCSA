package cc.moecraft.school.chapter3.counter;

/**
 * Counter with a limit.
 */
public class LimitedCounter
{
    private int value;
    private int limit = Integer.MAX_VALUE; // default to the int max

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

    /**
     * Click once
     */
    public void click()
    {
        setValue(Math.min(getValue() + 1, limit));
    }

    public String toString()
    {
        return "LimitedCounter(value=" + this.getValue() +
                ", limit=" + this.getLimit() + ")";
    }

    // *****************
    // Getters & Setters
    // *****************

    public int getLimit()
    {
        return limit;
    }

    public void setLimit(int limit)
    {
        this.limit = limit;
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
