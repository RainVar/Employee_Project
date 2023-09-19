package employee.version1;

public class TestMain {
     public static void main(String[] args) {
         
        //using Version 1
        System.out.println("VERSION 1: \n");
        
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
        
        System.out.println("\n\n\n");
        
        
        
        
        
        //using Version 2
        System.out.println("VERSION 2: \n");
       
        System.out.println("Hourly Employee:");
        employee.version2.HourlyEmployee emp11 = new employee.version2.HourlyEmployee(12, "Peter", "2003-06-29", "2003-06-29", 52f, 15.3f);
        emp11.displayInfo();
        
        System.out.println();
        
        System.out.println("PieceWorker Employee:");
        employee.version2.PieceWorkerEmployee emp22 = new employee.version2.PieceWorkerEmployee(45f, 12.5f);
        emp22.displayInfo();
        
        System.out.println();

        System.out.println("Commission Employee:");
        employee.version2.CommissionEmployee emp33 = new employee.version2.CommissionEmployee(75000);
        emp33.displayInfo();
        
        System.out.println();
        
        System.out.println("Base Plus Commission Employee:");
        employee.version2.BasePlusCommissionEmployee emp44 = new employee.version2.BasePlusCommissionEmployee(75000, 5000);
        emp44.displayInfo();
        
      
    }
}
