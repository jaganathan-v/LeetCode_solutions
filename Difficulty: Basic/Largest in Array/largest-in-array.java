class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        for(int n:arr){
            max = Math.max(max,n);
        }
        return max;
    }
}
