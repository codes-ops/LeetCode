class Solution {
    public void func(List<Integer> input,List<Integer> output,List<List<Integer>> ans){
         if(input.size()==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        for(int i=0;i<input.size();i++){
            List<Integer> ip = new ArrayList<>(input);
            List<Integer> op = new ArrayList<>(output);

            op.add(ip.get(i));  
            ip.remove(i);  

            func(ip,op,ans);

        }


    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int a: nums){
            input.add(a);
        }
        func(input,output,ans);

        return ans;
        
    }
}



