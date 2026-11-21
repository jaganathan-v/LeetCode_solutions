class Solution {
    public static int longest_Substring(String str1,String str2) {
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		int[][] dp = new int[string1.length+1][string2.length+1];
		for(int i=0;i<=string1.length;i++) {
			for(int j=0;j<=string2.length;j++) {
				if( i == 0 || j == 0) {
					dp[i][j] = 0;
					
				}else {
					if(string1[i-1] == string2[j-1]) {
						dp[i][j] = dp[i-1][j-1]+1;
						
					}else {
						dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
					
					}
				}
			}
			
		}
		return dp[string1.length][string2.length];
	}
    public int longestCommonSubsequence(String text1, String text2) {
       return longest_Substring(text1,text2); 
    }
}