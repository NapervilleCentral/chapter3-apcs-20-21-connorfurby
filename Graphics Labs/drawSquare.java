
/**
 * Connor Furby
 * 10/24/22
 * Draw Square Class
 */

import TurtleGraphics.StandardPen;
import TurtleGraphics.*; //import all classes upon use
import java.awt.*;

public class drawSquare
{
    public static void main(String[] args)
    {
        StandardPen pen = new StandardPen();
        
        pen.move(100);
        pen.setColor(Color.red);
        pen.turn(90);
        pen.move(100);
        pen.setColor(Color.green);
        pen.turn(90);
        pen.move(100);
        Color newColor = new Color(127, 255, 212);
        pen.setColor(newColor);
        pen.turn(90);
        pen.move(100);
        
    }
}
