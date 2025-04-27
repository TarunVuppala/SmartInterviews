import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        
        int[] result = twoSum(arr, target);
        System.out.println("Result: " + Arrays.toString(result));
        
        sc.close();
    }
    static int[] twoSum(int[] a, int target) {
        int n = a.length;
        int l = 0, r = n - 1;
        int res[] = new int[2];
        while (l < r) {
            if (a[l] + a[r] == target) {
                res[0] = l;
                res[1] = r;
                return res; 
            } else if (a[l] + a[r] > target) {
                r--; 
            } else {
                l++; 
            }
        }
        return res;
    }
}