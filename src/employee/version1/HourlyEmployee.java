package employee.version1;

import java.time.LocalDate;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
        
    }

    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired);
        this.empBirthDate = LocalDate.parse(empBirthDate);
    }
    
    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
        this(0, "PlaceHolder", "1000-10-10", "1000-10-10");
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired);
        this.empBirthDate = LocalDate.parse(empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Weekly Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\n" +
            "Employee Name: " + empName + "\n" +
            "Date Hired: " + empDateHired + "\n" +
            "Date of Birth: " + empBirthDate + "\n" +
            "Total Hours Worked: " + totalHoursWorked + "\n" +
            "Rate Per Hour: " + ratePerHour + "\n" +
            "Weekly Salary: $" + computeSalary();
    }
}
