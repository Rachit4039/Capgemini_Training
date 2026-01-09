import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        for (int i = s; i <= e; i++) {

            if (i < 2) continue;

            boolean isP = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isP = false;
                    break;
                }
            }

            if (isP) {
                System.out.print(i + " ");
            }
        }
    }
}
