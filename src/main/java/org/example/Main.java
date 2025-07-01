package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Membership status (Regular, VIP, Premium): ");
        String member_status = s.nextLine();

        System.out.print("Enter Age: ");
        int age = s.nextInt();

        double price = 0;

        if (age < 18) {
            if (member_status.toLowerCase().equals("Regular")) {
                price = 50;
            }
            else if (member_status.toLowerCase().equals("VIP")) {
                price = 75;
            }
            else if (member_status.toLowerCase().equals("Premium")) {
                price = 100;
            }
            else {
                System.out.println("Invalid Member Status");;
            }
        }
        else if (age <= 64) {
            if (member_status.equalsIgnoreCase("Regular")) {
                price = 100;
            }
            else if (member_status.equalsIgnoreCase("VIP")) {
                price = 150;
            }
            else if (member_status.equalsIgnoreCase("Premium")) {
                price = 200;
            }
            else {
                System.out.println("Invalid Member Status");;
            }
        }
        else if (age > 64) {
            if (member_status.equalsIgnoreCase("regular")) {
                price = 75;
            }
            else if (member_status.equalsIgnoreCase("vip")) {
                price = 112.5;
            }
            else if (member_status.equalsIgnoreCase("premium")) {
                price = 150;
            }
            else {
                System.out.println("Invalid Member Status");;
            }
        }
        System.out.println("Price: $" + price);


    }
}