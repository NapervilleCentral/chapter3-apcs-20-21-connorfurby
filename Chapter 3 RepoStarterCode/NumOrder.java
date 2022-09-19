/**
 * Names: Alex Ung & Connor Furby
 * Date: 9/16/22
 * Program Title: NumOrder
 * Description: determines whether a set of 3 numbers is strictly increasing,
 * strictly decreasing, or neither
 */
import java.util.Scanner;

public class NumOrder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      //collects 3 floating point inputs
      System.out.print("Enter three numbers: ");
      double num1 = in.nextDouble();
      double num2 = in.nextDouble();
      double num3 = in.nextDouble();
      
      //determines if the numbers are decreasing
      if (num1 > num2 && num2 > num3)
          System.out.print("The numbers are in decreasing order");
      //determines if the numbers are increasing
      else if (num1 < num2 && num2 < num3)
          System.out.print("The numbers are in increasing order");
      //defaults to neither if not strictly increasing or decreasing
      else 
          System.out.print("The numbers are in neither increasing nor decreasing order");
   }
}
