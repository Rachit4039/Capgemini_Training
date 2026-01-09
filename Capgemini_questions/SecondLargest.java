import java.util.*;

public class SecondLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l =arr[0];
        int sl =arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl){
                sl=arr[i];
            }
        }
        System.out.print(sl);
    }
}
