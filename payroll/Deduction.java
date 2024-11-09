
package project.payroll;

import java.util.Scanner;

public class Deduction {
    public static double[] deductions(Scanner in, EmployeeDetails employeeDetails, String designation) {
        
        int salary = employeeDetails.getSalary(designation); 
        
        
        double taxRate = 10.0;
        double pfRate = 12.0;

        
        double tax = salary * (taxRate / 100);
        double pf = salary * (pfRate / 100);
        
       
        double finalSalary = salary - tax - pf;
        
        System.out.println("=> Tax Amount <= ");
        System.out.println("You need to pay 10% of your Acutal Salary to tax:");
        System.out.println(tax);
        System.out.println("Congratulations! You’ve just donated your salary to the government");
        System.out.println("");
        System.out.println("=> your PF contribution <=");
        System.out.println("Your Pf amount added this month :  ");
        System.out.println(pf);
        System.out.println("At least you be rich after retirement");
      //  tax and pf in array
        return new double[] { tax, pf };
    }
}

