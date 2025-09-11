//3522. Calculate Score After Performing Instructions


class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long sum=0;
        int i=0;
        boolean[] arr = new boolean[instructions.length];
        while(i<instructions.length && i>=0 && !arr[i]){
            String str = instructions[i];
            arr[i]=true;
            if(str.equals("add")){
                sum+=values[i++];
            }
            if(str.equals("jump")){
                i+=values[i];
            }
        }
        return sum;
    }
}
