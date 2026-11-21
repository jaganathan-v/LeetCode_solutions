class Solution {
    
    public int climbStairs(int n) {
    //     int temp = n;
    // if(n == 2 )  return 2;
    // if(n == 3) return 3;
    // if(n == 1) return 1;
    // if(n == 4) return 5;
    // if(n == 5) return 8;
    // if(n == 6) return 13;
    // if(n == 7) return 21;
    // if(n == 8) return 34;
    // if(n == 9) return 55;
    // return 0;
    if(n<4){
        return n;
    }
    int[] dp = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 3;
    for(int i=4;i<=n;i++){
        dp[i] = dp[i-1] + dp[i-2];
    }

    return dp[n];
    }
}