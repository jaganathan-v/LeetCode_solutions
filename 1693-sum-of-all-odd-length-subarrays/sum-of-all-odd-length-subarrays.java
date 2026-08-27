class Solution {
    public static boolean isOdd(int num){
        if((num & 1) == 1){
            return true;
        }else{
            return false;
        }
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
    for(int i = 1;i<arr.length;i++){
        arr[i] += arr[i - 1];
    } 
    for(int start = 0;start<arr.length;start++){
        for(int end = start;end<arr.length;end++){
            int length = end - start +1;
            if(isOdd(length)){
               if(start == 0) sum+=arr[end];
               else sum+=arr[end] - arr[start - 1];
            }
        }
    } 
    return sum;
    }
}