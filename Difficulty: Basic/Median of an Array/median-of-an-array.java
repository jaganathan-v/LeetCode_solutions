class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int index =0 ;
        double value;
        int mid = (0 +arr.length)/2;
        if(arr.length %2 == 0){
           return  value = (double)(arr[mid] + (arr[mid -1]))/2;
        }else{
           return arr[mid]; 
        }
        
    }
}
