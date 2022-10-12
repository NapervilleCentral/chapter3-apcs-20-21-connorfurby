package e02;

public class PowerOf2
{
   public static void main(String[] args)
   {
      // The powers of 2 from 2^0 to 2^20
      //display and sum all of the squares 1, 2 , 4 , 8 ...
        int pw = 0, sum = 0; 
        while (pw <= 20)
        {
            sum += Math.pow(2,pw);
            System.out.print(Math.pow(2,pw) + ", ");
            pw += 1;
        }
        System.out.println("\nSum: " + sum);
   }
}
