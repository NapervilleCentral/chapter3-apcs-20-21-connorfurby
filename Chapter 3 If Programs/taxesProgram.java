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
        double tax, income;
        System.out.println("What is your yearly income? ");
        income = keyboard.nextDouble();
        // decides what the tax will be based off yearly income
        if (income <= 50000)
            tax = income * 0.01;
        else if (income <= 75000 && 50000 < income)
            tax = 50000 * 0.01 + (income - 50000) * 0.02;
        else if (income <= 100000 && 75000 < income)
            tax = 50000 * 0.01 + 25000 * 0.02 + (income - 75000) * 0.03;
        else if (income <= 250000 && 100000 < income)
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + (income - 100000) * 0.04;
        else if (income <= 500000 && 250000 < income)
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + (income - 250000) * 0.05;
        else
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + 250000 * 0.05 + (income - 500000) * 0.06;
        // creates a format that will print in 2 decimal places with $
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        // prints taxes
        System.out.println("Taxes Due in 1913: " + moneyFormat.format(tax));
    }
}