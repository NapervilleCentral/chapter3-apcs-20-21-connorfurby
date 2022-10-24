package Labs;
/**
 * Connor Furby
 * 10/24/22
 * Palendrome Lab
 */

import java.util.Scanner;
public class palendrome
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter in a string: ");
        String inp = new String(keyboard.nextLine());
        int strlen = inp.length();
        Scanner scan1 = new Scanner(inp);
        int charct = 0;
        while (scan1.hasNext())
            charct = charct + 1;
        
    }
}
