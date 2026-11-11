public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int maxArea = 0;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, r, c));
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int r, int c) {
        // Base case: boundary check or water/already-visited cell
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }

        // Mark cell as visited by sinking the land
        grid[r][c] = 0;

        // Count current cell (1) + explore all 4 adjacent directions recursively
        return 1 
            + dfs(grid, r + 1, c)   // Down
            + dfs(grid, r - 1, c)   // Up
            + dfs(grid, r, c + 1)   // Right
            + dfs(grid, r, c - 1);  // Left
    }
}