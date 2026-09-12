class Solution {
    public int maximumGap(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        if(nums.length!=1){
            for(int i=0;i<nums.length-1;i++){
                int x=nums[i+1]-nums[i];
                max=Math.max(max,x);
            }
            return max;
        }
        return 0;
    }
}