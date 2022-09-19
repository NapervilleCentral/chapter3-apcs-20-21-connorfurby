/**
 * From: Alex and Eric
 * Names: Alex Ung & Connor Furby
 * Date: 9/19/22
 * Program Title: NumOrder
 * Description: determines whether a set of 3 numbers is increasing,
 * decreasing, or neither; strictly increasing/decreasing if mode is strict, 
 * equal numbers allowed if mode is lenient
 */
import java.util.Scanner;

public class NumOrderCondition
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String order = new String();

        // gets input for three numbers
        System.out.print("Enter three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        in.nextLine();
        
        //collects input to determine mode
        System.out.print("Lenient or Strict mode? ");
        String mode = new String(in.nextLine());
        
        //checks for lenient mode
        if (mode.equals("Lenient"))
            // checks if numbers are in order
            if ((num1 == num2) && (num2 == num3))
                order = ("both increasing and decreasing (they're all equal)");
            else if ((num1 >= num2) && (num2 >= num3))
                order = ("decreasing");
            else if ((num3 >= num2) && (num2 >= num1))
                order = ("increasing");
            else
                order = ("neither");
        //checks for strict mode
        else if (mode.equals("Strict"))
            // checks if numbers are in order
            if ((num1 > num2) && (num2 > num3))
                order = ("decreasing");
            else if ((num3 > num2) && (num2 > num1))
                order = ("increasing");
            else
                order = ("neither");
        //returns invalid mode if neither lenient or strict are inputted
        else
            System.out.println("Invalid mode");
        
        System.out.println("\n" + num1 + " " + num2 + " " + num3 + " " + order);
    }
}


