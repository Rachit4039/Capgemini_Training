public class ReverseString {

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(); 
        sb.append(str);                        
        sb.reverse();                       
        return sb.toString();                   
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverse(input);
        System.out.println(output); 
    }
}
