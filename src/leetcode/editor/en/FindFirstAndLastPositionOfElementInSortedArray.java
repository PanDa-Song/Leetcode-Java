//Given an array of integers nums sorted in ascending order, find the starting a
//nd ending position of a given target value. 
//
// Your algorithm's runtime complexity must be in the order of O(log n). 
//
// If the target is not found in the array, return [-1, -1]. 
//
// Example 1: 
//
// 
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4] 
//
// Example 2: 
//
// 
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1] 
// Related Topics Array Binary Search


package leetcode.editor.en;
public class FindFirstAndLastPositionOfElementInSortedArray {
  public static void main(String[] args) {
       Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return new int[]{-1, -1};

        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid;
            }
            else if(nums[mid] >= target){
                right = mid;
            }
        }
        if(nums[left] == target){
            res[0] = left;
        }
        else if(nums[right] == target){
            res[0] = right;
        }
        else{
            return new int[]{-1, -1};
        }
        right = nums.length - 1;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > target){
                right = mid;
            }
            else if(nums[mid] <= target){
                left = mid;
            }
        }
        if(nums[right] == target){
            res[1] = right;
        }
        else if(nums[left] == target){
            res[1] = left;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}