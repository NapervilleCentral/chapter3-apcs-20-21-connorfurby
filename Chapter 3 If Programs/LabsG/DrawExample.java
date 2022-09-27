package LabsG;
import TurtleGraphics.StandardPen;
import java.awt.*;

/**
 * Write a description of class DrawExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class DrawExample
{
    public static void main(String[] args)
    {
        StandardPen pen = new StandardPen();
        
        pen.up();
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.down();
        
        pen.move(100);
        
        pen.setColor(Color.green);
        
        pen.turn(45);
        pen.move(50);
        
    }
}
