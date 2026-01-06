import java.util.Scanner;

public class question_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] h = new double[11];
        double s = 0;

        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextDouble();
            s = s + h[i];
        }

        double m = s / 11;
        System.out.println(m);
    }
}
