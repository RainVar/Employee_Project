package employee.version4;
import java.time.LocalDate;

public class TestMain {
    public static void main(String[] args) {

        EmployeeRoster roster = new EmployeeRoster();

        Name name1 = new Name()
            .title("Dr.")
            .firstName("Karen")
            .lastName("Lei")
            .middleName("Torrevillas")
            .suffix("II");

        HourlyEmployee emp1 = new HourlyEmployee(
            1,
            name1,
            LocalDate.of(2003, 06, 29),
            LocalDate.of(2003, 06, 29),
            52f,
            15.3f
        );

        Name name2 = new Name()
            .title("Mr.")
            .firstName("Justin")
            .lastName("Monreal");

        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(
            2,
            name2,
            LocalDate.of(2004, 10, 15),
            LocalDate.of(1995, 5, 25),
            55f,
            12.5f
        );

        Name name3 = new Name()
            .title("Mr.")
            .firstName("Phillip")
            .lastName("Enrique");

        CommissionEmployee emp3 = new CommissionEmployee(
            3, 
            name3, 
            LocalDate.of(2005, 8, 21),
            LocalDate.of(1990, 12, 10), 
            80000
        );

        Name name4 = new Name()
            .title("Dr.")
            .firstName("Robert")
            .lastName("Williams")
            .middleName("Lee")
            .suffix("Sr.");

        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(
            4, 
            name4,
            LocalDate.of(2006, 2, 10),
            LocalDate.of(2006, 1, 5), 
            90000,
            6000
        );

        roster.addEmployee(emp1);
        roster.addEmployee(emp2);
        roster.addEmployee(emp3);
        roster.addEmployee(emp4);

        roster.displayAllEmployees();

        roster.removeEmployee(2);

        roster.displayAllEmployees();

        EmployeeRoster searchResult = roster.searchEmployee("Karen");
        searchResult.displayAllEmployees();

        System.out.println("Hourly Employees: " + roster.countHourlyEmployee());
        System.out.println("Piece Worker Employees: " + roster.countPieceWorkerEmployee());
        System.out.println("Commission Employees: " + roster.countCommissionEmployee());
        System.out.println("Base Plus Commission Employees: " + roster.countBasePlusCommissionEmployee());

        Name updatedName = new Name()
            .title("Ms.")
            .firstName("Emily")
            .lastName("Anderson");

        HourlyEmployee updatedEmployee = new HourlyEmployee(
            1,
            updatedName, 
            LocalDate.of(2003, 06, 29),
            LocalDate.of(2003, 06, 29),
            55f, 
            16.5f
        );

        roster.updateEmployee(1, updatedEmployee);
        roster.displayAllEmployees();
    }
}
