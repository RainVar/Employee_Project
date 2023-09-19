package employee.version2;

public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
        
    }

    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        super(empID, empName,empDateHired, empBirthDate);
    }
    
    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
        super();
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName,empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        if (totalHoursWorked > 40){
            return totalHoursWorked * ratePerHour + ((ratePerHour * 1.5) * (totalHoursWorked-40));
        } else {
            return totalHoursWorked * ratePerHour;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Weekly Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() +
            "Total Hours Worked: " + totalHoursWorked + "\n" +
            "Rate Per Hour: " + ratePerHour + "\n" +
            "Weekly Salary: $" + computeSalary();
    }
}
