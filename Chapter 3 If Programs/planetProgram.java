/*
* Connor Furby
* 9/29/2022
* Planet Program
* Tests if triangle is scalene, right, isosceles, or equilateral, given angles or sides
*/

import java.util.Scanner;

public class planetProgram
{
    public static void main(String[] args)
    {
        char choice;
        double weight;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Moon:-------- 'L'");
        System.out.println("Mercury:----- 'M'");
        System.out.println("Venus:------- 'V'");
        System.out.println("Earth:------- 'E'");
        System.out.println("Mars:-------- 'R'");
        System.out.println("Jupiter:----- 'J'");
        System.out.println("Saturn:------ 'S'");
        System.out.println("Uranus:------ 'U'");
        System.out.println("Neptune:----- 'N'");
        System.out.println("Pluto:------- 'D'");
        System.out.println("-----------------");
        System.out.print("Pick an option from the menu to test weight using the letter on the right: ");
        String strchoice = new String(keyboard.nextLine());
        choice = strchoice.charAt(0);
        System.out.print("What unit of weight do you want to use?: ");
        String unit = new String(keyboard.nextLine());
        System.out.print("How much do you weigh?: ");
        weight = keyboard.nextDouble();
        switch(choice)
        {
            case 'L':
                weight = weight * 0.167;
                System.out.print("You weigh" + weight + " " + unit + " on the Lunar surface.");
                break;
            case 'M':
                weight = weight * 0.38;
                System.out.print("You weigh" + weight + " " + unit + " on Mercury.");
                break;
            case 'V':
                weight = weight * 0.91;
                System.out.print("You weigh " + weight + " " + unit + " on Venus.");
                break;
            case 'E':
                System.out.print("You weigh " + weight + " " + unit + " on Earth. I thought we already established that!");
                break;
            case 'R':
                weight = weight * 0.38;
                System.out.print("You weigh " + weight + " " + unit + " on The Red Planet.");
                break;
            case 'J':
                weight = weight * 2.34;
                System.out.print("You weigh " + weight + " " + unit + " on Jupiter.");
                break;
            case 'S':
                weight = weight * 1.06;
                System.out.print("You weigh " + weight + " " +unit + " on Saturn.");
                break;
            case 'U':
                weight = weight * 0.92;
                System.out.print("You weigh " + weight + " " + unit + " on Uranus.");
                break;
            case 'N':
                weight = weight * 1.19;
                System.out.print("You weigh " + weight + " " + unit + " on Neptune.");
                break;
            case 'D':
                weight = weight * 0.06;
                System.out.print("You weigh " + weight + " " + unit + " on the DWARF planet Pluto.");
                break;
        }
    }
}