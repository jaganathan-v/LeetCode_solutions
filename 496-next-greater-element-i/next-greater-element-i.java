class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] result  = new int[nums2.length];
    Arrays.fill(result,-1);
    Deque<Integer> stack = new ArrayDeque<>();
    for(int i=0;i<nums2.length;i++){
        while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i]){
            result[stack.pop()] = nums2[i];
        }
        stack.push(i);
    }
    int[] result2 = new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i] == nums2[j]){
              result2[i] = result[j];
            }
        }
    }
    return result2;
    }
}