//package project.payroll;
//
//public class SalaryDetails {
//	 public static void SalaryCal(EmployeeDetails employeeDetails, String designation, double[] deductions, int leaveDays) {
//	        int salary = employeeDetails.getSalary(designation);
//	        double[] deduction = [travel,time];

//	 }
//}
package project.payroll;

public class SalaryDetails {

    public static void SalaryCal(EmployeeDetails employeeDetails, String designation, double[] deductions, int leaveDays, int travel, int time) {
        int salary = employeeDetails.getSalary(designation);
        double tax = deductions[0];
        double pf = deductions[1];

       
        int leave = (leaveDays > 0) ? (leaveDays * 500) : 0;   // 500 per day of leave
        double final_Salary = (double) (salary + travel + time - tax - pf - leave);

        System.out.println("____________________________________________________________");
        System.out.println("||                                                        ||");
        System.out.printf("|| Base Salary     : Rs. %10d                       ||\n", salary);
        System.out.printf("|| Travel Allowance: Rs. %10d                       ||\n", travel);
        System.out.printf("|| Overtime Payment: Rs. %10d                       ||\n", time);
        System.out.printf("|| Tax Deducted    : Rs. %10.2f                       ||\n", tax);
        System.out.printf("|| PF Deducted     : Rs. %10.2f                       ||\n", pf);
        System.out.printf("|| Leave Penalty   : Rs. %10d                       ||\n", leave);
        System.out.println("||--------------------------------------------------------||");
        System.out.printf("|| Final Salary    : Rs. %10.2f                       ||\n", final_Salary);
        System.out.println("||--------------------------------------------------------||");
        System.out.println("____________________________________________________________");

       
        System.out.println("Congratulations! Your paycheck is ready, no more coding for today!");
    }
}
