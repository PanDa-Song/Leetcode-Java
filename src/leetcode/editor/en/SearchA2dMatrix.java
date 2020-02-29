//Write an efficient algorithm that searches for a value in an m x n matrix. Thi
//s matrix has the following properties: 
//
// 
// Integers in each row are sorted from left to right. 
// The first integer of each row is greater than the last integer of the previou
//s row. 
// 
//
// Example 1: 
//
// 
//Input:
//matrix = [
//  [1,   3,  5,  7],
//  [10, 11, 16, 20],
//  [23, 30, 34, 50]
//]
//target = 3
//Output: true
// 
//
// Example 2: 
//
// 
//Input:
//matrix = [
//  [1,   3,  5,  7],
//  [10, 11, 16, 20],
//  [23, 30, 34, 50]
//]
//target = 13
//Output: false 
// Related Topics Array Binary Search


package leetcode.editor.en;
public class SearchA2dMatrix {
  public static void main(String[] args) {
       Solution solution = new SearchA2dMatrix().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null
          || matrix.length == 0
          || matrix[0] == null
          || matrix[0].length == 0)
            return false;
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] > target) {
                    j--;
                } else {
                    i++;
                }
            }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}