public class Solution {
    private int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int INF = 2147483647;

    public void islandsAndTreasure(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        java.util.Queue<int[]> queue = new java.util.LinkedList<>();

        // Step 1: Push all treasure chests (0) into the queue as starting points
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == 0) {
                    queue.add(new int[]{r, c});
                }
            }
        }

        // Step 2: Perform Multi-Source BFS outward from all 0s simultaneously
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            for (int[] dir : directions) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                // If the neighbor is within bounds and is an empty land cell (INF)
                if (nr >= 0 && nr < ROWS && nc >= 0 && nc < COLS && grid[nr][nc] == INF) {
                    grid[nr][nc] = grid[row][col] + 1;
                    queue.add(new int[]{nr, nc});
                }
            }
        }
    }
}