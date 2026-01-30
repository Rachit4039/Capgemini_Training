import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();    
        HashSet<Character> set = new HashSet<>();

        // Step 2
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                sb.append(ch);    
                set.add(ch);       
            }
        }

        return sb.toString();    
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println(output);
    }
}
