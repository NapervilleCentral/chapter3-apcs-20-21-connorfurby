package Labs;
/**
 * Connor Furby
 * 10/20/22
 * Parkside's Other Triangle Program
 */
import java.util.Scanner;
public class parksidesOtherTriangle
{
    public static void main(String[] args)
    {
        /*
         * Variable List ----
         * size = how many rows and columns the triangle will include
         * seed = the number the triangle will start with in the top left corner
         * cl = the current line that the program is working on outputting in the for loop
         * startnum = the number that the current row will start with
         * cn = the current number the program is on
         * ca = the current amount that needs to be added to make the next number
         * runone = is 1 only when the for loop for the line is running for the first time
         * tempcl = a temporary current line that is manipulated to add spaces before starting each line in a for loop
         */
        
        // asks user for inputs of size and seed
        Scanner keyboard = new Scanner(System.in);
        int size, seed;
        System.out.println("Input size of triangle: ");
        size = keyboard.nextInt();
        System.out.println("Input seed of triangle: ");
        seed = keyboard.nextInt();
        
        // initializes variables
        int cl = 1;
        int startnum = seed;
        for (int ll = size; ll >= 0; ll--) // this for loop runs until the entire triangle is done
        {
            int cn = seed;
            int ca = 0;
            int runone = 1;
            for (int i = 0; i < ll; i++) // this for loop prints an individual line
            {
                for (int tempcl = cl - 1; tempcl >= 1 && runone == 1; tempcl--) // this for loop adds spaces before each new line
                {
                    System.out.print("  ");
                }

                if (runone == 1) // only runs first time through this for loop
                {
                    cn = startnum;
                    ca = cl - 1;
                }
                if (cn > 9) // checks if number overflows to two digit and returns it to one digit
                    cn = cn % 9;
                if (cn == 0)
                    cn = 9;
                
                runone = 0;
                System.out.print(cn + " "); // prints the current number
                ca = ca + 1;
                cn = cn + ca;
            }
            System.out.print("\n");
            startnum = startnum + (cl + 1);
            if (startnum > 9) // checks if starting number is two digit and returns it to one digit
                startnum = startnum % 9;
            if (startnum == 0)
                startnum = 9;
            cl = cl + 1;
        }
    }
}
