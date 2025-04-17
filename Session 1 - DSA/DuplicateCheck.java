import java.util.*;

public class DuplicateCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] nums = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            System.out.println("Brute Force => " + containsDuplicateBF(nums) + " | TC: O(n^2), SC: O(1)");
            System.out.println("Optimal (HashSet) => " + containsDuplicateOptimal(nums) + " | TC: O(n), SC: O(n)");
        }
    }

    public static boolean containsDuplicateBF(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateOptimal(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
}
