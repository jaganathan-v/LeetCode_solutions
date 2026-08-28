class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n];
    for(int[] booking:bookings){
        int start = booking[0];
        int end = booking[1];
        int value= booking[2];
        arr[--start] += value;
        if(end<n) arr[end]-=value;
    }   
    for(int i=1;i<n;i++){
        arr[i]+=arr[i-1];
    }  
    return arr;
    }
}