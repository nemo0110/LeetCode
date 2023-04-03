/*

Given an integer x, return true if x is a palindrome and false otherwise.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.


Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.


Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
Constraints:
-231 <= x <= 231 - 1

*/

    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder(String.valueOf(x));
        s.reverse();
        return  s.toString().equals(String.valueOf(x)) ? true : false;
    }

    public boolean isNumberPalindrome(int dividend) {
    	/* if the number is negative to be palindrome it should end with a '-' or if the number 
        is not 0 and the division by ten has no rest the number ends with a 0, 
        to be palindrome it should begin with a '0'
      */
        if (dividend<0 || (dividend!=0 && dividend%10==0)) {
        	System.out.println(false);
        	return false;
        }
        int remainder = 0;
        while (dividend>remainder){
        	remainder = remainder*10 + dividend%10;
        	dividend = dividend/10;
        }
        boolean result = (dividend==remainder || dividend==remainder/10);
        System.out.println(result);
        return result;
    }
