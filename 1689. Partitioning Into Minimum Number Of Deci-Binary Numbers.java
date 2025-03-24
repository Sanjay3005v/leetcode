//1689. Partitioning Into Minimum Number Of Deci-Binary Numbers


class Solution {
    public int minPartitions(String n) {
        char max='0';
        for(char i:n.toCharArray()){
            if(i>max){
                max=i;
            }
        }
        return Character.getNumericValue(max);
    }
}
