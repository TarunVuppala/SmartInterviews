import java.util.*;
class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        int r = matrix.length, c = matrix[0].length;
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) 
                result.add(matrix[top][j]);
            top++;
            for (int i = top; i <= bottom; i++) 
                result.add(matrix[i][right]);
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) 
                    result.add(matrix[bottom][j]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) 
                    result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix)); 
    }
}
