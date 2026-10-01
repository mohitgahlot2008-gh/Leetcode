class Solution {
    public boolean isValid(String s) {
        Stack<Character> c=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                c.push(')');
            }else if(ch=='{'){
                c.push('}');
            }else if(ch=='['){
                c.push(']');
            }else if(c.isEmpty() || c.pop()!=ch){
                return false;
            }
        }
        return c.isEmpty();
    }
}