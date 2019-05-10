import cc.moecraft.utils.ThreadUtils;

/**
 * Class created by Hykilpikonna on 2019-04-09 at 11:34!
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-04-09 11:34
 */
public class SleepSort
{
    private double acceleration = 1;

    private long[] unsortedList;
    private long[] sortedList;
    private int currentIndex;

    public SleepSort(long[] unsortedList)
    {
        this.unsortedList = unsortedList;
        this.sortedList = new long[unsortedList.length];
        currentIndex = 0;
        sort();
    }

    /**
     * Start sorting threads.
     */
    private void sort()
    {
        // Every entry
        for (long entry : unsortedList)
        {
            // Create a thread that runs async.
            new Thread(() ->
            {
                ThreadUtils.safeSleep((long) (entry / acceleration));
                sortedList[currentIndex] = entry;
                currentIndex ++;
                System.out.println(entry);
            }).start();
        }
    }
}
