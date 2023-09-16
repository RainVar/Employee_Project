package employee.version1;

import java.time.LocalDate;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private double totalSales;
    private double baseSalary;

    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired);
        this.empBirthDate = LocalDate.parse(empBirthDate);
    }
    
    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        this(0, "PlaceHolder", "1000-10-10", "1000-10-10");
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired);
        this.empBirthDate = LocalDate.parse(empBirthDate);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(String empDateHired) {
        this.empDateHired = LocalDate.parse(empDateHired);
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(String empBirthDate) {
        this.empBirthDate = LocalDate.parse(empBirthDate);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        if (totalSales < 50000) {
            return baseSalary + (totalSales * 0.05);
        } else if (totalSales < 100000) {
            return baseSalary + (totalSales * 0.20);
        } else if (totalSales < 500000) {
            return baseSalary + (totalSales * 0.30);
        } else {
            return baseSalary + (totalSales * 0.50);
        }
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\n" +
               "Employee Name: " + empName + "\n" +
               "Date Hired: " + empDateHired + "\n" +
               "Date of Birth: " + empBirthDate;
    }
}
