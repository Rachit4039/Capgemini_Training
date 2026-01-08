import java.util.Scanner;

public class charFrequency {

    static int[][] getFreq(String s) {
        int[] f = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            f[c]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (f[i] > 0) {
                count++;
            }
        }

        int[][] r = new int[count][2];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (f[c] > 0) {
                r[k][0] = c;
                r[k][1] = f[c];
                f[c] = 0;
                k++;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[][] r = getFreq(s);
        for (int i = 0; i < r.length; i++) {
            System.out.println((char) r[i][0] + " " + r[i][1]);
        }

        sc.close();
    }
}
