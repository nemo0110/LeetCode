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

    public boolean isNumberPalindrome(int x) {
    	/* if the number is negative to be palindrome it should end with a '-' and that's impossible
        or if the number is not 0 and the division by ten has no rest the number ends with a 0 
        and to be palindrome it should begin with a '0'
      */
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
        	rev = rev*10 + x%10;
        	x = x/10;
        }
        boolean result = (x==rev || x==rev/10);
        System.out.println(result);
        return result;
    }
