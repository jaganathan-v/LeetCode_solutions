class Solution {
    public static int setbit(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i =2;i*i<=n;i++){
            if(n % i ==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count1 = 0;
    for(int i = left;i<=right;i++){
        int value = setbit(i);
        if(isPrime(value)){
            count1++;
        }
    } 
    return count1;  
    }
}