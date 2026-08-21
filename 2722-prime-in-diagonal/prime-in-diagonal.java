class Solution {
    		public static boolean isPrime(int n) {
			if(n<2) return false;
			for(int i=2;i*i <= n;i++) {
				if(n%i == 0) return false;
			}
			return true;
            }
    public int diagonalPrime(int[][] nums) {
      int max = 0;
      for(int i=0;i<nums.length;i++){
        for(int j =0;j<nums[i].length;j++){
            if(i == j || i+j == nums.length-1) {
				if(isPrime(nums[i][j])) {
					max = Math.max(max,nums[i][j]);
				}
			}
        }
      }
      return max;  
    }
}