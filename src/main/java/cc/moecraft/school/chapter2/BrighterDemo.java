package cc.moecraft.school.chapter2;

import java.awt.*;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        Color color = new Color(50,  100, 150).brighter();

        System.out.println(String.format("%s, %s, %s", color.getRed(), color.getGreen(), color.getBlue()));

        // Now, it says "you won't actually see the color"
        // But you actually can with ANSI color code in ANSI supported terminal environments...
        System.out.println(String.format("\033[38;2;%s;%s;%smSEE THE COLORS!!!!!!",
                color.getRed(), color.getGreen(), color.getBlue()));
    }
}