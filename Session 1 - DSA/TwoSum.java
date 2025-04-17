
import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter target sum: ");
            int target = sc.nextInt();

            int[] resultBF = twoSumBF(arr, target);
            System.out.println("Brute Force Approach => " + Arrays.toString(resultBF) + " | TC: O(n^2), SC: O(1)");

            int[] resultBetter = twoSumBetter(arr, target);
            System.out.println("HashMap Approach => " + Arrays.toString(resultBetter) + " | TC: O(n), SC: O(n)");

            int[] sorted = Arrays.copyOf(arr, arr.length);
            Arrays.sort(sorted);
            int[] resultOptimal = twoSumOptimal(sorted, target);
            System.out.println("Two Pointer Approach (on sorted array) => " + Arrays.toString(resultOptimal) + " | TC: O(n log n) (sort) + O(n), SC: O(1)");
        }
    }

    public static int[] twoSumBF(int[] a, int target) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumBetter(int[] a, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int rem = target - a[i];
            if (hm.containsKey(rem)) {
                return new int[]{hm.get(rem), i};
            }
            hm.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumOptimal(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int sum = a[l] + a[r];
            if (sum == target) {
                return new int[]{l, r};
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{-1, -1};
    }
}
