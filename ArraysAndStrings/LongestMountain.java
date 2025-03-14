class LongestMountain {
    public static int longestMountain(int[] arr) {
        int n = arr.length;
        int maxLength = 0;
        int i = 1;
        while (i < n - 1) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i - 1, right = i + 1;
                while (left > 0 && arr[left - 1] < arr[left]) left--;
                while (right < n - 1 && arr[right] > arr[right + 1]) right++;
                maxLength = Math.max(maxLength, right - left + 1);
                i = right;
            } else {
                i++;
            }
        }
        return maxLength >= 3 ? maxLength : 0;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        System.out.println(longestMountain(arr)); 
    }
}
