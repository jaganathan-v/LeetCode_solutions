class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] answer = new int[nums.length];
    int[] prefix_Product = new int[nums.length];
    int[] suffix_Product = new int[nums.length];
    prefix_Product[0] = 1; 
    for(int i=1;i<nums.length;i++){
      prefix_Product[i] = prefix_Product[i-1]  * nums[i-1];
    }

    suffix_Product[nums.length - 1] = 1;
    for(int i=nums.length - 2;i>=0;i--){
        suffix_Product[i] = suffix_Product[i+1] * nums[i+1];
    }

    answer[0] = suffix_Product[0];
    answer[nums.length - 1] = prefix_Product[nums.length - 1];
    for(int i=1;i<nums.length;i++){
        answer[i] = prefix_Product[i] * suffix_Product[i];
    }
    // for(int i=0;i<nums.length;i++){
    //     int product = 1;
    //     for(int j = 0 ;j<nums.length;j++){
    //         if(i == j) continue;
    //         product *= nums[j];
    //     }
    //     answer[i] = product;
    // }  
    return answer;  
    }
}