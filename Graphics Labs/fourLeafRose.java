
/**
 * Connor Furby
 * 10/26/22
 * Four Leaf Rose Program
 */

import TurtleGraphics.*;
import java.awt.*;

public class fourLeafRose
{
    public static void main(String[] args)
    {
        double theta = 0;
        double x = 0, y = 0, radius = 0;
        StandardPen pen = new StandardPen();
        Color newColor = new Color(127, 255, 212);
        pen.setColor(newColor);
        for (int i = 1; i <= 100; i++)
        {
            theta += ((2 * Math.PI) / 100);
            radius = Math.sin(2 * theta);
            x = radius * Math.cos(theta) * 100;
            y = radius * Math.sin(theta) * 100;
            pen.move(x,y);
        }
    }
}
