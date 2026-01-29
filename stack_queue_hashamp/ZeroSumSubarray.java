import java.util.*;
public class ZeroSumSubarray{
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Initialize with sum 0 at index -1 (handles subarrays starting at 0)
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum already exists, all subarrays from previous indices+1 to i sum to 0
            if (map.containsKey(sum)) {
                List<Integer> list = map.get(sum);
                for (Integer start : list) {
                    System.out.print("Subarray: [");
                    for (int k = start + 1; k <= i; k++) {
                        System.out.print(arr[k] + (k < i ? ", " : ""));
                    }
                    System.out.println("]");
                }
            }

            // Add current index to the map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -1, -3, 4};
        findZeroSumSubarrays(arr);
    }
}