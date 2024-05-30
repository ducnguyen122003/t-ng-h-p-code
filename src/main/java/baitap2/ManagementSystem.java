package baitap2;



import java.util.ArrayList;




class ManagementSystem {
    private ArrayList<Employee> employees;

    public ManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("added successfully.");
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("List of all employees:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public double totalSalary() {
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.totalSalary();
        }
        return totalSalary;
    }

    public void displayNumberOfEmployees() {
        System.out.println("Number of employees: " + employees.size());
    }

    public void displayEmployeeByName(String name) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                System.out.println(emp.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with name " + name + " not found.");
        }
    }

    public void displayEmployeeByID(String employeeID) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getEmployeeID().equals(employeeID)) {
                System.out.println(emp.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + employeeID + " not found.");
        }
    }
}

