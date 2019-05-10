package cc.moecraft.school.chapter3.circuit;

public class Circuit3Tester
{
    public static void main(String[] args)
    {
        Circuit3 switchManager = new Circuit3();
        System.out.println("New Instance:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());

        switchManager.toggleFirstSwitch();
        System.out.println("\nToggle First:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());

        switchManager.toggleSecondSwitch();
        System.out.println("\nToggle Second:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());

        switchManager.toggleFirstSwitch();
        System.out.println("\nToggle First:");
        System.out.println(switchManager);
        System.out.println("Lamp: " + switchManager.getLampState());
    }
}
