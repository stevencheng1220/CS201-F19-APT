import java.util.*;

public class AlphaPath {
    private int[][] grid;
    public String hasPath (String[] maze) {
        grid = new int[maze.length][maze[0].length()];
        int row = 0;
        int col = 0;
        for (int i = 0; i < maze.length; i += 1){
            for (int j = 0; j < maze[0].length(); j += 1){
                grid[i][j] = maze[i].charAt(j);
                if (grid[i][j] == 'A'){
                    row = i;
                    col = j;
                }
            }
        }
        if (path(row, col, 'A')){
            return "YES";
        }
        return "NO";
    }

    private boolean path (int row, int col, int target){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length){
            return false;
        }
        if (grid[row][col] == target){
            if (target == 'Z') return true;
            int next = target + 1;
            return path(row + 1, col, next) ||
                    path(row, col + 1, next) ||
                    path(row - 1, col, next) ||
                    path(row, col - 1, next);
        }
        return false;
    }
}

// First must build the 2x2 grid, which is done in hasPath.
// Also need to find the starting point, which we initialize as int row and int col ('A').
// Then, we create a helper method path that utilizes backtracking to continuously search the 2x2 grid for a
// continuous path.
// In every recursive call in path, we increment int target, which checks for the next alphabet.

