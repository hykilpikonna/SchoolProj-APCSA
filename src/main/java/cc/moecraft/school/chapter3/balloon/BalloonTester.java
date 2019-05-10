package cc.moecraft.school.chapter3.balloon;

public class BalloonTester
{
    public static void main(String[] args)
    {
        Balloon balloon = new Balloon();
        balloon.inflate(100);
        System.out.println(balloon.getVolume());
        System.out.println("Expected: 4.19E6");
    }
}
