class Solution {
    public int maxDepth(String s) {
        int x=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                x++;
            }else if(ch==')'){
                x--;
            }
            ans=Math.max(ans,x);
        }
        return ans;
    }
}