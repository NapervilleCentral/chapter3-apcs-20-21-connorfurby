/*
 * Connor Furby
 * 9/22/2022
 * Taxes Program
 * Decides how much taxes you would pay in 1913
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class taxesProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double taxrate, income, taxdue;
        System.out.print("What is your yearly income? ");
        income = keyboard.nextDouble();
        // decides what the tax percentage will be based off yearly income
        if (income > 500000)
            taxrate = 0.06;
        else if (income > 250000)
            taxrate = 0.05;
        else if (income > 100000)
            taxrate = 0.04;
        else if (income > 75000)
            taxrate = 0.03;
        else if (income > 50000)
            taxrate = 0.02;
        else
            taxrate = 0.01;
        // creates a format that will print in 2 decimal places with $
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        // calculates taxes due
        taxdue = income * taxrate;
        // prints taxes
        System.out.print("Taxes Due in 1913: " + moneyFormat.format(taxdue));
    }
}