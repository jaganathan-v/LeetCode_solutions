class Solution {
    public int maxProfit(int[] prices) {
        // int result = 0;
        
        // int low = prices[0];
    // for(int i=0;i<prices.length;i++){
    //        low = prices[i];
    //     for(int j = i;j<prices.length;j++){
    //        if(prices[j]>low){
    //           int profit = prices[j] - low;
    //           result = Math.max(result,profit); 
    //        } 
    //     }
    // }
    int min = Integer.MAX_VALUE;
    int profit = 0;
    int result = 0;
    for(int i=0;i<prices.length;i++){
        min = Math.min(prices[i],min);
        profit = prices[i] - min;
        if(result<profit){
            result = profit;
        }
    }
    return result;   
    }
}