/*
 * Connor Furby
 * 9/22/2022
 * Mini Van Program
 * User inputs many parts of a mini van mechanism and program tells which doors open
 */

import java.util.Scanner;

public class miniVanProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        // dl/dr = left/right dashboard switch
        // cl = child lock
        // mu = master unlock
        // il/ir = left/right inside handles
        // ol/or = left/right outside handles
        // leftdoor/rightdoor = decides if door opens or not
        // inv = used later to test if input is invalid or not
        int dl, dr, cl, mu, il, ir, ol, or, leftdoor = 0, rightdoor = 0, inv = 0;
        char gear;
        System.out.println("Welcome to the Mini Van Program!");
        System.out.println("----------------------------------------------------");
        System.out.println("Left Dashboard Switch (1 = on, 0 = off)");
        System.out.println("Right Dashboard Switch (1 = on, 0 = off)");
        System.out.println("Child Lock (1 = on, 0 = off)");
        System.out.println("Master Unlock (1 = on, 0 = off)");
        System.out.println("Inside Left Handle (1 = triggered, 0 = off)");
        System.out.println("Inside Right Handle (1 = triggered, 0 = off)");
        System.out.println("Outside Left Handle (1 = triggered, 0 = off)");
        System.out.println("Outside Right Handle (1 = triggered, 0 = off)");
        System.out.println("Gear (P = park, R = Reverse, D = Drive, N = Neutral, 1 = gear 1, 2 = gear 2, 3 = gear 3)");
        System.out.println("----------------------------------------------------");
        System.out.println("Input a code using each of the above switches, each option followed by a space");
        System.out.println("example: 1 1 0 0 1 0 1 0 D");
        // collects all of the inputs and puts them into seperate variables
        dl = keyboard.nextInt();
        dr = keyboard.nextInt();
        cl = keyboard.nextInt();
        mu = keyboard.nextInt();
        il = keyboard.nextInt();
        ir = keyboard.nextInt();
        ol = keyboard.nextInt();
        or = keyboard.nextInt();
        String line = new String(keyboard.nextLine());
        //tests to make sure user has chosen 1 or 0 and used proper spacing
        if ((dl != 1 && dl != 0) || (dr != 1 && dr != 0) || (cl != 1 && cl != 0) || (mu != 1 && mu != 0) || (il != 1 && il != 0) || (ir != 1 && ir != 0) || (ol != 1 && ol != 0) || (or != 1 && or != 0) || (line.length() != 2))
        {
            System.out.println("Invalid Input");
            inv = 1;
        }
        //turns gear into a charachter
        gear = line.charAt(1);
        // tests to make sure gear is a valid option
        if (gear != 'D' && gear != 'R' && gear != 'N' && gear != 'P' && gear != '1' && gear != '2' && gear != '3')
        {
            System.out.println("Invalid Input");
            inv = 1;
        }
        
        // only runs if input is valid using inv variable
        if (inv == 0)
        {
            // only runs if gear is in park and master unlock is on
            if (gear == 'P' && mu == 1)
            {   
                // tests to see if left door is open 
                if ((cl == 0 && il == 1) || ol == 1 || dl == 1)
                    leftdoor = 1;
                // tests to see if right door is open
                if ((cl == 0 && ir == 1) || or == 1 || dr == 1)
                    rightdoor = 1;
                // if doors arent open then they default to closed
            }
            
            // prints if doors are open or not
            if (leftdoor == 1)
                System.out.println("Left Door Opens");
            if (rightdoor == 1)
                System.out.println("Right Door Opens");
            if (leftdoor == 0 && rightdoor == 0)
                System.out.println("Both Doors Stay Closed");
        }
    }
}