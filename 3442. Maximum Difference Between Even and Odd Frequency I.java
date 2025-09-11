//3442. Maximum Difference Between Even and Odd Frequency I


class Solution {
    public int maxDifference(String s) {
        int oddMax=1;
        int evenMin=s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int freq : map.values()){
            if(freq%2==0){
                evenMin = Math.min(evenMin,freq);
            }
            else{
                oddMax = Math.max(oddMax,freq);
            }
        }
        return oddMax-evenMin;
    }
}
