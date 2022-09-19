package e09;

import java.util.Scanner;

public class TwoPair
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter four numbers: ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();
      
      if (a == b && c == d)
          System.out.print("There are two pairs");
      else if (a == c && b == d)
          System.out.print("There are two pairs");
      else if (a == d && b == c)
          System.out.print("There are two pairs");
      else
          System.out.print("There are not two pairs");
   }
}
