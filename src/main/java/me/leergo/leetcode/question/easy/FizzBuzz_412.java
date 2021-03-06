//412 - Fizz Buzz	 

//写一个程序，输出从 1 到 n 数字的字符串表示。 
//
// 1. 如果 n 是3的倍数，输出“Fizz”； 
//
// 2. 如果 n 是5的倍数，输出“Buzz”； 
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。 
//
// 示例： 
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
// 
// 👍 72 👎 0

package me.leergo.leetcode.question.easy;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz_412 {
    public static void main(String[] args) {
        Solution solution = new FizzBuzz_412().new Solution();
        solution.fizzBuzz(15);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> fizzBuzz(int n) {
            String[] arr = new String[n];
            
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) arr[i - 1] = "FizzBuzz";
                else if (i % 3 == 0) arr[i - 1] = "Fizz";
                else if (i % 5 == 0) arr[i - 1] = "Buzz";
                else arr[i - 1] = i + "";
            }
            
            System.out.println(Arrays.toString(arr));
            
            return Arrays.asList(arr);
            
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
}