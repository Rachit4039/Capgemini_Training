import java.util.*;

public class WordLengthCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        int len[] = new int[arr.length];
        int a = 0;

        for(int i=0;i<arr.length;i++)
        {
            len[a++] = arr[i].length();
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+len[i]);
        }
    }
}
