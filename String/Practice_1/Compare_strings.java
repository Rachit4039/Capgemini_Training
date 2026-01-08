import java.util.*;
public class Compare_strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if(compare(a,b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    static boolean compare(String a , String b){
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
