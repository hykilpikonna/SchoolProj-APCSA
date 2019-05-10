package cc.moecraft.school.chapter3.counter;

public class LimitedCounterTester
{
    public static void main(String[] args)
    {
        // Initialize object
        LimitedCounter limitedTallyCounter = new LimitedCounter();
        System.out.println("Initialize Object: " + limitedTallyCounter);

        // Set a limit
        limitedTallyCounter.setLimit(10);
        System.out.println("Set a limit 10: " + limitedTallyCounter);

        // Click 12 times
        for (int i = 0; i < 12; i++)
        {
            limitedTallyCounter.click();
            System.out.println("Click a 1: " + limitedTallyCounter);
        }
    }
}
