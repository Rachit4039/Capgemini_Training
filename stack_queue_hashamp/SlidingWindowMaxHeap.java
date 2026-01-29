import java.util.*;

public class SlidingWindowMaxHeap {

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) return new int[0];

        int[] result = new int[n - k + 1];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        result[0] = pq.peek();

        for (int i = k; i < n; i++) {
            pq.remove(arr[i - k]);  
            pq.add(arr[i]);
            result[i - k + 1] = pq.peek();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] maxWindow = maxSlidingWindow(arr, k);
        for (int num : maxWindow) {
    System.out.print(num + " ");
}
    }
}
