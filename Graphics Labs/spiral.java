
/**
 * Connor Furby
 * 10/27/22
 * Spiral Lab
 */
import TurtleGraphics.*;
import java.awt.*;

public class spiral
{
    public static void main(String[] args)
    {
        double x = 0, y = 0;
        StandardPen pen = new StandardPen();
        Color newColor = new Color(127, 255, 212);
        pen.setColor(newColor);
        for (int i = 1, t = 1; i <= 100; i++, t++)
        {
            if (t > 4)
                t = 1;
            if (t == 1)
            {
                x = x + i;
                y = y;
            }
            else if (t == 2)
            {
                x = x;
                y = y - i;
            }
            else if (t == 3)
            {
                x = x - i;
                y = y;
            }
            else if (t == 4)
            {
                x = x;
                y = y + i;
            }
            
            pen.move(x * 5, y * 5);
        }
    }
}
