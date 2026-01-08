import java.util.Scanner;

public class SplitIntoWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        int c = 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }

        String[] arr = new String[c];

        int start = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                arr[t++] = s.substring(start, i);
                start = i + 1;
            }
        }

        arr[t] = s.substring(start, n);
        System.out.println("Word count: " + c);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
