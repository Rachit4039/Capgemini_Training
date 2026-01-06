import java.util.Scanner;

public class question_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxDigit = 10;
        int[] d = new int[maxDigit];
        int i = 0;

        while (n != 0) {

            if (i == maxDigit) {
                maxDigit += 10;
                int[] t = new int[maxDigit];
                for (int j = 0; j < d.length; j++) {
                    t[j] = d[j];
                }
                d = t;
            }

            d[i] = n % 10;
            n = n / 10;
            i++;
        }

        int l = 0, sl = 0;

        for (int j = 0; j < i; j++) {
            if (d[j] > l) {
                sl = l;
                l = d[j];
            } else if (d[j] > sl && d[j] != l) {
                sl = d[j];
            }
        }

        System.out.println(l);
        System.out.println(sl);
    }
}
