class Solution {
    public void func(List<Integer> input,List<Integer> output,List<List<Integer>> ans){

        ans.add(new ArrayList<>(output)); // adding elements to the power set -->> ans 
        if(input.size()==0){
            return;
        }
        for(int i=0;i<input.size();i++){

            if(i>0 && input.get(i)==input.get(i-1)){
                continue;
            }

            List<Integer> ip = new ArrayList<>(input);
            List<Integer> op = new ArrayList<>(output);

            op.add(ip.get(i));  // adding elements from input list to the output list
            ip.subList(0,i+1).clear();  // for deleting elements from the input list

            func(ip,op,ans);
            
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
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






