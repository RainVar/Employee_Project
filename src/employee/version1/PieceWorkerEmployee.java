package employee.version1;

import java.time.LocalDate;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
        
    }

    public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired);
        this.empBirthDate = LocalDate.parse(empBirthDate);
    }
    
    public PieceWorkerEmployee(float totalPiecesFinished, float ratePerPiece) {
        this(0, "PlaceHolder", "1000-10-10", "1000-10-10");
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = LocalDate.parse(empDateHired);
        this.empBirthDate = LocalDate.parse(empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        return (totalPiecesFinished * ratePerPiece) + ((ratePerPiece * 10) * ((int)(totalPiecesFinished/100)));
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
        System.out.println("Weekly Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\n" +
            "Employee Name: " + empName + "\n" +
            "Date Hired: " + empDateHired + "\n" +
            "Date of Birth: " + empBirthDate + "\n" +
            "Total Pieces Finished: " + totalPiecesFinished + "\n" +
            "Rate Per Piece: " + ratePerPiece + "\n" +
            "Weekly Salary: $" + computeSalary();
    }
}
