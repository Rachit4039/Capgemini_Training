package Practice_folder_2;

import java.util.Scanner;

public class question_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " Even number");
                } else {
                    System.out.println(i + " Odd number");
                }
            }

    }
}
