package homework1;
/* Do these during your break so that we can catch up as a cohort. Post your questions in slack.
Homework 1: yardSaleWholeSale
Due on Tuesday, May 7th in class at 11am.
You must DM your public repo to me in Slack or else earn an infraction. (No extensions)
Create a method named yardSaleWholeSale that requires three parameters.
The name of the product someone wants to buy.
The price they are willing to pay for the product.
How many of the products that they wish to buy.
The method must be dynamic and its job is to print out a receipt using String Formatting and display the result as seen below to include the current date. Be prepared to explain how most of the code works without comments!!!
Expected output:
Name      Qty       Price     Total
----      ---       -----     -------
Rice      20        $5.0      $100.00

Thank you. Come again!!!

Purchased on: Thursday, April 25, 2024 */

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        printYardSaleReceipt("Rice", 5.0, 20);
    }

    public static void printYardSaleReceipt(String productName, double price, int quantity) {
        // Calculate the total price
        double totalPrice = price * quantity;

        // Format the price using DecimalFormat
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedPrice = decimalFormat.format(price);

        // Get the current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(new Date());

        // Print the receipt
        System.out.println("Name       Qty        Price      Total");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s %-10d $%-10s $%.2f%n", productName, quantity, formattedPrice, totalPrice);
        System.out.println("Date: " + currentDate);
    }
}
