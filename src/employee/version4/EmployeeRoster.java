package employee.version4;

public class EmployeeRoster {
    private Employee empList[];
    private int max;
    private int count;
    
     public EmployeeRoster() {
        this.max = 10;
        this.empList = new Employee[max];
        this.count = 0;
    }
     
    public EmployeeRoster(int max) {
        this.empList = new Employee[max];
        this.max = max;
        this.count = 0;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public boolean addEmployee(Employee emp) {
        if (count < max) {
            empList[count] = emp;
            count++;
            System.out.println("Succesfully Added");
            return true;
        }
        else {
            System.out.println("Roster is Full");
            return false;
        }
    }
    
    public boolean removeEmployee(int empID) {
        for (int x = 0; x < count; x++) {
            if (empList[x] != null && empList[x].getEmpID() == empID) {
                System.out.println("Succesfully Removed");
                empList[x] = null;
                empList[x] = empList[count - 1];
                empList[count - 1] = null;
                count--;
                return true;
            }
        } 
        System.out.println("ID not found");
        return false;
    }
    
    public boolean updateEmployee(int empID, Employee updatedEmployee) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpID() == empID) {
                empList[i] = updatedEmployee;
                return true;
            }
        }
        return false;
    }
    
    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster matchingEmployee = new EmployeeRoster();
        String search = keyword.toLowerCase();
        for (Employee employee : empList) {
            if (employee != null) {
                String empName = employee.getEmpName().toString().toLowerCase();
                String empIdString = String.valueOf(employee.getEmpID());

                if (empName.contains(search) || empIdString.contains(search)) {
                    matchingEmployee.addEmployee(employee);
                }
            }
        }
        return matchingEmployee;
    }
    
    public int countHourlyEmployee() {
        int HourlyEmployeeCount = 0;
        for(Employee emp : empList) {
            if(emp instanceof HourlyEmployee) {
                HourlyEmployeeCount++;
            }
        }
        return HourlyEmployeeCount;
    }

    public int countPieceWorkerEmployee() {
        int PieceWorkerEmployeeCount = 0;
        for(Employee emp : empList) {
            if(emp instanceof PieceWorkerEmployee){
                PieceWorkerEmployeeCount++;
            }
        }
        return PieceWorkerEmployeeCount;
    }

    public int countCommissionEmployee() {
        int CommissionEmployeeCount = 0;
        for(Employee emp : empList) {
            if(emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)) {
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
        ///System.out.println("\n\n\n");
        System.out.printf("%-4s|\t%-40s|\t%-25s|\t%-15s\n", "ID", "Name", "Type", "Salary");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (Employee emp : empList) {
            if (emp != null) {
                String type = "";
                double salary = 0;
                if (emp instanceof HourlyEmployee) {
                    type = "Hourly";
                    salary = ((HourlyEmployee) emp).computeSalary();
                } else if (emp instanceof PieceWorkerEmployee) {
                    type = "Piece Worker";
                    salary = ((PieceWorkerEmployee) emp).computeSalary();
                } else if (emp instanceof BasePlusCommissionEmployee) {
                    type = "Base Plus Commission";
                    salary = ((BasePlusCommissionEmployee)emp).computeSalary();
                } else if (emp instanceof CommissionEmployee) {
                    type = "Commission";
                    salary = ((CommissionEmployee) emp).computeSalary();
                }

                System.out.printf("%-4d|\t%-40s|\t%-25s|\tPhp %-10.2f\n", emp.getEmpID(), emp.getEmpName(), type, salary);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
}