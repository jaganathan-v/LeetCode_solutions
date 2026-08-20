class Solution {
    public int[] resultArray(int[] nums) {
    int[] arr1= new int[nums.length];
    int[] arr2 = new int[nums.length];
    arr1[0] = nums[0];
    arr2[0] = nums[1];
    int j = 1;
    int k = 1;
    for(int i=2;i<nums.length;i++){
          if(arr1[j-1] > arr2[k-1]){
              arr1[j] = nums[i];
              j++;
          }else{
            arr2[k] = nums[i];
            k++;
          }
    }
    int t= 0;
    int[] result = new int[nums.length];

    for(int i=0;i<nums.length;i++){
        if(i<j){
         result[i] = arr1[i];
        }else {
            result[i] = arr2[t];
            t++;
        }
       
    }
    return result;
    }
}