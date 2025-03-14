import java.util.*;

class NumbersSmallerThanCurrent {
    static List<Integer> smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < sortedNums.length; i++) {
            countMap.putIfAbsent(sortedNums[i], i); // Store index only the first time
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(countMap.get(num));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(smallerNumbersThanCurrent(nums));
    }
}
