import java.util.Scanner;

class NaturalNumberSum {

    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;

        int a = recursiveSum(n);
        int b = formulaSum(n);

        System.out.println(a);
        System.out.println(b);
    }
}
