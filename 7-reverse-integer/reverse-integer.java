class Solution {
    public static int rever(int num){
        int rev =0;
        int temp = num;
        while(temp != 0){
            int rem = temp%10;
            if(rev>Integer.MAX_VALUE/10) return 0;
            if (rev < Integer.MIN_VALUE / 10) return 0;
            rev=rev*10+rem;
            temp/=10;
        }
        return rev;
    }
    public int reverse(int x) {
    // int i=0;
    // if(x>=0)  i=1;
    // else i = -1;
    int num = rever(x);
    return num;
    }
}