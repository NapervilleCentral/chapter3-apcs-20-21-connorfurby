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
        System.out.print("Would you like to input sides or angles?\n");
        System.out.print("(input 's' for sides or 'a' for angles): ");
        String choice = new String(keyboard.nextLine());
        if (choice.compareTo("s") == 0)
        {
            System.out.print("Input side lengths with a space following each one: ");
            double side1, side2, side3;
            side1 = keyboard.nextDouble();
            side2 = keyboard.nextDouble();
            side3 = keyboard.nextDouble();
            if (((side1 + side2) < side3) || ((side2 + side3) < side1) || ((side1 + side3) < side2) || (side1 == 0) || (side2 == 0) || (side3 == 0))
                System.out.print("This is not a valid triangle");
            else if (side1 == side2 && side2 == side3)
                System.out.print("This is an equilateral triangle");
            else if (side1 == side2 || side2 == side3 || side1 == side3)
                System.out.print("This is an isosceles triangle");
            else
                System.out.print("This is a scalene triangle");
        }
            
    }
}