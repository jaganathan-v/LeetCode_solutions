class Solution {
    public int largestInteger(int[] nums, int k) {
    int[] arr = new int[51];

    for(int i = 0;i<nums.length-k+1;i++){
        boolean[] seen = new boolean[51];
        for(int j = i;j<i+k && j<nums.length;j++){
            if (!seen[nums[j]]){
               arr[nums[j]]++;
               seen[nums[j]] = true;
            } 
        }
    } 
    int high =-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == 1){
           if(high<i) high = i;
        }
    } 
    return high;
    }
}