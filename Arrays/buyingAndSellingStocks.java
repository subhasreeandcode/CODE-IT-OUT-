// leetcode problem number : 121
// best time to buy and sell stocks

/* testcases :
    prices : [7,1,5,3,6,4] --> output : 5
    prices : [7,6,4,3,1] --> output : 0 */

class main
{
    public static void main(String[]args)
    {
        System.out.println(Solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(Solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}

class Solution 
{
    public static int maxProfit(int[] prices)
    {
        int costPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices)
        {
            costPrice = Math.min(costPrice, price);
            int profit = price - costPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}