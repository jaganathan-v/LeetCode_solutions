class Solution {
    public int[] finalPrices(int[] prices) {
     int[] result =prices;
	 Stack<Integer> stack = new Stack<>();
     for(int i=0;i<prices.length;i++) {
		if(stack.isEmpty()) {
			 stack.push(i);
		 }else {
				while(!(stack.isEmpty()) && prices[i]<=prices[stack.peek()]) {
					 int value = prices[stack.peek()] - prices[i];
					result[stack.peek()] = value;
					stack.pop();
				 }
				 stack.push(i);
				 }
			 }  
     return result;  
    }
}