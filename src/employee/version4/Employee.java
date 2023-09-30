package employee.version4;

import java.time.LocalDate;

public class Employee {
    private int empID;
    private Name empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;

    public Employee() {
        Name PlaceHolder = new Name()
            .title("Mr.")
            .firstName("Place")
            .middleName("Hole")
            .lastName("Der")
            .suffix("I");
        this.empID = 0;
        this.empName = PlaceHolder;
        this.empDateHired = LocalDate.of(1000, 10, 10);
        this.empDateHired = LocalDate.of(1000, 10, 10);
    }

    public Employee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
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
