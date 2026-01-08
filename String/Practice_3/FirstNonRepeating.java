import java.util.Scanner;

public class FirstNonRepeating {

    static char firstNonRepeat(String s) {
        int[] f = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            f[c]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (f[c] == 1) {
                return c;
            }
        }

        return 'n';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char r = firstNonRepeat(s);

        if (r != 'n') {
            System.out.println("First non-repeating character is " + r);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}
