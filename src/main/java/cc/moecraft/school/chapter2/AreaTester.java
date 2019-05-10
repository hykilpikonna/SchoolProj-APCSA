package cc.moecraft.school.chapter2;

import javafx.scene.shape.Rectangle;

public class AreaTester
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(10.6d, 20.4d);

        double area = rectangle.getHeight() * rectangle.getWidth();

        System.out.println("Area Is: " + area);
    }
}
