class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(String sc:operations){
            if(sc.equals("+")){
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
            }else if(sc.equals("D")){
                s.push(s.peek()*2);
            }else if(sc.equals("C")){
                s.pop();
            }else{
                s.push(Integer.parseInt(sc));
            }
        }
        int sum=0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}