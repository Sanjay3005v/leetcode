//2390. Removing Stars From a String

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder("");
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        str.reverse();
        return str.toString();
    }
}
