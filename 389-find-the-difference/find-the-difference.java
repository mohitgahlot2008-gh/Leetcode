class Solution {
    public char findTheDifference(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            st.push(ch);
        }
        for(char ch:t.toCharArray()){
            if(st.contains(ch)){
                st.remove((Character) ch);
            }else{
                return ch;
            }
        }
        return ' ';
    }
}