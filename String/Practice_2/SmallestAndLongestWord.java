import java.util.*;

public class SmallestAndLongestWord {
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
        LinkedHashMap<String , Integer>hs = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],len[i]);
        }
        String longest = arr[0];
        String smallest = arr[0];
        int maxLen = len[0];
        int minLen = len[0];

        for (int i = 1; i < arr.length; i++) {
            if (len[i] > maxLen) {
                maxLen = len[i];
                longest = arr[i];
            }
            if (len[i] < minLen) {
                minLen = len[i];
                smallest = arr[i];
            }
        }

        System.out.println("Longest word " + longest + " " + maxLen );
        System.out.println("Smallest word " + smallest + " " + minLen );

    }
}
