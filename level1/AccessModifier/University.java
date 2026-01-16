package level1.AccessModifier;
public class University {

    static class Student {
        public int rollNumber;    
        protected String name;     
        private double cgpa;       

       
        Student(int r, String n, double c) {
            rollNumber = r;
            name = n;
            cgpa = c;
        }

        public double getCGPA() {
            return cgpa;
        }

        public void setCGPA(double c) {
            cgpa = c;
        }
    }

    static class PostgraduateStudent extends Student {

        PostgraduateStudent(int r, String n, double c) {
            super(r, n, c);
        }

        void show() {
            System.out.println(rollNumber);
            System.out.println(name);     
            System.out.println(getCGPA()); 
        }
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(1, "Rachit", 8.5);
        p.show();
        p.setCGPA(9.0);
        System.out.println(p.getCGPA());
    }
}
