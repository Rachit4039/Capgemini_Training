import java.util.Scanner;

public class question_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] o = new int[n / 2 + 1];
        int[] e = new int[n / 2 + 1];
        int oi = 0, ei = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                e[ei] = i;
                ei++;
            } else {
                o[oi] = i;
                oi++;
            }
        }

        System.out.println("Odd numbers");
        for (int i = 0; i < oi; i++) {
            System.out.print(o[i] + " ");
        }

        System.out.println("\nEven numbers");
        for (int i = 0; i < ei; i++) {
            System.out.print(e[i] + " ");
        }
    }
}
