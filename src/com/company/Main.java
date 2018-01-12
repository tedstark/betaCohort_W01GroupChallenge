package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Human Resource Salary Calculator.");
        System.out.println("");
        System.out.println("This calculator will calculate an employee's annual salary into bi-weekly, bi monthly, and monthly paychecks.");
        System.out.println("");
        System.out.println("You will need the employee's first and last name, employee number, and annual salary.");
        System.out.println("");
        String nextEmp = ("Yes");
        while (nextEmp.equals("Yes")) {
            System.out.println("Please enter the employee's first name:");
            String firstName = sc.nextLine();
            System.out.println("Please enter the employee's last name:");
            String lastName = sc.nextLine();
            System.out.println("Please enter the employee number:");
            String empNum = sc.nextLine();
            System.out.println("Please enter the employee's annual salary without dollar sign or commas.");
            String empSalaryS = sc.nextLine();

            double empSalaryI = Double.parseDouble(empSalaryS);

            double twoWeeks = empSalaryI / 26;
            double biMon = empSalaryI / 24;
            double mon = empSalaryI / 12;

            DecimalFormat format = new DecimalFormat("##.00");

            System.out.println("Salary breakdown for " + firstName + " " + lastName+":");
            System.out.println("Bi-weekly salary: $" + format.format(twoWeeks));
            System.out.println("Bi-monthly salary: $" + format.format(biMon));
            System.out.println("Monthly salary: $" + format.format(mon));

            System.out.println("Would you like to calculate salary for a new employee?");
            nextEmp = sc.nextLine();
            if (nextEmp.equalsIgnoreCase("Yes")) {
                System.out.println("Okay.");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("Thank you for using the Human Resources Salary Calculator");
            }

        }
    }
}
