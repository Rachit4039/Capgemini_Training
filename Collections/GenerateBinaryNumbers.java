import java.util.*;

public class GenerateBinaryNumbers {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < N; i++) {
            String front = q.remove();
            result.add(front);

            q.add(front + "0");
            q.add(front + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println(binaryNumbers);
    }
}
