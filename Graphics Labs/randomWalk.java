
/**
 * Connor Furby
 * 10/27/22
 * Random Walk Lab
 */
import TurtleGraphics.*;
import java.awt.*;
import java.util.*;

public class randomWalk
{
    public static void main(String[] args)
    {
        double x = 0, y = 0;
        int randdir = 1;
        StandardPen pen = new StandardPen();
        Color newColor = new Color(127, 255, 212);
        pen.setColor(newColor);
        Random rand = new Random();
        for (int i = 1; i <= 100; i++)
        {
            randdir = rand.nextInt(4) + 1;
            if (randdir == 1)
            {
                x = x;
                y = y + 10;
            }
            if (randdir == 2)
            {
                x = x + 10;
                y = y;
            }
            if (randdir == 3)
            {
                x = x;
                y = y - 10;
            }
            if (randdir == 4)
            {
                x = x - 10;
                y = y;
            }
            pen.move(x * 5, y * 5);
        }
    }
}