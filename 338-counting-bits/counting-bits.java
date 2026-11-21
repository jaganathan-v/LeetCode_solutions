class Solution {
    public int[] countBits(int n) {
    if(n==0){
        return new int[]{0};
    }
    if(n==1){
        return new int[]{0,1};
    }
    
     int[] result = new int[n+1];
     result[0] = 0;
     result[1] = 1;
     result[2] = 1;
     for(int i=3;i<=n;i++){
        if(((i-1)&i) != 0){
             int exponent = 31 - Integer.numberOfLeadingZeros(i);
             result[i] = result[i - (1 << exponent)] + 1;
        }else{
            result[i] = 1;
        }
     }
     return result;
    }
}