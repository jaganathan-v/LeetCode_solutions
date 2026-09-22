class Solution {
    public int maxProfit(int[] prices) {
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