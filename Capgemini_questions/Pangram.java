import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine().toLowerCase();

        boolean[] arr = new boolean[26];

        for (int i = 0; i < ans.length(); i++) {
            char ch = ans.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a'] = true;
            }
        }

        boolean isPan= true;
        for (int i = 0; i < 26; i++) {
            if (!arr[i]) {
                isPan = false;
                break;
            }
        }

        if (isPan) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
