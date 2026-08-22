class Solution {
    public static int digits(int num){
        int digits =0;
        if((num>=10 && num<=99)||(num>=1000 && num<=9999)||(num== 100000)) digits++;
        return digits%2==0?0:1;
    }
    public int findNumbers(int[] nums) {
    int value= 0;
    for(int n:nums){
        value+=digits(n);
    } 
    return value;
    }
}