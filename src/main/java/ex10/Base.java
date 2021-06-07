package ex10;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String p1 = in.nextLine();

        System.out.print("Enter the quantity of item 1: ");
        String q1 = in.nextLine();

        System.out.print("Enter the price of item 2: ");
        String p2 = in.nextLine();

        System.out.print("Enter the quantity of item 2: ");
        String q2 = in.nextLine();

        System.out.print("Enter the price of item 3: ");
        String p3 = in.nextLine();

        System.out.print("Enter the quantity of item 3: ");
        String q3 = in.nextLine();

        int per1 = Integer.parseInt(p1);
        int per2 = Integer.parseInt(p2);
        int per3 = Integer.parseInt(p3);

        int qua1 = Integer.parseInt(q1);
        int qua2 = Integer.parseInt(q2);
        int qua3 = Integer.parseInt(q3);

        double subtotal = (per1 * qua1) + (per2 * qua2) + (per3 * qua3);

        double tax = (subtotal * 5.5) / 100;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + (tax + subtotal));
    }
}
