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
        Scanner keyboard = new Scanner(System.in);
        int size, seed;
        System.out.println("Input size of triangle: ");
        size = keyboard.nextInt();
        System.out.println("Input seed of triangle: ");
        seed = keyboard.nextInt();
        
        //line one
        int cl = 1;
        int startnum = seed;
        for (int ll = size; ll >= 0; ll--)
        {
            int cn = seed;
            int ca = 0;
            int runone = 1;
            for (int i = 0; i < ll; i++)
            {
                // adds spaces ---
                for (int tempcl = cl - 1; tempcl >= 1 && runone == 1; tempcl--)
                {
                    System.out.print("  ");
                }
                // prints numbers
                if (runone == 1)
                {
                    cn = startnum;
                    ca = cl - 1;
                }
                if (cn > 9)
                    cn = cn % 9;
                if (cn == 0)
                    cn = 9;
                
                runone = 0;
                System.out.print(cn + " ");
                ca = ca + 1;
                cn = cn + ca;
            }
            System.out.print("\n");
            startnum = startnum + (cl + 1);
            if (startnum > 9)
                startnum = startnum % 9;
            if (startnum == 0)
                startnum = 9;
            cl = cl + 1;
        }
    }
}
