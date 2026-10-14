class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell;
        int pro=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(prices[i],buy);
            pro=Math.max((prices[i]-buy),pro);
            }
                    return pro;

        }
    }

