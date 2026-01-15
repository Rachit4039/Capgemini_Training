public class Employee_Detail {

    static class Employee {
        String name;
        int id;
        int salary;

        Employee(String name, int id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void display() {
            System.out.println("Name is " + name);
            System.out.println("Id is " + id);
            System.out.println("Salary is " + salary);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rachit", 2111, 45000);
        e1.display();
    }
}
