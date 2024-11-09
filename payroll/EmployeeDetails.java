package project.payroll;

import java.util.HashMap;

public class EmployeeDetails {
    HashMap<String, Integer> employee = new HashMap<>();

    public EmployeeDetails() {
        employee.put("trainee", 10000);
        employee.put("clerk", 20000);
        employee.put("hr", 20000);
        employee.put("manager", 40000);
        employee.put("developer", 60000);
    }

    public int getSalary(String designation) {
        int salary = employee.getOrDefault(designation.toLowerCase(), 0);
        if (salary == 0) {
            System.out.println("You aren't an employee of the company.");
            System.exit(0);
        }
        return salary;
    }

    public void displayEmployees() {
        System.out.println("Available Designations:");
        for (HashMap.Entry<String, Integer> entry : employee.entrySet()) {
            System.out.println("==> " + entry.getKey());
        }
    }
}
