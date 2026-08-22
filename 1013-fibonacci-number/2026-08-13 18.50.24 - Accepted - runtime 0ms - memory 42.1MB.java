class Solution {
    public int fib(int n) {
        if(n == 1) return 1;
        
    int a = 0;
    int b = 1;
    int c = 0;
    int i=0;
    while(i<n-1){
        c =a+b;
        a = b;
        b = c;
        i++;
    }
    return c;
    }
}