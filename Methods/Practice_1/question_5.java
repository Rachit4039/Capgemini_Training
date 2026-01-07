import java.util.Scanner;
//greatest and smallest of 3 numbers
class question_5 {
    static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] a = new int[2];
        int min = number1;
        int max = number1;

        if (number2 < min) min = number2;
        if (number3 < min) min = number3;

        if (number2 > max) max = number2;
        if (number3 > max) max = number3;

        a[0] = min;
        a[1] = max;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] a = findSmallestAndLargest(n1, n2, n3);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
