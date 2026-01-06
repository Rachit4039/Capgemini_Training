import java.util.Scanner;

public class question_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] s = new double[10];
        double[] y = new double[10];
        double[] b = new double[10];
        double[] n = new double[10];

        double tb = 0, tos = 0, tns = 0;

        for (int i = 0; i < 10; i++) {
            s[i] = sc.nextDouble();
            y[i] = sc.nextDouble();

            if (s[i] <= 0 || y[i] < 0) {
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {

            if (y[i] > 5) {
                b[i] = s[i] * 0.05;
            } else {
                b[i] = s[i] * 0.02;
            }

            n[i] = s[i] + b[i];

            tb += b[i];
            tos += s[i];
            tns += n[i];
        }

        System.out.println(tb);
        System.out.println(tos);
        System.out.println(tns);
    }
}
