package cc.moecraft.school.chapter3.counter;

public class CounterTester
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();
        System.out.println("New instance:");
        System.out.println(tally);

        // Click once
        tally.click();
        System.out.println("Click once:");
        System.out.println(tally);

        // Undo it
        tally.undo();
        System.out.println("Undo it:");
        System.out.println(tally);

        // Click 30 times and 1 each time
        for (int i = 0; i < 30; i++) tally.click();
        System.out.println("Click 30 times:");
        System.out.println(tally);

        // Undo twice
        tally.undo();
        tally.undo();
        System.out.println("Undo twice:");
        System.out.println(tally);

        // Reset it
        tally.reset();
        System.out.println("Reset:");
        System.out.println(tally);

        // Undo nothing
        tally.undo();
        System.out.println("Undo nothing:");
        System.out.println(tally);
    }
}
