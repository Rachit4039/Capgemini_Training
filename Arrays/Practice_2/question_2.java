import java.util.Scanner;

public class question_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        double[] h = new double[3];
        String[] n = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            h[i] = sc.nextDouble();
        }

        int ya = a[0];
        double th = h[0];
        int yi = 0;
        int ti = 0;

        for (int i = 1; i < 3; i++) {
            if (a[i] < ya) {
                ya = a[i];
                yi = i;
            }
            if (h[i] > th) {
                th = h[i];
                ti = i;
            }
        }

        System.out.println(n[yi]);
        System.out.println(n[ti]);
    }
}
