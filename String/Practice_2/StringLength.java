import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;

        try {
          
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        System.out.println("Length without length(): " + count);
        System.out.println("Length using length(): " + s.length());

        sc.close();
    }
}
