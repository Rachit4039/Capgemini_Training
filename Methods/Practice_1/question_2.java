import java.util.Scanner;
// Maximum Number of Handshakes
class question_2 {
    static int count(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
