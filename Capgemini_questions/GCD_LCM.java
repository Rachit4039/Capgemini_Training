import java.util.*;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  =sc.nextInt();
        int b  =sc.nextInt();
        int m = Math.max(a,b);
        int p = a*b;
        int lcm = 0;
        for(int i=m;i<=p;i++){
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
        }
        int min = Math.min(a,b);
        System.out.println(lcm);
        int hcf = 0;
        for(int i=min;i>0;i--){
            if(a%i==0 && b%i==0){
                hcf = i;
                break;
            }
        }
        System.out.print(hcf);

    }
}
