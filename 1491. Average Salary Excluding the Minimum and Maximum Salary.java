//  1491. Average Salary Excluding the Minimum and Maximum Salary


class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE,max=0;
        double sum=0;
        for(int i:salary){
            max=Math.max(max,i);
            min=Math.min(min,i);        
            sum+=i;
        }
        return (sum-min-max)/(salary.length-2);
    }
}
