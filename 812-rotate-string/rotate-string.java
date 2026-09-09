class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String sf=s+s;
        if(sf.contains(goal)){
            return true;
        }
        return false;
    }
}