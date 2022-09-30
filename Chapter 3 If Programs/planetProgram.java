/*
* Connor Furby
* 9/29/2022
* Planet Program
* User inputs their weight on Earth and their weight on other planets are returned
*/

import java.util.Scanner;

public class planetProgram
{
    public static void main(String[] args)
    {
        char choice;
        double weight;
        Scanner keyboard = new Scanner(System.in);
        
        //prints menu of planet options
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
        //converts string to char
        choice = strchoice.charAt(0);
        
        //gets inputs of weight and units
        System.out.print("What unit of weight do you want to use?: ");
        String unit = new String(keyboard.nextLine());
        System.out.print("How much do you weigh?: ");
        weight = keyboard.nextDouble();
        
        //switch statement gets planet name and updated weight
        String planet = new String("");
        int valid = 1;
        switch(choice)
        {
            case 'L':
                planet = "The Moon";
                weight = weight * 0.167;
                break;
            case 'M':
                planet = "Mercury";
                weight = weight * 0.38;
                break;
            case 'V':
                planet = "Venus";
                weight = weight * 0.91;
                break;
            case 'E':
                planet = "Earth";
                break;
            case 'R':
                planet = "Mars";
                weight = weight * 0.38;
                break;
            case 'J':
                planet = "Jupiter";
                weight = weight * 2.34;
                break;
            case 'S':
                planet = "Saturn";
                weight = weight * 1.06;
                break;
            case 'U':
                planet = "Uranus";
                weight = weight * 0.92;
                break;
            case 'N':
                planet = "Neptune";
                weight = weight * 1.19;
                break;
            case 'D':
                planet = "Pluto";
                weight = weight * 0.06;
                break;
            default:
                System.out.print("That's not a valid planet!");
                //wont print next part if valid = 0
                valid = 0;
        }
        
        //prints weight on planet
        if (valid == 1)
            System.out.print("You weigh " + weight + " " + unit + " on " + planet + "!");
        
    }
}