package level1.Constructors;
public class Circle {
    static class circle_java {
        private int radius;

        circle_java() {
        System.out.println("Default constructor called");
        }

        circle_java(int radius) {
            this();
            this.radius = radius;
            System.out.println("Parameterized constructor called");
        }
    }

    public static void main(String[] args) {
        circle_java c = new circle_java(5);
    }
}
