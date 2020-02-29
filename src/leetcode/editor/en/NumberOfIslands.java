//Given a 2d grid map of '1's (land) and '0's (water), count the number of islan
//ds. An island is surrounded by water and is formed by connecting adjacent lands 
//horizontally or vertically. You may assume all four edges of the grid are all su
//rrounded by water. 
//
// Example 1: 
//
// 
//Input:
//11110
//11010
//11000
//00000
//
//Output: 1
// 
//
// Example 2: 
//
// 
//Input:
//11000
//11000
//00100
//00011
//
//Output: 3
// Related Topics Depth-first Search Breadth-first Search Union Find


package leetcode.editor.en;
public class NumberOfIslands {
  public static void main(String[] args) {
       Solution solution = new NumberOfIslands().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int n;
    private int m;

    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == '1') {
                    DFS(grid, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    private void DFS(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFS(grid, i + 1, j);
        DFS(grid, i - 1, j);
        DFS(grid, i, j + 1);
        DFS(grid, i, j - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}