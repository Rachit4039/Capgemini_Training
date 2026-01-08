import java.util.Scanner;

public class Unique_Char {

    static int findLength(String s) {
        int n = 0;
        try {
            while (true) {
                s.charAt(n);
                n++;
            }
        } catch (Exception e) {
        }
        return n;
    }

    static char[] findUniqueOnce(String s) {
        int n = findLength(s);
        char[] a = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (c == s.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                a[k] = c;
                k++;
            }
        }

        char[] b = new char[k];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] r = findUniqueOnce(s);

        for (char c : r) {
            System.out.print(c + " ");
        }

    }
}
