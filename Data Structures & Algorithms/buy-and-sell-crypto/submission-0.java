class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int pf = 0;
        int min = Integer.MAX_VALUE;
        for(int p : prices)
        {
            if(p<min) min = p;
            else pf = Math.max(pf , p-min);
        }
        return pf;
    }
}
