import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); 

        list.add("Hello");
        list.add(100);

        String s = (String) list.get(1); 
        System.out.println(s);
    }
}
