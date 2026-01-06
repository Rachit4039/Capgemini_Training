import java.util.Scanner;

public class question_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] w = new double[n];
        double[] h = new double[n];
        double[] b = new double[n];
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextDouble();
            h[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            b[i] = w[i] / (h[i] * h[i]);

            if (b[i] < 18.5) {
                s[i] = "Underweight";
            } else if (b[i] < 25) {
                s[i] = "Normal";
            } else if (b[i] < 30) {
                s[i] = "Overweight";
            } else {
                s[i] = "Obese";
            }

            System.out.println(h[i] + " " + w[i] + " " + b[i] + " " + s[i]);
        }
    }
}
