class Solution {
    public int sqsum(int n){
        int sum=0;
        while(n>0){
            int dig =n%10;
            sum=sum+(dig*dig);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n!=1){
            if(hs.contains(n)){
                return false;
            }
            hs.add(n);
            n = sqsum(n);
        }
        return true;
    }
}