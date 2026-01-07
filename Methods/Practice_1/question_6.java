import java.util.Scanner;
// Sum of N Natural Numbers
class question_6 {
    static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
