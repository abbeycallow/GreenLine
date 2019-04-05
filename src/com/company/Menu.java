package com.company;

import java.util.Scanner;

public class Menu {

    public static void showMenu(){

        String user;

        Cashier cashier = new Cashier();
        Manager manager = new Manager();

        System.out.println("Welcome to GreenLine");
        System.out.println("Enter type of employee : ");
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextLine();

        switch (user) {

            case "cashier":
                cashier.calcWeeklyPay();
                break;


            case "manager":
                manager.WeeklyPay();
                break;

            default:
                System.out.println("THANK YOU AND GOODBYE");
        }
    }
}





