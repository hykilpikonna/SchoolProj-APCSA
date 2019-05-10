package cc.moecraft.school.chapter2;

import javafx.scene.shape.Rectangle;

public class Rectangles42
{
    public static void main(String[] args)
    {
        // It's not possible to construct with only the area or perimeter because
        // the w or h would be unknown, or have multiple possibilities.
        Rectangle rectangleArea42 = new Rectangle(2, 21);
        Rectangle rectanglePeri42 = new Rectangle(1, 20);

        System.out.println(String.format("The rectangle with area of 42: %s, %s", rectangleArea42.getHeight(),
                rectangleArea42.getWidth()));
        System.out.println(String.format("The rectangle with perimeter of 42: %s, %s", rectanglePeri42.getHeight(),
                rectanglePeri42.getWidth()));
    }
}
