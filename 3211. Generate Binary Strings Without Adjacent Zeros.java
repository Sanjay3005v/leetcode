//3211. Generate Binary Strings Without Adjacent Zeros


class Solution {
    public List<String> validStrings(int n) {
        List<String> list =  new ArrayList<>();
        if(n==0){
            return list;
        } 
        list.add("0");
        list.add("1");
        return helper(list,n-1);
    }
    public List<String> helper(List<String> list , int n){
        if(n==0){
            return list;
        }
        List<String> list1 = new ArrayList<>();
        for(String str : list){
            if(str.charAt(str.length()-1)=='1'){
                list1.add(str+"0");
            }
            list1.add(str+"1");
        }
        return helper(list1,n-1);
    } 
}
