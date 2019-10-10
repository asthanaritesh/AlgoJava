//Problem is exactly same as CP.MaxArray.java but entirely different solution
//Maximum profit by buying and selling a share at most k times
//In share trading, a buyer buys shares and sells on a future date. Given the stock price of n days, the trader is allowed to make at most k transactions, where a new transaction can only start after the previous transaction is complete, find out the maximum profit that a share trader could have made.
//Examples Input:  
//Price = [10, 22, 5, 75, 65, 80]
//    K = 2
//Output:  87
//Trader earns 87 as sum of 12 and 75 Buy at price 10, sell at 22, buy at 5 and sell at 80
//Input:  
//Price = [12, 14, 17, 10, 14, 13, 12, 15]
//    K = 3
//Output:  12
//Trader earns 12 as the sum of 5, 4 and 3 Buy at price 12, sell at 17, buy at 10 and sell at 14 and buy at 12 and sell at 15
//Input:  
//Price = [100, 30, 15, 10, 8, 25, 80]
//    K = 3
//Output:  72
//Only one transaction. Buy at price 8 and sell at 80.
//Input:  
//Price = [90, 80, 70, 60, 50]
//    K = 1
//Output:  0
//Not possible to earn. 
//In this post, we are only allowed to make at max k transactions. The problem can be solve by using dynamic programming.
//Let profit[t][i] represent maximum profit using at most t transactions up to day i (including day i). Then the relation is:
//profit[t][i] = max(profit[t][i-1], max(price[i] – price[j] + profit[t-1][j]))
//          for all j in range [0, i-1]
//profit[t][i] will be maximum of –
//profit[t][i-1] which represents not doing any transaction on the ith day.
//Maximum profit gained by selling on ith day. In order to sell shares on ith day, we need to purchase it on any one of [0, i – 1] days. 
//If we buy shares on jth day and sell it on ith day, max profit will be price[i] – price[j] + profit[t-1][j] where j varies from 0 to i-1. 
//Here profit[t-1][j] is best we could have done with one less transaction till jth day.
package DP;

public class MaxTradingProfit {
	static int maxProfit(int[] price, int n, int k) {

		// table to store results of subproblems profit[t][i] stores maximum profit using atmost t transactions up to day i (including day i)
		int[][] profit = new int[k + 1][n + 1];

		// For day 0, you can't earn money irrespective of how many times you trade
		for (int i = 0; i <= k; i++)
			profit[i][0] = 0;

		// profit is 0 if we don't do any transation (i.e. k =0)
		for (int j = 0; j <= n; j++)
			profit[0][j] = 0;

		// fill the table in bottom-up fashion
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j < n; j++) {
				int max_so_far = 0;
				for (int m = 0; m < j; m++)
					max_so_far = Math.max(max_so_far, price[j] - price[m] + profit[i - 1][m]);
				profit[i][j] = Math.max(profit[i][j - 1], max_so_far);
			}
		}
		return profit[k][n - 1];
	}

	public static void main(String[] args) {
		int k = 2; // times you can buy ans sell.  Number of transactions.
		int[] price = { 10, 22, 5, 75, 65, 80 };
		int n = price.length;
		System.out.println("Maximum profit is: " + maxProfit(price, n, k));
	}
}
