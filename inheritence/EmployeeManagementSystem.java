public class EmployeeManagementSystem {
    static class Employee {
        protected String name;
        protected int id;
        protected int salary;

        Employee(String name, int id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        protected void displayDetails() {
            System.out.println( name);
            System.out.println( id);
            System.out.println( salary);
        }
    }

    static class Manager extends Employee {
        private int teamSize;

        Manager(String name, int id, int salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        @Override
        protected void displayDetails() {
            super.displayDetails();
            System.out.println( teamSize);
        }
    }

    static class Developer extends Employee {
        private String programmingLanguage;

        Developer(String name, int id, int salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        @Override
        protected void displayDetails() {
            super.displayDetails();
            System.out.println(programmingLanguage);
        }
    }

    static class Intern extends Employee {
        private int internshipDuration; 

        Intern(String name, int id, int salary, int internshipDuration) {
            super(name, id, salary);
            this.internshipDuration = internshipDuration;
        }

        @Override
        protected void displayDetails() {
            super.displayDetails();
            System.out.println(internshipDuration);
        }
    }

    public static void main(String[] args) {

        Employee m = new Manager("Rachit", 101, 60000, 5);
        Employee d = new Developer("Aman", 102, 50000, "Java");
        Employee i = new Intern("Neha", 103, 15000, 6);

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
