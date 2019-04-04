package com.company;
import java.util.Scanner;

public class Cashier extends employee{
    int hourly = 0;
    int hoursWorked = 0;
    int total;


     void calcWeeklyPay(){

         System.out.println("Enter employee name : ");
        Scanner scanner = new Scanner(System.in);
        setName(scanner.nextLine());
        System.out.println("Enter employee ID : ");
        setEmployeeId(scanner.nextInt());
        System.out.println("Enter hourly rate : ");
        hourly = scanner.nextInt();
        System.out.println("Enter hours worked this week : ");
        hoursWorked = scanner.nextInt();

        total();

        System.out.println("-Employee information-" + "\nname : " + name + "\nID number : " +
                           employeeId + "\nHourly rate : " + hourly + "\nWeekly payroll for " + name + " : " + "$" + total);
     }

    @Override
    public void total() {
        super.total();
        total = hourly * hoursWorked;
    }
}


