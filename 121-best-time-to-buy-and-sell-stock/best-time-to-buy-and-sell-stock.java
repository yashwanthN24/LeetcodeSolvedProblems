class Solution {
    public int maxProfit(int[] prices) {
        // buyprice to track the lowest buyprice 
        
        // first lets assume our buyprice is maximum we bought the stock for a highest price 

        int buyprice = Integer.MAX_VALUE ; 

        // to keep track of the maxprofit 
        int maxprofit = 0 ; 

        // iterate through the prices of each day to find the lowest buyprice and highest selling to get a maximum profit 

        for(int i = 0 ; i<prices.length; i++){

            // if our buy price is less than selling price then we incurr a profit 
            if(buyprice < prices[i]){
        // which is calculated as profit = sellingprice = cost  of  stock that day i.e price[i] - buyprice of stock 
            int profit = prices[i] - buyprice ; 
            // now compare if todays profit is the max profit we obtained 
            maxprofit = Math.max(maxprofit , profit);
            }
            else{
                // i.e when no profit incurred i.e when selling price prices[i] is  less than buyprice we inccur a loss so we buy the stock at its current stock price of that day 
                buyprice = prices[i];
                // prices[i] is current price of stock on a particular ith day 


            }
       

        }

        return maxprofit ; 

    }
}