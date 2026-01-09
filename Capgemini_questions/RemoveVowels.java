import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder r = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!isV(ch)) {
                r.append(ch);
            }
        }

        System.out.println(r.toString());
    }

    static boolean isV(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}
