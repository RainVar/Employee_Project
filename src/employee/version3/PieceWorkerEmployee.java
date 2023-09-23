package employee.version3;

import java.time.LocalDate;

public class PieceWorkerEmployee extends Employee {
    private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {

    }

    public PieceWorkerEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public PieceWorkerEmployee(float totalPiecesFinished, float ratePerPiece) {
        super();
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
        return (totalPiecesFinished * ratePerPiece) + ((ratePerPiece * 10) * ((int) (totalPiecesFinished / 100)));
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
        System.out.println("Weekly Salary: $" + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Total Pieces Finished: " + totalPiecesFinished + "\n" +
                "Rate Per Piece: " + ratePerPiece + "\n" +
                "Weekly Salary: $" + computeSalary();
    }
}
