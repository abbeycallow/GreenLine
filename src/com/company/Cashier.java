package com.company;
import java.util.Scanner;

public class Cashier extends employee{
    double hourly = 0;
    int hoursWorked = 0;


     void calcWeeklyPay(){
        System.out.println("Enter employee name : ");
        Scanner scanner = new Scanner(System.in);
        setName(scanner.nextLine());
        System.out.println("Enter employee ID ");
        setEmployeeId(scanner.nextInt());
        System.out.println("Enter hourly rate");
        hourly = scanner.nextDouble();
        System.out.println("Enter hours worked");
        hoursWorked = scanner.nextInt();

        System.out.println(hourly * hoursWorked) ;



    }









}


