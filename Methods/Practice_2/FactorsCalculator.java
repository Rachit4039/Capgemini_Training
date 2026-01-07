import java.util.Scanner;

class FactorsCalculator {
    static int[] findFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) c++;
        }

        int[] a = new int[c];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a[j] = i;
                j++;
            }
        }
        return a;
    }

    static int sum(int[] a) {
        int s = 0;
        for (int i : a) s += i;
        return s;
    }

    static long product(int[] a) {
        long p = 1;
        for (int i : a) p *= i;
        return p;
    }

    static int sumOfSquares(int[] a) {
        int s = 0;
        for (int i : a) s += Math.pow(i, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = findFactors(n);

        for (int i : a) System.out.print(i + " ");
        System.out.println();
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(sumOfSquares(a));
    }
}
