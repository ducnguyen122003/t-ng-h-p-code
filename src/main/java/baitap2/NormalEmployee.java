package baitap2;

class NormalEmployee extends Employee {
    public double totalSalary() {
        return getBaseSalary() + getAllowance();
    }
    public String toString() {
        return "Employee ID: " + getEmployeeID()
                + "\nName: " + getName()
                + "\nBase Salary: " + getBaseSalary()
                + "\nAllowance: " + getAllowance();
    }
}
