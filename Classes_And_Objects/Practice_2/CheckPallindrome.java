
public class CheckPallindrome {
    static class PalindromeChecker{
        static String text;

        boolean checkPall(String text){
            int a = 0;
            int b = text.length()-1;
            boolean flag = false;
            while(a<=b){
                if(text.charAt(a)!=text.charAt(b)){
                    flag = true;
                    break;
                }
                a++;
                b--;
            }
            return flag;
        }
    }

    public static void main(String args[]){
        PalindromeChecker p = new PalindromeChecker();
        if(p.checkPall("aba")){
            System.out.println("not PAll");
        }
        else{
            System.out.println("PAll");

        }

    }
}
