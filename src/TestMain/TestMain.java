package TestMain;

import employee.version4.*;
import java.time.LocalDate;

public class TestMain {
     public static void main(String[] args) {
    
        //using Version 3
        System.out.println("VERSION 4: \n");
        
        EmployeeRoster roster = new EmployeeRoster();
        EmployeeRoster search = new EmployeeRoster();
        
        Name name1 = new Name()
                .title("Dr.")
                .firstName("Karen")
                .lastName("Lei")
                .middleName("Torrevillas")
                .suffix("II");
        
        
        //Creating Employees
        HourlyEmployee emp1 = new HourlyEmployee(
                12, 
                name1, 
                LocalDate.of(2003, 06, 29), 
                LocalDate.of(2003, 06, 29), 
                52f, 
                15.3f
        );
      
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(45f, 12.5f);
        
        CommissionEmployee emp3 = new CommissionEmployee(75000);

        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(75000, 5000);
        
        //Adding the Employees to the list
        roster.addEmployee(emp1);
        roster.addEmployee(emp2);
        roster.addEmployee(emp3);
        roster.addEmployee(emp4);
        
        System.out.println("");
        
        roster.displayAllEmployees();
    }
}
