package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String user;

        Cashier cashier = new Cashier();
        Manager manager = new Manager();

        System.out.println("Welcome to GreenLine");
        System.out.println("Enter type of employee : ");
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextLine();

        switch(user) {

            case "cashier":
                cashier.calcWeeklyPay();
                break;


            case "manager":
                manager.WeeklyPay();
                break;
        }
    }
}









