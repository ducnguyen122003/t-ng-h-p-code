package baitap1;

import java.util.ArrayList;

 class ManagementSystem extends Employee{
    private static ArrayList<Employee> employees;

    public ManagementSystem() {
        super();
        employees = new ArrayList<>();
        //this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {

        employees.add(employee);
        System.out.println("add successfully");
    }

    public static void displayAllemployees() {
        if (employees.isEmpty()) {
            System.out.println("no employees");
            return;
        }
        System.out.println("List of all employees: ");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public double calculateTotalSalary(){
        double totalSalary = 0;
        for (Employee emp : employees){
            totalSalary += emp.getTotalSalary();
        }
        return totalSalary;
    }

    public void displayNumberOfEmployees(){
        System.out.println("Number of employees: " + employees.size());
    }

    public void displayEmployeeByname(String name){
        boolean found = false;
        for (Employee emp : employees){
            if (emp.getName().equals(name)){
                System.out.println(emp);
                found = true;
            }
        }
        if (!found){
            System.out.println("Employee with name " + name + " not found");
        }
    }

    public void displayEmployeeByID(String employeeId){
        boolean found = false;
        for (Employee emp : employees){
            if (emp.getEmployeeID().equals(employeeId)){
                System.out.println(emp);
                found = true;
            }
        }
        if (!found){
            System.out.println("Emloyee with ID " + employeeId + "not found");
        }
    }

 }