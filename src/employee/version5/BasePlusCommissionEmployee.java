package employee.version5;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary() {
        if (getTotalSales() < 50000) {
            return baseSalary + (getTotalSales() * 0.05);
        } else if (getTotalSales() < 100000) {
            return baseSalary + (getTotalSales() * 0.20);
        } else if (getTotalSales() < 500000) {
            return baseSalary + (getTotalSales() * 0.30);
        } else {
            return baseSalary + (getTotalSales() * 0.50);
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base Salary: $" + baseSalary);
    }

    @Override
    public String toString() {
        return super.toString() +
               "Base Salary: $" + baseSalary + "\n";
    }
}
