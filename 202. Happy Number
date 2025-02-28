//202. Happy Number


class Solution {
    public boolean isHappy(int num) {
        int temp=num;
		int res1;
		while(num!=1 && num!=4){
		res1=sum(num);
		num=res1;
		}
		if(num==1) {
			return true;
		}
		else {
			return false;
		}
    }
        public static int sum(int num) {
		
		int temp=num;
		int sum =0;
		int prod=1;
		while(temp>0) {
			int a=temp%10;
			temp/=10;
			prod=a*a;
			sum+=prod;
		}
		return sum;
	}
    
}
