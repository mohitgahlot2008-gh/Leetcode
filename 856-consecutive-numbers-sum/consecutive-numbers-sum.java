class Solution {
    public int consecutiveNumbersSum(int n) {
        int ans=0;
        for(int i=1;i*(i+1)/2<=n;i++){
            int x=n-i*(i-1)/2;
            if(x%i==0){
                ans++;
            }
        }
        return ans;
    }
}