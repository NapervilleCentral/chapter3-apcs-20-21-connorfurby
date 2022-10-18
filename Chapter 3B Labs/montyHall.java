/*
 * Connor Furby
 * 10/17/22
 * Mr Hayes
 * Monty Hall Program
 */
import java.util.*;
public class montyHall
{
    public static void main()
    {
        int s1s = 0, s2s = 0;
        for (int i = 1; i <= 1000; i++) 
        {
            Random randomizer = new Random();
            int prizedoor = randomizer.nextInt(3);
            int playerchoice = randomizer.nextInt(3);
            int opendoor = randomizer.nextInt(3);
            int otherclosed  = randomizer.nextInt(3);
            System.out.println(prizedoor);
            System.out.println(playerchoice);
            System.out.println(opendoor);
            System.out.println(otherclosed);
            while (opendoor == playerchoice || opendoor == prizedoor)
                opendoor = randomizer.nextInt(3);
            while (otherclosed == opendoor || otherclosed == playerchoice)
                otherclosed = randomizer.nextInt(3);
            
            if (otherclosed == prizedoor)
                s1s += s1s;
            else
                s2s += s2s;
        }
        System.out.println("Strategy 1 Success: " + s1s);
        System.out.println("Strategy 2 Success: " + s2s);
    }
}

