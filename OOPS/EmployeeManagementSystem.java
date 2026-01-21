public class EmployeeManagementSystem {
    static abstract class Employee{
        protected int employeeId;
        protected String name;
        protected int baseSalary;
        private int hours;

        protected int getHours() {
            return hours;
        }

        protected void setHours(int hours) {
            this.hours = hours;
        }
        Employee(int employeeId,String name,int baseSalary){
            this.employeeId=employeeId;
            this.name=name;
            this.baseSalary=baseSalary;
        }
        abstract void calculateSalary();
        
        void displayDetails(){
            System.out.println(employeeId);
            System.out.println(name);
            System.out.println(baseSalary);
        }

    }

    static class FullTimeEmployee extends Employee{
        FullTimeEmployee(int employeeId,String name,int baseSalary){
            super(employeeId,name,baseSalary);
        }
         void calculateSalary(){
            int salary = baseSalary * getHours(); 
            System.out.println("Salary: " + salary);
        }
    }

    static class PartTimeEmployee extends Employee{
        PartTimeEmployee(int employeeId,String name,int baseSalary){
            super(employeeId,name,baseSalary);
        }
        void calculateSalary(){
            int salary = baseSalary * getHours(); 
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        PartTimeEmployee p = new PartTimeEmployee(11, "rachit", 4000);
        p.calculateSalary();
        p.displayDetails();
    }
}
