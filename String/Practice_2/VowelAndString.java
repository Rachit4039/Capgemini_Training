
import java.util.*;

public class VowelAndString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr[] = s.toCharArray();
        int v=0;
        int c=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        

        
        System.out.println("vowel " + v );
        System.out.println("consonent " + c );

    }
}
