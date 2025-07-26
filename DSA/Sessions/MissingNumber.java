// https://leetcode.com/problems/missing-number/
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array (n): ");
            int n = sc.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter " + n + " numbers (from 0 to n, one missing):");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println("\nMissing Number Results:");
            System.out.println("Brute Force     => " + missingNumberBF(nums) + " | TC: O(n^2), SC: O(1)");
            System.out.println("XOR Approach    => " + missingNumberXOR(nums) + " | TC: O(n), SC: O(1)");
            System.out.println("Sum Approach    => " + missingNumberSUM(nums) + " | TC: O(n), SC: O(1)");
        }
    }

    public static int missingNumberBF(int[] nums) {
        int len = nums.length;
        for (int i = 0; i <= len; i++) {
            boolean f = false;
            for (int j = 0; j < len; j++) {
                if (i == nums[j]) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumberSUM(int[] nums) {
        int n = nums.length, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (n * (n + 1)) / 2 - sum;
    }

    public static int missingNumberXOR(int[] nums) {
        int xor = 0, n = nums.length;
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
