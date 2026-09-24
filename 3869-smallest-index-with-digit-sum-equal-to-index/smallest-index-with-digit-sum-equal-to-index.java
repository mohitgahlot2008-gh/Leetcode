class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
                int digsum=0;
                while(nums[i]>0){
                    int dig=nums[i]%10;
                    digsum+=dig;
                    nums[i]/=10;
                }
                if(digsum==i){
                    return i;
                }
            }
        return -1;
    }
}