import java.util.Scanner;

public class Practice {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        q1();
    }

    // 1. Check divisible by 5
    static void q1() {
        int n = sc.nextInt();
        if (n % 5 == 0)
            System.out.println("Is the number " + n + " divisible by 5? Yes");
        else
            System.out.println("Is the number " + n + " divisible by 5? No");
    }

    // 2. Check first number is smallest
    static void q2() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && a < c)
            System.out.println("Is the first number the smallest? Yes");
        else
            System.out.println("Is the first number the smallest? No");
    }

    // 3. Check which number is largest
    static void q3() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > a && c > b));
    }

    // 4. Natural number & sum
    static void q4() {
        int n = sc.nextInt();
        if (n >= 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // 5. Voting eligibility
    static void q5() {
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("The person's age is " + age + " and can vote.");
        else
            System.out.println("The person's age is " + age + " and cannot vote.");
    }

    // 6. Positive, negative or zero
    static void q6() {
        int n = sc.nextInt();
        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    // 7. Spring season
    static void q7() {
        int m = sc.nextInt();
        int d = sc.nextInt();
        if ((m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }

    // 8. Countdown using while
    static void q8() {
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }

    // 9. Countdown using for
    static void q9() {
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // 10. Sum until user enters 0
    static void q10() {
        double sum = 0;
        double x = sc.nextDouble();
        while (x != 0) {
            sum += x;
            x = sc.nextDouble();
        }
        System.out.println(sum);
    }

    // 11. Sum until 0 or negative using break
    static void q11() {
        double sum = 0;
        while (true) {
            double x = sc.nextDouble();
            if (x <= 0) break;
            sum += x;
        }
        System.out.println(sum);
    }

    // 12. Sum of n natural numbers using while & compare formula
    static void q12() {
        int n = sc.nextInt();
        if (n >= 0) {
            int sumWhile = 0, i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("While sum: " + sumWhile);
            System.out.println("Formula sum: " + sumFormula);
        }
    }

    // 13. Sum of n natural numbers using for
    static void q13() {
        int n = sc.nextInt();
        if (n >= 0) {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) sumFor += i;
            int sumFormula = n * (n + 1) / 2;
            System.out.println("For sum: " + sumFor);
            System.out.println("Formula sum: " + sumFormula);
        }
    }

    // 14. Factorial using while
    static void q14() {
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println(fact);
        }
    }

    // 15. Factorial using for
    static void q15() {
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println(fact);
        }
    }
}
