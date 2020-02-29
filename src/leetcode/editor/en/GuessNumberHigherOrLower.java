//We are playing the Guess Game. The game is as follows: 
//
// I pick a number from 1 to n. You have to guess which number I picked. 
//
// Every time you guess wrong, I'll tell you whether the number is higher or low
//er. 
//
// You call a pre-defined API guess(int num) which returns 3 possible results (-
//1, 1, or 0): 
//
// 
//-1 : My number is lower
// 1 : My number is higher
// 0 : Congrats! You got it!
// 
//
// Example : 
//
// 
// 
//Input: n = 10, pick = 6
//Output: 6
// 
// 
// Related Topics Binary Search


package leetcode.editor.en;
public class GuessNumberHigherOrLower {
  public static void main(String[] args) {
       Solution solution = new GuessNumberHigherOrLower().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
class GuessGame {
        public int guess(int guess) {
            int num = 1;
            if (num > guess) return 1;
            if (num < guess) return -1;
            if (num == guess) return 0;
        }
}

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left <= right){
            int mid1 = left + (right - left) / 2;
            int mid2 = right - (right - left) / 2;
            if(guess(mid1) == 0){
                return mid1;
            }
            if(guess(mid2) == 0){
                return mid2;
            }
            else if(guess(mid1) == -1){
                right = mid1 - 1;
            }
            else if(guess(mid2) == 1){
                left = mid2 + 1;
            }
            else{
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}