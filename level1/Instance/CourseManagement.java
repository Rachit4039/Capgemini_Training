package level1.Instance;

public class CourseManagement {
    public static class Course{

        private String courseName;
        private int duration;
        private int fees;

        Course(String courseName,int duration,int fees){
            this.courseName=courseName;
            this.duration=duration;
            this.fees=fees;
        }
        static String instituteName = "Chitkara";

        void displayCourseDetails(){
            System.out.println(courseName);
            System.out.println(duration);
            System.out.println(fees);
        }

        static void updateInstituteName( String newInstituteName){
            instituteName=newInstituteName;
            System.out.println(instituteName);

        }
    }

    public static void main(String[] args) {
        Course c = new Course("math",2,3);
        c.displayCourseDetails();
        Course.updateInstituteName("Thapar");
    }
}
