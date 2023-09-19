package employee.version2;

import java.time.LocalDate;

public class Employee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;

    public Employee() {
        this(0, "PlaceHolder", "1000-10-10", "1000-10-10");
    }

    public Employee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired);
        this.empBirthDate = LocalDate.parse(empBirthDate);
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

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\n" +
            "Employee Name: " + empName + "\n" +
            "Date Hired: " + empDateHired + "\n" +
            "Date of Birth: " + empBirthDate + "\n";
    }
}
