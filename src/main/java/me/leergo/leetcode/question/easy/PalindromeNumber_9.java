//9 - 回文数	 

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 
// 👍 1216 👎 0

package me.leergo.leetcode.question.easy;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber_9().new Solution();
        System.out.println(solution.isPalindrome(1000021));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            
            if (x < 10) {
                return true;
            }
            
            String num = String.valueOf(x);
            int len = num.length();
            
            for (int i = 0; i <= num.length() / 2 - 1; i++) {
                if (num.charAt(i) != num.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}