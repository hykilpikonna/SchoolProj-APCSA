package cc.moecraft.school.chapter2;

import javafx.scene.shape.Rectangle;

public class PerimeterTester
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(10.6d, 20.4d);

        System.out.println("Perimeter Is: " + ((rectangle.getWidth() + rectangle.getHeight()) * 2));
    }
}
