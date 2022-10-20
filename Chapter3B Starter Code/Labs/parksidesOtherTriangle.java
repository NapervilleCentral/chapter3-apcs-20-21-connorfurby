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
        for (int ll = size; ll >= 0; ll--)
        {
            int cn = seed;
            int ca = 0;
            for (int i = 0; i < ll; i++)
            {
                for (int templl = ll; 
                if (cn > 9)
                    cn = cn - 9;
                System.out.print(cn + " ");
                ca = ca + 1;
                cn = cn + ca;
            }
            System.out.print("\n");
        }
    }
}
