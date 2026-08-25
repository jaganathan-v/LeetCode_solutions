class Solution {
    public int maxArea(int[] height) {
       int max = Integer.MIN_VALUE;
       int left = 0;
       int right = height.length -1;
       while(left<=right){
        int length = Math.min(height[left],height[right]);
        int breadth = right - left;
        int area = length*breadth;
        max = Math.max(area,max);
         if(height[left]<height[right]) {
			 left++;
		 }else {
			 right--;
		 }
       }
       return max;
    }
}