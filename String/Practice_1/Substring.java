import java.util.*;

public class Substring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int s =sc.nextInt();
         int e=sc.nextInt();


        System.out.print(createsub(a,s,e));
          
    }

    public static String createsub(String a,int s,int e){
        StringBuilder sb = new StringBuilder();
        for(int i=s;i<e;i++){
            sb.append(a.charAt(i));
        }
        return sb.toString();
    }
}
