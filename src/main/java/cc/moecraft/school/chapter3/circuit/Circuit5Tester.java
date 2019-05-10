package cc.moecraft.school.chapter3.circuit;

public class Circuit5Tester
{
    public static void main(String[] args)
    {
        Circuit5 switchManager = new Circuit5();
        System.out.println("New Instance:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());

        switchManager.toggleSwitch(1);
        System.out.println("\nToggle First:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());

        switchManager.toggleSwitch(2);
        System.out.println("\nToggle Second:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());

        switchManager.toggleSwitch(1);
        System.out.println("\nToggle First:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());

        System.out.println("\nTrying to toggle a switch doesn't exist (3):");

        try
        {
            // Since System.out is not synced with System.err,
            // this is required for the test run to not be mixed up.
            Thread.sleep(5);
        }
        catch (InterruptedException ignored) {}

        switchManager.toggleSwitch(3);
        System.out.println("I survived an exception!");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());
    }
}
