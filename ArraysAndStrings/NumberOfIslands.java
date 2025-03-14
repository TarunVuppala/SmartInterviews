class NumberOfIslands {
    public static void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0')
            return;

        grid[i][j] = '0'; 

        
        dfs(grid, i + 1, j); 
        dfs(grid, i - 1, j); 
        dfs(grid, i, j + 1); 
        dfs(grid, i, j - 1); 
    }

    public static int numIslands(char[][] grid) {
        int islands = 0;
        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    islands++;  
                    dfs(grid, i, j);  
                }
            }
        }

        return islands;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid)); 
    }
}
