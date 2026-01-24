class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, result = 0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i;j<prices.length;j++)
            {
                result = prices[j] - prices[i];
                if(max<result)
                {
                    max = result;
                }
            }
        }

        return max;
    }
}