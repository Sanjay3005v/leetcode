//1431. Kids With the Greatest Number of Candies


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max=0;
        for(int i:candies){
            max=Math.max(i,max);
        }
        for(int i:candies){
            if((i+extraCandies)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
