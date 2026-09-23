class Solution {
    public int largestRectangleArea(int[] heights) {
    Deque<Integer> stack = new ArrayDeque<>();
    int maxArea = 0;
    for(int i=0;i<=heights.length;i++){
        int h = (i == heights.length)?0:heights[i];
        while(!stack.isEmpty() && heights[stack.peek()] >=h ){
           int height = heights[stack.poll()];
           int width = (stack.isEmpty()) ? i: i - stack.peek() -1;
           maxArea = Math.max(maxArea , width*height);
        }
        stack.push(i);
    }  
    return maxArea;
    }
}