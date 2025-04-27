import java.util.*;

class SortArraySquares {
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        int k = n - 1;

        while (k >= 0) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];

            if (a > b) {
                result[k] = a;
                i++;
            } else {
                result[k] = b;
                j--;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
