import java.util.*;

public class RotatedSorted {

    // Binary search to find rotation point
    static int findRotationIndex(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        if (arr[left] <= arr[right]) return 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (arr[mid] >= arr[0]) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findRotationIndex(arr);
        System.out.println("Index of smallest element: " + index);

        sc.close();
    }
}
