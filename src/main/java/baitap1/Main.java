package baitap1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagementSystem managementSystem = new ManagementSystem();

        while (true){
            System.out.println("1. add employee");
            System.out.println("2. display all employee");
            System.out.println("3. Calculate total Salary all employee");
            System.out.println("4. number of employee");
            System.out.println("5. information of name");
            System.out.println("6. information of ID");
            System.out.println("7. Exit");
            System.out.println(" enter your choice: ");
            int choice = scanner .nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("1-Normal 2-Manager");
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
                    if (employeeType == 1) {
                        managementSystem.addEmployee(new Employee(employeeID, name, baseSalary, allowance));
                    } else if (employeeType == 2) {
                        managementSystem.addEmployee(new Manager(employeeID, name, baseSalary, allowance));
                    } else {
                        System.out.println("Invalid employee type.");
                    }
                    break;
                case  2:
                    ManagementSystem.displayAllemployees();
                    break;
                case 3:
                    System.out.println("total salary all employees: " + managementSystem.calculateTotalSalary());
                    break;
                case 4:
                    managementSystem.displayNumberOfEmployees();
                    break;
                case 5:
                    System.out.println("the name of the employee");
                    String searchName = scanner.nextLine();
                    managementSystem.displayEmployeeByname(searchName);
                    break;
                case 6:
                    System.out.println("the ID of the employee");
                    String searchID = scanner.nextLine();
                    managementSystem.displayEmployeeByID(searchID);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("please enter a number between 1 to 7");
            }
        }
    }
}


