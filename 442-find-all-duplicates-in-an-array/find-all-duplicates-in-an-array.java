class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      int [] n=new int[nums.length+1];
      List<Integer> ans = new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        n[nums[i]]++;
      }
      for(int i=1;i<=nums.length;i++){
        if(n[i]==2){
            ans.add(i);
        }
      }
      return ans;
    }
}