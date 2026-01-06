import java.util.Scanner;

public class question_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        double t = 0.0;
        int i = 0;

        while (true) {
            double n = sc.nextDouble();

            if (n <= 0 || i == 10) {
                break;
            }

            a[i] = n;
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(a[j]);
            t = t + a[j];
        }

        System.out.println("Total = " + t);
    }
}
