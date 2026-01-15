public class Student_Report {
    static class Grade{
        private String name;
        private int rollNumber;
        private int marks;

        Grade(String name,int rollNumber,int marks){
            this.name = name;
            this.rollNumber=rollNumber;
            this.marks=marks;
        }
        String Gradez(int marks){
            if(marks>90 && marks<100){
                return "A";
            }
            else if(marks>80 && marks<90){
                return "B";
            }
            else if(marks>70 && marks<80){
                return "C";
            }
            else if(marks>60 && marks<70){
                return "D";
            }
            else{
                return "E";
            }
        }
        void display(){
            System.out.println("name is "+ name);
            System.out.println("rollnumber is "+ rollNumber);
            System.out.println("marks is "+ marks);
            System.out.println("Grade is "+ Gradez(marks));
        }
    }

    public static void main(String args[]){
        Grade g = new Grade("rachit", 2111, 92);
        g.display();
    }
}
