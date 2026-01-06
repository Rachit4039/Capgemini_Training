package Practice_folder_2;

import java.util.Scanner;

public class question_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number ");
        int n = sc.nextInt();

        // Multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }
}
