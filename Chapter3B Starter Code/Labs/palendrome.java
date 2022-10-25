package Labs;
/**
 * Connor Furby
 * 10/24/22
 * Palendrome Lab
 */

import java.util.Scanner;
import java.lang.Character;
public class palendrome
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter in a string: ");
        String inp = new String(keyboard.nextLine());
        int strlen = inp.length();
        int charct = 0;
        boolean palendrome = true;
        for (int currlast = strlen - 1, currfirst = 0; currlast >= 0 && palendrome == true; currlast--, currfirst++)
        {
            char currlastchar = inp.charAt(currlast);
            char currfirstchar = inp.charAt(currfirst);
            while (currlastchar == ' ')
            {
                currlast = currlast - 1;
                currlastchar = inp.charAt(currlast);
            }
            while (currfirstchar == ' ')
            {
                currfirst = currfirst + 1;
                currfirstchar = inp.charAt(currfirst);
            }
            if (Character.toUpperCase(currlastchar) == Character.toUpperCase(currfirstchar))
                palendrome = true;
            else
            {
                palendrome = false;
                System.out.println("This is not a palendrome");
            }
        }
        if (palendrome == true)
            System.out.println("This is a palendrome");
    }
}
