import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (0 to n, one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missingXOR = missingNumber(nums);
        System.out.println("The missing number is: " + missingXOR);
        sc.close();
    }
    static int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}