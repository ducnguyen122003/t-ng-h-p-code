package baitap1;



abstract class Employee{
    private String employeeID;
    private String name;
    private double baseSalary;
    private double allowance;

    public Employee(String employeeID, String name, double baseSalary, double allowance) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }


    public double getTotalSalary(){

        return baseSalary + allowance;
    }

        //return baseSalary + allowance;


    public String toString(){

        return "Employee ID: " + employeeID
                + "\nName: " + name
                + "\nBase Salary: " + baseSalary
                + "\nAllowance: " + allowance
                + "\n------------------------";
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getAllowance() {
        return allowance;
    }

}
