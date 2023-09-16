package employee.version1;

public class TestMain {
     public static void main(String[] args) {

        System.out.println("Hourly Employee:");
        HourlyEmployee emp1 = new HourlyEmployee(45f, 12.5f);
        emp1.displayInfo();
        
        System.out.println();
        
        System.out.println("PieceWorker Employee:");
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(45f, 12.5f);
        emp2.displayInfo();
        
        System.out.println();

        System.out.println("Commission Employee:");
        CommissionEmployee emp3 = new CommissionEmployee(75000);
        emp3.displayInfo();
        
        System.out.println();
        
        System.out.println("Base Plus Commission Employee:");
        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(75000, 5000);
        emp4.displayInfo();
    }
}
