
class MinTimeToVisitAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int steps = 0;
        for (int i = 1; i < points.length; i++) {
            steps += Math.max(Math.abs(points[i][0] - points[i - 1][0]), 
                              Math.abs(points[i][1] - points[i - 1][1]));
        }
        return steps;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
