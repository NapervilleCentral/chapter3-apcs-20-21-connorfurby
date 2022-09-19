import java.util.Scanner;

public class NumOrderInt
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter three numbers: ");
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      
      if ((num1 >= num2 && num2 >= num3) || (num1 <= num2 && num2 <= num3))
          System.out.print("The numbers are in order");
      else
          System.out.print("The numbers are not in order");
   }
}
