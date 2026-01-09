

import java.util.*;

public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = String.join("-", s.split("\\s++"));

        System.out.println(result);
    }
}
