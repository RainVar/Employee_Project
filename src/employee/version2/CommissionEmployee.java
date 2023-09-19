package employee.version2;

public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {

    }

    public CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        super();
    }
    
    public CommissionEmployee(double totalSales) {
        super();
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate, double totalSales) {
        super();
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {
        if (totalSales < 50000) {
            return totalSales * 0.05;
        } else if (totalSales < 100000) {
            return totalSales * 0.20;
        } else if (totalSales < 500000) {
            return totalSales * 0.30;
        } else {
            return totalSales * 0.50;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() +
               "Total Sales: $" + totalSales + "\n" +
               "Salary: $" + computeSalary();
                
    }
}