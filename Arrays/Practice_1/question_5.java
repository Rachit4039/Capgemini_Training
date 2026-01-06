import java.util.Scanner;

public class question_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[4];
        int k = 0;

        for (int i = 6; i <= 9; i++) {
            a[k] = n * i;
            k++;
        }

        k = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + a[k]);
            k++;
        }
    }
}
