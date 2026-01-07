import java.util.Scanner;
// Chocolate Distribution (Quotient and Remainder)
class question_7 {
    static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] a = new int[2];
        a[0] = number / divisor;
        a[1] = number % divisor;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        int[] a = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
