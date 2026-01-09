import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {

            if (n < 2) continue;

            boolean flag = false;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = true;  
                    break;
                }
            }

            if (!flag) {
                System.out.print(n + " ");
            }
        }
    }
}
