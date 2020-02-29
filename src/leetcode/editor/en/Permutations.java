//Given a collection of distinct integers, return all possible permutations. 
//
// Example: 
//
// 
//Input: [1,2,3]
//Output:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
// 
// Related Topics Backtracking


package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
  public static void main(String[] args) {
       Solution solution = new Permutations().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, 0, nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, int start, int[] nums) {
        if (start == nums.length) {
            List<Integer> tempList = new ArrayList<>();
            for (int num : nums) {
                tempList.add(num);
            }
            list.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < nums.length; i++){
            swap(nums,start,i);
            backtrack(list,start + 1, nums);
            swap(nums,start,i);
        }
    }
    private void swap(int[] nums, int m, int n) {
            int temp = nums[m];
            nums[m] = nums[n];
            nums[n] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}