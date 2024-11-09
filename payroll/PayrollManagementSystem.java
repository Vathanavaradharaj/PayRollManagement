package project.payroll;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PayrollManagementSystem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		//System.out.println("Enter your EmployeeID");
		//int id = in.nextInt();
		//in.nextLine();
		  int id = 0;
	        boolean validId = false;
	        while (!validId) {
	            System.out.println("Enter your EmployeeID:");
	            try {
	                id = in.nextInt();
	                validId = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Congrats! You've unlocked 'Access Denied!' Please enter a valid integer EmployeeID.");
	                in.nextLine(); 
	            }
	        }
	        in.nextLine(); 
	       String name = "";
	       boolean validname = false;
	       while(!validname) {
		System.out.println("Enter your Name");
		 name = in.nextLine();
		    if (name.matches("[a-zA-Z\\s]+")) // a-z A-Z \\s - white space 
		    {
		        validname = true;
		    } else {
		        System.out.println("Nice try, but numbers aren't names! Unless you're a robot!");
		    }
	       }
	     EmployeeDetails employeeDetails = new EmployeeDetails();
	        employeeDetails.displayEmployees();
	        String d = in.nextLine();
	        int salary = employeeDetails.getSalary(d);
	        System.out.println(d.toUpperCase()+" "+ name+"'s Basic Salary: " + salary);
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        System.out.println("                                 === Attendance Proccessor ===                                 ");
	        Attendance attendance = new Attendance();
	        int leaveDays = attendance.empleave();
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        System.out.println("                                 === Allowance Calculation ===                                 ");
	        Allowance allowance = new Allowance();
	 
	        int travel = allowance.calculate(in);  
	        int time =   allowance.OverTime(in);
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        System.out.println("                                 === Deduction Calculation ===                                 ");
	      //  Deduction.deductions(in, employeeDetails, d);
	        double[] deductions = Deduction.deductions(in, employeeDetails, d);
	        System.out.println("-----------------------------------------------------------------------------------------------");
	        System.out.println(" EmployeeID: "+id+ " \n Emplyee Name: "+name+" ");
	        SalaryDetails.SalaryCal(employeeDetails, d, deductions, leaveDays, travel , time);

	        in.close();
		
		}
	}
	


	


