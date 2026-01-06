package Practice_folder_2;

import java.util.Scanner;

public class question_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("salary");
        double salary = sc.nextDouble();

        System.out.print("years");
        int years = sc.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
            System.out.println(bonus);
        } else {
            System.out.println("No bonus");
        }


    }
}
