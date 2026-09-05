import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int l=str.length;
        String[] ns=new String[l];
        int j=0;
        for(int i=l-1;i>=0;i--){
                ns[j]=str[i];
                j++;
            }
        return String.join(" ", ns);
    }
}