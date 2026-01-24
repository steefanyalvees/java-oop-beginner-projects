import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new fullTimeEmployee(101, "John Smith", 5000, 800, 1200));
        employees.add(new partTimeemployee(102, "Ana Costa", 40, 80));
        employees.add(new intern(103, "Lucas Pereira", 1500, 300));
        employees.add(new Manager(104, "Maria Johnson", 7000, 0.20));

        System.out.println("=== Employee Management System ===");
        System.out.println("Processing monthly payroll...\n");

        double totalPayroll = 0;

        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            totalPayroll += salary;

            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Final Salary: " + salary);
            System.out.println("------------------------------");
        }

        System.out.println("=== Payroll Summary ===");
        System.out.println("Total Employees: " + employees.size());
        System.out.println("Total Payroll Cost: " + totalPayroll);
    }
}





