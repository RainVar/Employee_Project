package employee.version4;

import java.util.Arrays;

public class EmployeeRoster {

    private Employee[] empList;
    private int size = 100;
    private int count = 0;

    public EmployeeRoster() {
        empList = new Employee[size];
    }

    public EmployeeRoster(Employee[] empList) {
        this.empList = Arrays.copyOf(empList, size);
        count = empList.length;
    }

    public EmployeeRoster(Employee[] empList, int size) {
        this.size = size;
        this.empList = Arrays.copyOf(empList, size);
        count = empList.length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        empList = Arrays.copyOf(empList, size);
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = Arrays.copyOf(empList, size);
        count = empList.length;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void displayAllEmployees() {
        for (Employee emp : empList) {
            if (emp != null) {
                System.out.println(emp.toString());
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean addEmployee(Employee e) {
        if (count < size) {
            empList[count] = e;
            count++;
            System.out.println("EMPLOYEE " + e.getEmpName().getLastName() + " WITH ID #" + e.getEmpID() + " added");
            return true;
        } else {
            System.out.println("Roster is full.");
            return false;
        }
    }

    public Employee removeEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && id == empList[i].getEmpID()) {
                Employee removed = empList[i];

                for (int j = i; j < count - 1; j++) {
                    empList[j] = empList[j + 1];
                }

                empList[count - 1] = null;
                count--;
                return removed;
            }
        }
        System.out.println("Employee with ID #" + id + " is not found!");
        return null;
    }

    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster match = new EmployeeRoster();
        for (Employee employee : empList) {
            if (employee != null) {
                String empInfo = employee.getEmpName().toString().toLowerCase();
                String search = keyword.toLowerCase();

                if (empInfo.contains(search) || String.valueOf(employee.getEmpID()).contains(search)) {
                    match.addEmployee(employee);
                }
            }
        }
        return match;
    }

    public int countEmployeeByType(Class<? extends Employee> employeeType) {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employeeType.isInstance(employee)) {
                cnt++;
            }
        }
        return cnt;
    }

    public void displayEmployeeByType(Class<? extends Employee> employeeType) {
        String displayMessage = switch (employeeType.getSimpleName()) {
            case "HourlyEmployee" -> "Displaying Hourly Employees:";
            case "PieceWorkerEmployee" -> "Displaying Piece Worker Employees:";
            case "CommissionEmployee" -> "Displaying Commission Employees:";
            case "BasePlusCommissionEmployee" -> "Displaying Base Plus Commission Employees:";
            default -> "Unknown type";
        };

        System.out.println(displayMessage);

        for (Employee employee : empList) {
            if (employee != null && employeeType.isInstance(employee)) {
                System.out.println(employee.toString());
                System.out.println();
            }
        }
    }

    public boolean updateEmpInfo(int id, String prefix, String firstName, String middleName, String lastName, String suffix) {
        for (Employee employee : empList) {
            if (employee != null && id == employee.getEmpID()) {
                Name empName = employee.getEmpName();
                if (prefix != null) {
                    empName.setTitle(prefix);
                }
                if (firstName != null) {
                    empName.setFirstName(firstName);
                }
                if (middleName != null) {
                    empName.setMiddleName(middleName);
                }
                if (lastName != null) {
                    empName.setLastName(lastName);
                }
                if (suffix != null) {
                    empName.setSuffix(suffix);
                }
                System.out.println("Name updated for Employee #" + id);
                return true;
            }
        }
        System.out.println("Employee #" + id + " does not exist!");
        return false;
    }
}
