package employee.version6;

import java.util.List;
import java.util.ArrayList;

public class EmployeeRoster {

    private List<Employee> empList;

    public EmployeeRoster() {
        empList = new ArrayList<>();
    }

    public EmployeeRoster(List<Employee> empList) {
        this.empList = empList;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public boolean addEmployee(Employee emp) {
        empList.add(emp);
        System.out.println("Successfully Added");
        return true;
    }

    public boolean removeEmployee(int empID) {
        for (Employee emp : empList) {
            if (emp.getEmpID() == empID) {
                empList.remove(emp);
                System.out.println("Successfully Removed");
                return true;
            }
        }
        System.out.println("ID not found");
        return false;
    }

    public boolean updateEmployee(int empID, Employee updatedEmployee) {
        for (int i = 0; i < empList.size(); i++) {
            Employee emp = empList.get(i);
            if (emp.getEmpID() == empID) {
                empList.set(i, updatedEmployee);
                return true;
            }
        }
        return false;
    }

    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster matchingEmployee = new EmployeeRoster();
        String search = keyword.toLowerCase();
        for (Employee employee : empList) {
            String empName = employee.getEmpName().getFirstName().toLowerCase(); // Extract the first name and convert to lowercase
            String empIdString = String.valueOf(employee.getEmpID());

            if (empName.contains(search) || empIdString.contains(search)) {
                matchingEmployee.addEmployee(employee);
            }
        }
        return matchingEmployee;
    }

    public int countHourlyEmployee() {
        int HourlyEmployeeCount = 0;
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                HourlyEmployeeCount++;
            }
        }
        return HourlyEmployeeCount;
    }

    public int countPieceWorkerEmployee() {
        int PieceWorkerEmployeeCount = 0;
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                PieceWorkerEmployeeCount++;
            }
        }
        return PieceWorkerEmployeeCount;
    }

    public int countCommissionEmployee() {
        int CommissionEmployeeCount = 0;
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)) {
                CommissionEmployeeCount++;
            }
        }
        return CommissionEmployeeCount;
    }

    public int countBasePlusCommissionEmployee() {
        int BasePlusCommissionCount = 0;
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionCount++;
            }
        }
        return BasePlusCommissionCount;
    }

    public void displayAllEmployees() {
        System.out.printf("%-4s|\t%-40s|\t%-25s|\t%-15s\n", "ID", "Name", "Type", "Salary");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (Employee emp : empList) {
            String type = "";
            if (emp instanceof HourlyEmployee) {
                type = "Hourly";
            } else if (emp instanceof PieceWorkerEmployee) {
                type = "Piece Worker";
            } else if (emp instanceof BasePlusCommissionEmployee) {
                type = "Base Plus Commission";
            } else if (emp instanceof CommissionEmployee) {
                type = "Commission";
            }

            System.out.printf("%-4d|\t%-40s|\t%-25s|\tPhp %-10.2f\n", emp.getEmpID(), emp.getEmpName(), type, emp.computeSalary());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
}
