package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Cashier cash = new Cashier();

        System.out.println("Welcome to GreenLine");
        System.out.println("Enter type of employee : ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        switch(scanner.toString()) {

            case "cashier":
                cash.calcWeeklyPay();
                break;


            case "manager":

                    break;

        }
    }
}









