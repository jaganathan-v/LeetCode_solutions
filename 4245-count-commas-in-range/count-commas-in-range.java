class Solution {
    public int countCommas(int n) {
        int count = 0;
    if(n>999 && n<=100000){
        count = n - 999;

    } 
    return count ;
    }
}