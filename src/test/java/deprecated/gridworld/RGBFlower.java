package deprecated.gridworld;

import info.gridworld.actor.Flower;

import java.awt.*;

/**
 * Class created by Hykilpikonna on 2019-02-08 at 08:57!
 *
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @since 2019-02-08 08:57
 */
public class RGBFlower extends Flower
{
    public static int INCR = 10;

    private int r;
    private int g;
    private int b;
    private int mode = 0;
    private int ignoredTime = 0;

    public RGBFlower(int ignoredTime)
    {
        super(Color.BLUE);
        this.ignoredTime = ignoredTime;
        r = getColor().getRed();
        g = getColor().getGreen();
        b = getColor().getBlue();
    }

    @Override
    public void act()
    {
        if (ignoredTime != 0)
        {
            ignoredTime --;
            return;
        }

        switch (mode)
        {
            case 0:
            {
                if (g > 1) g = Math.max(0, g - INCR);
                if (r < 254) r = Math.min(255, r + INCR);
                else mode = 1;

                break;
            }
            case 1:
            {
                if (b > 1) b = Math.max(0, b - INCR);
                if (g < 254) g = Math.min(255, g + INCR);
                else mode = 2;

                break;
            }
            case 2:
            {
                if (r > 1) r = Math.max(0, r - INCR);
                if (b < 254) b = Math.min(255, b + INCR);
                else mode = 0;

                break;
            }
        }

        setColor(new Color(r, g, b));
    }
}
