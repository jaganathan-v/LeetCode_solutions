class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i =0;
    while(i<nums.length){
        int index = nums[i]-1;
        if(nums[i] != nums[index]){
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }else{
            i++;
        }
    }
    List<Integer> ls = new ArrayList<Integer>();
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            ls.add(nums[j]);
        }
    } 
    return ls; 
    }
}