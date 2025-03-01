//9. Palindrome Number


class Solution {
    public boolean isPalindrome(int num) {
        int rev = 0;
        int temp=num;
		while(num>0) {
			int r = num%10;
			num/=10;
			rev=(rev*10)+r;
		}
		if(rev==temp) {
			return true;
		}
		else {
			return false;
		}
    }
}
