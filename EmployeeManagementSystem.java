import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(1, "A", 10000));
        employees.add(new Employee(2, "B", 5000));
        employees.add(new Employee(3, "C", 6000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
