/*
* Connor Furby
* 9/22/2022
* Triangle Program
* Tests if triangle is scalene, right, isosceles, or equilateral, given angles or sides
*/

import java.util.Scanner;

public class triangleProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //lets user choose between sides and angles
        System.out.print("Would you like to input sides or angles?\n");
        System.out.print("(input 's' for sides or 'a' for angles): ");
        String choice = new String(keyboard.nextLine());
        
        //checks if user chose sides
        if (choice.compareTo("s") == 0)
        {
            double side1, side2, side3;
            System.out.print("Input side lengths with a space following each one: ");
            side1 = keyboard.nextDouble();
            side2 = keyboard.nextDouble();
            side3 = keyboard.nextDouble();
            //checks to see if triangle is valid
            if (((side1 + side2) <= side3) || ((side2 + side3) <= side1) || ((side1 + side3) <= side2) || (side1 <= 0) || (side2 <= 0) || (side3 <= 0))
                System.out.print("This is not a valid triangle");
            //rest sees what type of triangle it is
            else if (side1 == side2 && side2 == side3)
                System.out.print("This is an equilateral triangle");
            else if (side1 == side2 || side2 == side3 || side1 == side3)
                System.out.print("This is an isosceles triangle");
            else
                System.out.print("This is a scalene triangle");
        }
        
        //checks if user chose angles
        else if (choice.compareTo("a") == 0)
        {
            double angle1, angle2, angle3;
            System.out.print("Input angle measures with a space following each one: ");
            angle1 = keyboard.nextDouble();
            angle2 = keyboard.nextDouble();
            angle3 = keyboard.nextDouble();
            //checks to see if triangle is valid
            if (((angle1 + angle2 + angle3) != 180) || (angle1 <= 0) || (angle2 <= 0) || (angle3 <= 0))
                System.out.print("This is not a valid triangle");
            else if (angle1 == 90 || angle2 == 90 || angle3 == 90)
            {
                System.out.print("This is a right triangle");
                //in this case it can be right and isoceles if 45 45 90
                if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3)
                    System.out.print("\nThis is also an isosceles triangle");
            }
            else if (angle1 == angle2 && angle2 == angle3)
                System.out.print("This is an equilateral triangle");
            else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3)
                System.out.print("This is an isosceles triangle");
            else
                System.out.print("This is a scalene triangle");
        }
        
        else
            //makes bulletproof if s or a isnt entered
            System.out.print("You entered an invalid choice");
    }
}