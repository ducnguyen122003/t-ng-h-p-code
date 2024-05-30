package baitap2;


import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagementSystem managementSystem = new ManagementSystem();

        while (true) {
            System.out.println("\n1. Add new employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Calculate total income of all employees");
            System.out.println("4. Display number of employees");
            System.out.println("5. Display employee information by name");
            System.out.println("6. Display employee information by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter employee type (1 - Normal, 2 - Manager): ");
                    int employeeType = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    String employeeID = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Base Salary: ");
                    double baseSalary = scanner.nextDouble();
                    System.out.print("Enter Allowance: ");
                    double allowance = scanner.nextDouble();
                    Employee newEmployee;
                    if (employeeType == 1) {
                        newEmployee = new NormalEmployee();
                    } else if (employeeType == 2) {
                        newEmployee = new ManagerEmployee();
                    } else {
                        System.out.println("Invalid employee type.");
                        continue;
                    }
                    newEmployee.setEmployeeID(employeeID);
                    newEmployee.setName(name);
                    newEmployee.setBaseSalary(baseSalary);
                    newEmployee.setAllowance(allowance);
                    managementSystem.addEmployee(newEmployee);
                    break;
                case 2:
                    managementSystem.displayAllEmployees();
                    break;
                case 3:
                    System.out.println("Total salary of all employees: " + managementSystem.totalSalary());
                    break;
                case 4:
                    managementSystem.displayNumberOfEmployees();
                    break;
                case 5:
                    System.out.print("Enter the name of the employee: ");
                    String searchName = scanner.nextLine();
                    managementSystem.displayEmployeeByName(searchName);
                    break;
                case 6:
                    System.out.print("Enter the ID of the employee: ");
                    String searchID = scanner.nextLine();
                    managementSystem.displayEmployeeByID(searchID);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}