import java.util.Scanner;

public class FindMinimumValue
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int min, loop = 1;
      System.out.print("Enter in numbers; press 'Q' to stop");
      String currLine = new String(keyboard.nextLine());
      if (currLine.charAt(currLine.length() - 1) == 'Q')
          loop = 0;
      while (loop == 1)
      {
          newNum = keyboard.nextInt());
          if (newNum < min)
              min = newNum;
      }
      System.out.println("The minimum value was: " + min);
   }
}