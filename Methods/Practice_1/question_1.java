import java.util.Scanner;
// Simple Interest Calculation
class question_1 {
    static double si(double p, double r, double t) {
        return p * r * t / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double s = si(p, r, t);
        System.out.println("The Simple Interest is " + s + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}
