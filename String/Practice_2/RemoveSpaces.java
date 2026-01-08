import java.util.Scanner;

public class RemoveSpaces {
    
    public static String trimManual(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str =sc.nextLine();
        String builtIn = str.trim();
        System.out.println("Built-in '" + builtIn + "'");
  
        String manual = trimManual(str);
        System.out.println("Manual '" + manual + "'");
    }
}
