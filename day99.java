class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        // Directions for moving in 8 possible ways (horizontal, vertical, and diagonal)
        int[][] directions = {
            {0, 1},  // Right
            {1, 0},  // Down
            {0, -1}, // Left
            {-1, 0}, // Up
            {1, 1},  // Down-Right
            {1, -1}, // Down-Left
            {-1, 1}, // Up-Right
            {-1, -1} // Up-Left
        };

        // Iterate through the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If we find a land cell that hasn't been visited
                if (grid[i][j] == '1' && !visited[i][j]) {
                    // Start a DFS to mark all connected lands
                    dfs(grid, visited, i, j, directions);
                    // Increase the count of islands
                    count++;
                }
            }
        }

        return count;
    }

    // DFS function to mark all lands connected to the current land
    private void dfs(char[][] grid, boolean[][] visited, int i, int j, int[][] directions) {
        // Mark the current cell as visited
        visited[i][j] = true;

        // Explore all 8 directions
        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];

            // Check if the new position is within bounds and is a land cell that hasn't been visited
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && 
                grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                dfs(grid, visited, newRow, newCol, directions);
            }
        }
    }
}
