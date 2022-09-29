/*
 * Connor Furby
 * 9/22/2022
 * Grades Program
 * Translates Letter Grade into a Number
 */

import java.util.Scanner;

public class gradesProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input your letter grade: ");
        String letgrade = new String(keyboard.nextLine());
        char letter, extra;
        double numgrade = 0, valid = 1;
        //seperates input from letter and extra + or - charachter
        letter = letgrade.charAt(0);
        //switch statement checks for the value of just the letter first
        switch(letter)
        {
            case 'A':
                numgrade = 4.0;
                break;
            case 'B':
                numgrade = 3.0;
                break;
            case 'C':
                numgrade = 2.0;
                break;
            case 'D':
                numgrade = 1.0;
                break;
            case 'F':
                numgrade = 0;
                break;
            default:
                System.out.print("Not a Valid Input");
                //makes the next part not run (short circuits program)
                valid = 0;
        }
        //makes sure that there is a plus or minus in the grade
        if (letgrade.length() == 2 && valid != 0)
        {
            //gets just the + or - part of grade
            extra = letgrade.charAt(1);
            switch(extra)
            {
                case '+':
                    if (letter != 'A' && letter != 'F')
                        numgrade += 0.03;
                    else if (letter == 'F')
                    {
                        valid = 0;
                        System.out.print("Not a Valid Input");
                    }
                    break;
                case '-':
                    if (letter != 'F')
                        numgrade -= 0.03;
                    else
                    {
                        valid = 0;
                        System.out.print("Not a Valid Input");
                    }
                    break;
                default:
                    System.out.print("Not a Valid Input");
                    //short circuits if invalid
                    valid = 0;
            }
        }
        if (valid == 1)
        //prints the total grade value 
            System.out.print(numgrade + " is your numeric grade");
    }
}