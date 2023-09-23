package employee.version3;

import java.time.LocalDate;

public class TestMain {
     public static void main(String[] args) {
    
        //using Version 3
        System.out.println("VERSION 3: \n");
        
        
        Name name1 = new Name()
                .title("Dr.")
                .firstName("Karen")
                .lastName("Lei")
                .middleName("Torrevillas")
                .suffix("II");
        
        System.out.println("Hourly Employee:");
        HourlyEmployee emp1 = new HourlyEmployee(
                12, 
                name1, 
                LocalDate.of(2003, 06, 29), 
                LocalDate.of(2003, 06, 29), 
                52f, 
                15.3f
        );
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
