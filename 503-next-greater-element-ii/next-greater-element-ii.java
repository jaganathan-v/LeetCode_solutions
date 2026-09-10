class Solution {
    public int[] nextGreaterElements(int[] nums) {
     Stack<Integer> stack = new Stack<>();
			 int[] result = new int[nums.length];
			 Arrays.fill(result,-1);
			 
			 for(int i=0;i<nums.length*2;i++) {
				 
				 if(stack.isEmpty()) {
					 stack.push(i%nums.length);
				 }else
					 {
					 while(!(stack.isEmpty()) && nums[i%nums.length]>nums[stack.peek()]) {
					 
					 result[stack.peek()] = nums[i%nums.length];
					stack.pop();
				 }
				 stack.push(i%nums.length);
			     }
			 }
    return result;     
    }
}