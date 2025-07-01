package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Membership status (Regular, VIP, Premium): ");
        String member_status = s.nextLine();

        System.out.print("Enter Age: ");
        int age = s.nextInt();

        double price = 0;
        boolean valid = true;

        if (age < 18) {
            if (member_status.equalsIgnoreCase("Regular")) {
                price = 50;
            } else if (member_status.equalsIgnoreCase("VIP")) {
                price = 75;
            } else if (member_status.equalsIgnoreCase("Premium")) {
                price = 100;
            } else {
                valid = false;
            }
        } else if (age <= 64) {
            if (member_status.equalsIgnoreCase("Regular")) {
                price = 100;
            } else if (member_status.equalsIgnoreCase("VIP")) {
                price = 150;
            } else if (member_status.equalsIgnoreCase("Premium")) {
                price = 200;
            } else {
                valid = false;
            }
        } else {
            if (member_status.equalsIgnoreCase("Regular")) {
                price = 75;
            } else if (member_status.equalsIgnoreCase("VIP")) {
                price = 112.5;
            } else if (member_status.equalsIgnoreCase("Premium")) {
                price = 150;
            } else {
                valid = false;
            }
        }

        if (valid) {
            System.out.printf("Price: $%.2f%n", price);
        } else {
            System.out.println("Invalid membership status entered.");
        }
    }
}
