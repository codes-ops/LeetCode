import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer>  nums = new Stack<>();
        for(String op: operations){

            if(op.equals("C")){
                nums.pop();
            }
            else if(op.equals("D")){
                nums.push(nums.peek()*2);
            }
            else if(op.equals("+")){
                int last = nums.pop();
                int secondlast = nums.peek();
                nums.push(last);
                nums.push(last+secondlast);
            }
            else{
                nums.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int elem: nums){
            sum+=elem;
        }
        return sum;
    }
}