package baitap2;

class ManagerEmployee extends Employee {
    public double totalSalary() {
        return getBaseSalary() * 3 + getAllowance();
    }
    public String toString() {
        return "Manager ID: " + getEmployeeID()
                + "\nName: " + getName()
                + "\nBase Salary: " + getBaseSalary()
                + "\nAllowance: " + getAllowance();
}
}
