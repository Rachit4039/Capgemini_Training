package Practice_folder_2;

import java.util.Scanner;

public class question_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Amar age: ");
        int amarA = sc.nextInt();

        System.out.print("Akbar age: ");
        int akbarA = sc.nextInt();

        System.out.print("Anthony age: ");
        int anthonyA = sc.nextInt();


        System.out.print("Amar height: ");
        int hAmar = sc.nextInt();

        System.out.print("Akbar height: ");
        int hAkbar = sc.nextInt();

        System.out.print("Anthony height: ");
        int hAnthony = sc.nextInt();


        if (amarA <= akbarA && amarA <= anthonyA) {
            System.out.println("Amar is the youngest");
        } else if (akbarA <= amarA && akbarA <= anthonyA) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }


        if (hAmar >= hAkbar && hAmar >= hAnthony) {
            System.out.println("Amar is the tallest");
        } else if (hAkbar >= hAmar && hAkbar >= hAnthony) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }

        sc.close();
    }
}
