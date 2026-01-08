import java.util.Scanner;

public class ArrayCompare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char arr[] = a.toCharArray();
        char arr2[] = new char[a.length()];

        for(int i=0;i<a.length();i++){
            arr2[i]=a.charAt(i);
        }

        if(arr.length!=arr2.length){
            System.out.print("Not same");
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                System.out.print("Not same");
                break;
            }
        }
        System.out.print("Same");
    }
}
