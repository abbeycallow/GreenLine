package com.company;

import java.util.Scanner;

public class Manager extends employee {
    int hoursWorked;
    int salary;
    int total;

    void WeeklyPay(){

        System.out.println("Enter employee name : ");
        Scanner scanner = new Scanner(System.in);
        setName(scanner.nextLine());
        System.out.println("Enter employee ID : ");
        setEmployeeId(scanner.nextInt());
        System.out.println("Enter employee salary : ");
        salary = scanner.nextInt();
        System.out.println("Enter hours worked this week : ");
        hoursWorked = scanner.nextInt();

        total();

        System.out.println("-Employee information-" + "\nEmployee type : MANAGER" + "\nname : " + name + "\nID number : " + employeeId + "\nEmployee salary : " +
                           salary  + "\nWeekly payroll for  " + name + " : " + "$" + total);
    }

    @Override
    public void total() {
        super.total();
        total = salary / hoursWorked;
    }
}
