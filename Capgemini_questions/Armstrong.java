import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int co=0;
        int c = n;
        while(n>0){
            co++;
            n=n/10;
        }
        int arr[] = new int[co];
        n=c;
        int a=0;
        while(n>0){
            int temp = n%10;
            arr[a++]=temp;
            n=n/10;
        }
        int sum=0;
        for(int i=0;i<co;i++){
            sum+=Math.pow(arr[i],co);
        }

        if(sum==c){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
