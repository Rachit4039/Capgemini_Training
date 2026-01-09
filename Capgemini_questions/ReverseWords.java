import java.util.*;

public class ReverseWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            ans.append(sb);
            ans.append(" ");
        }
        
        System.out.print(ans.toString().trim());
    }
}
