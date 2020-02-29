//Convert a non-negative integer to its english words representation. Given inpu
//t is guaranteed to be less than 231 - 1. 
//
// Example 1: 
//
// 
//Input: 123
//Output: "One Hundred Twenty Three"
// 
//
// Example 2: 
//
// 
//Input: 12345
//Output: "Twelve Thousand Three Hundred Forty Five" 
//
// Example 3: 
//
// 
//Input: 1234567
//Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven
//"
// 
//
// Example 4: 
//
// 
//Input: 1234567891
//Output: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven 
//Thousand Eight Hundred Ninety One"
// 
// Related Topics Math String


package leetcode.editor.en;
public class IntegerToEnglishWords {
  public static void main(String[] args) {
       Solution solution = new IntegerToEnglishWords().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String numberToWords(int num){
        if(num == 0)
            return "Zero";
        return __numberToWords(num);
    }
    public String __numberToWords(int num) {
        int hundred = 100;
        int thousand = 1000;
        int million = 1000000;
        int billion = 1000000000;
        if(num >= billion){
            int beyond = num / billion;
            int below = num % billion;
            String out = __numberToWords(beyond) + " Billion " + __numberToWords(below);
            return out.trim();
        }
        else if(num >= million){
            int beyond = num / million;
            int below = num % million;
            String out = __numberToWords(beyond) + " Million " + __numberToWords(below);
            return out.trim();
        }
        else if(num >= thousand){
            int beyond = num / thousand;
            int below = num % thousand;
            String out = __numberToWords(beyond) + " Thousand " + __numberToWords(below);
            return out.trim();
        }
        else if(num >= hundred){
            int beyond = num / hundred;
            int below = num % hundred;
            String out = __numberToWords(beyond) + " Hundred " + __numberToWords(below);
            return out.trim();
        }
        else{
            return tensToWords(num);
        }
    }

    public String tensToWords(int num){
        int tens = num / 10;
        int ones = num % 10;
        String out = "";
        if(tens > 1){
            switch (tens){
                case 9:
                    out += "Ninety";
                    break;
                case 8:
                    out += "Eighty";
                    break;
                case 7:
                    out += "Seventy";
                    break;
                case 6:
                    out += "Sixty";
                    break;
                case 5:
                    out += "Fifty";
                    break;
                case 4:
                    out += "Forty";
                    break;
                case 3:
                    out += "Thirty";
                    break;
                case 2:
                    out += "Twenty";
                    break;
            }
        }
        else if (tens == 1){
            switch(ones){
                case 9:
                    out += "Nineteen";
                    break;
                case 8:
                    out += "Eighteen";
                    break;
                case 7:
                    out += "Seventeen";
                    break;
                case 6:
                    out += "Sixteen";
                    break;
                case 5:
                    out += "Fifteen";
                    break;
                case 4:
                    out += "Fourteen";
                    break;
                case 3:
                    out += "Thirteen";
                    break;
                case 2:
                    out += "Twelve";
                    break;
                case 1:
                    out += "Eleven";
                    break;
                case 0:
                    out += "Ten";
                    break;
            }

        }
        else{
            switch(ones){
                case 9:
                    out += "Nine";
                    break;
                case 8:
                    out += "Eight";
                    break;
                case 7:
                    out += "Seven";
                    break;
                case 6:
                    out += "Six";
                    break;
                case 5:
                    out += "Five";
                    break;
                case 4:
                    out += "Four";
                    break;
                case 3:
                    out += "Three";
                    break;
                case 2:
                    out += "Two";
                    break;
                case 1:
                    out += "One";
                    break;
            }
        }
        if(tens > 1 && ones != 0){
            return out + " " + tensToWords(ones);
        }
        return out;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}