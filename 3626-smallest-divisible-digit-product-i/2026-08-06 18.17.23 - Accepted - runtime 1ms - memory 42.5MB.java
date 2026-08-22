class Solution {
    public static int digits(int num){
        int multiply =1;
        while(num!=0){
            int rem = num%10;
            multiply *= rem;
            num /= 10;
        }
        return multiply;
    }
    public int smallestNumber(int n, int t) {
    while(true){
        if(digits(n)%t == 0){
          return n;
        } 
        n++;
    }
}
}