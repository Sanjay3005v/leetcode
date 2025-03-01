//507. Perfect Number


class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1;
		int sum=0;
		while(num>i) {
			if(num%i==0) {
			 sum+=i;
			}
			i++;
		}
		if(num==sum) {
		    return true;
		}
		else {
			return false;
		}
    }
}
