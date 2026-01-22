import java.util.ArrayList;

public class CompanyEmployee {
    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        Department it = new Department("IT");
        Department hr = new Department("HR");

        it.addEmployee("Rachit");
        it.addEmployee("Amit");
        hr.addEmployee("Neha");

        company.departments.add(it);
        company.departments.add(hr);

        company = null;

        System.out.println("Company deleted");
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}
